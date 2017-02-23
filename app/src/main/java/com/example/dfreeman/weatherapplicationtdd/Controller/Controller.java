package com.example.dfreeman.weatherapplicationtdd.Controller;

import com.example.dfreeman.weatherapplicationtdd.Model.LocationModel;

public class Controller {
    LocationModel locationModel;

    public Controller() {
        locationModel = new LocationModel();
    }

    public String getLocation() {
        return locationModel.getLocation();
    }

    public void setLocation(String location) {
        locationModel.setLocation(location);
    }
}
