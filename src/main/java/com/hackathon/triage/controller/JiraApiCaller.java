package com.hackathon.triage.controller;

import com.hackathon.triage.Domain.JiraAccount;
import com.hackathon.triage.config.ApplicationContextHolder;
import com.hackathon.triage.config.JiraConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:arpit.srivastava@navis.com">Arpit Srivastava</a>
 */
public class JiraApiCaller implements Runnable {

    @Override
    public void run() {
        RestTemplate restTemplate = new RestTemplate();
        JiraAccount jiraConfig = JiraConfig.getJiraAccountObject();

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
        } catch (RestClientException e) {
            e.printStackTrace();
        }
    }
}
