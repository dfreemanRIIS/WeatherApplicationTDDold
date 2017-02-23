package com.example.dfreeman.weatherapplicationtdd.Model;

public class LocationModel {
    private String location;

    public LocationModel() {
        location = "No location set!";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
