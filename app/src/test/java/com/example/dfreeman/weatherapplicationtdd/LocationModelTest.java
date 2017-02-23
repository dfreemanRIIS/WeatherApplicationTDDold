package com.example.dfreeman.weatherapplicationtdd;

import com.example.dfreeman.weatherapplicationtdd.Model.LocationModel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LocationModelTest {
    private LocationModel locationModel;

    @Before
    public void setUp() {
        locationModel = new LocationModel();
    }

    @Test
    public void testLocation() {
        assertEquals("No location set!", locationModel.getLocation());
        locationModel.setLocation("Troy");
        assertEquals("Troy", locationModel.getLocation());
    }
}
