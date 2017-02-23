package com.example.dfreeman.weatherapplicationtdd;

import com.example.dfreeman.weatherapplicationtdd.Controller.Controller;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ControllerUnitTest {
    private Controller controller;

    @Before
    public void setUp() {
        controller = new Controller();
    }

    @Test
    public void testLocation() {
        assertEquals("No location set!", controller.getLocation());
        controller.setLocation("Troy");
        assertEquals("Troy", controller.getLocation());
    }
}
