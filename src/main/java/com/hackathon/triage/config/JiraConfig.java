package com.hackathon.triage.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:arpit.srivastava@navis.com">Arpit Srivastava</a>
 */
@Data
@NoArgsConstructor
@Component
public class JiraConfig {

    @Value("${jira.api}")
    private String url;

    @Value("${jira.authentication.token}")
    private String authenticationToken;
}
