package com.hackathon.triage.scheduler;

import com.hackathon.triage.Domain.JiraAccount;
import com.hackathon.triage.config.JiraConfig;
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
public class JiraApiCaller extends BaseExecutor implements Runnable {

    @Override
    public void run() {
        execute();
    }


    @Override
    public void execute() {
        RestTemplate restTemplate = new RestTemplate();
        JiraAccount jiraConfig = JiraConfig.getJiraAccountObject();

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
}
