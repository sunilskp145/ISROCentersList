package com.ISRO.centers.controller;

import com.ISRO.centers.response.CenterResponse;
import com.ISRO.centers.service.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CenterController {

    @Autowired
    CentreService centreService;

    @GetMapping("centerList")
    public CenterResponse centerResponse(){
        CenterResponse response = centreService.getResponse();
        return response;
    }

}
