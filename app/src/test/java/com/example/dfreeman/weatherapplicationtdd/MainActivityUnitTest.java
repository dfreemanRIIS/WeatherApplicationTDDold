package com.example.dfreeman.weatherapplicationtdd;

import android.widget.Button;

import com.example.dfreeman.weatherapplicationtdd.View.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class MainActivityUnitTest {

    private MainActivity mainActivity;
    private Button setLocationButton;

    @Before
    public void setUp() {
        mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        setLocationButton = (Button)mainActivity.findViewById(R.id.setLocationButton);
    }

    @Test
    public void testButtons() {
        String locationButtonText = (String)setLocationButton.getText();
        assertEquals("Set Location", locationButtonText);
    }

    @Test
    public void testClicks() {
        setLocationButton.callOnClick();
    }
}
