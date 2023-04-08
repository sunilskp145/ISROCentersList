package com.ISRO.centers.service;

import com.ISRO.centers.response.CenterResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CentreService {
    @Value("${Url}")
    private String isroURL;
    public CenterResponse getResponse(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<CenterResponse> response = new RestTemplate().exchange(isroURL , HttpMethod.GET, entity, CenterResponse.class);
        CenterResponse responseBody = response.getBody();
        return responseBody;
    }
}
