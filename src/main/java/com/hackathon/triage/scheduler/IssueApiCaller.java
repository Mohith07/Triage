package com.hackathon.triage.scheduler;

import com.hackathon.triage.Domain.JiraAccount;
import com.hackathon.triage.config.JiraConfig;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class IssueApiCaller extends BaseExecutor implements Runnable{

    @Override
    public void execute() {
        RestTemplate restTemplate = new RestTemplate();
        JiraAccount jiraConfig = JiraConfig.getJiraAccountObject();
        StringBuilder issueUrl = new StringBuilder("https://jira.navis.com/rest/api/2/search?jql=project=10010");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth(jiraConfig.getUserName(), jiraConfig.getPassword());
        HttpEntity<String> httpEntity = new HttpEntity<>("parameters", headers);

        try {
            ResponseEntity<String> result = restTemplate.exchange(jiraConfig.getUrl(),
                    HttpMethod.GET,
                    httpEntity,
                    String.class);


        } catch (RestClientException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        execute();
    }
}
