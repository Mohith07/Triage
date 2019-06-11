package com.hackathon.triage.controller;

import com.hackathon.triage.config.JiraConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:arpit.srivastava@navis.com">Arpit Srivastava</a>
 */
@RestController
@RequestMapping("/triage")
public class BaseController {

    @Autowired
    private JiraConfig jiraConfig;

    @GetMapping
    public List<String> hitJiraApi() {
        RestTemplate restTemplate = new RestTemplate();

        System.out.println("URL ::: " + jiraConfig.getUrl());
        System.out.println("AUTH ::: " + jiraConfig.getAuthenticationToken());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", jiraConfig.getAuthenticationToken());
        HttpEntity<String> httpEntity = new HttpEntity<>("parameters", headers);

        try {
            ResponseEntity<String> result = restTemplate.exchange(jiraConfig.getUrl(),
                    HttpMethod.GET,
                    httpEntity,
                    String.class);

            System.out.println("HTTP STATUS CODE : " + result.getStatusCode());
            System.out.println(result.getBody());
        } catch(RestClientException e) {
            e.printStackTrace();
        }

        //TODO: Parse this String using JsonParser and do further work.

        return Collections.emptyList();

    }
}
