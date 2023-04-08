package com.ISRO.centers.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CenterList {

    private String id;
    private String name;

    @JsonProperty("Place")
    private String place;

    @JsonProperty("State")
    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
