package com.ISRO.centers.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CenterResponse {

    @JsonProperty("centres")
    private List<CenterList> centerLists;
}
