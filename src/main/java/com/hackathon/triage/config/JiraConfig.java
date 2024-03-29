package com.hackathon.triage.config;

import com.hackathon.triage.Domain.JiraAccount;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author <a href="mailto:arpit.srivastava@navis.com">Arpit Srivastava</a>
 */
@Data
@NoArgsConstructor
@Component
public class JiraConfig {

    @Value("${jira.api}")
    private String url;

    @Value("${jira.authentication.username}")
    private String userName;

    @Value(("${jira.authentication.password}"))
    private String password;

    private static JiraAccount jiraAccount;

    @PostConstruct
    public void initialize() {
        jiraAccount = new JiraAccount(url, userName, password);
    }

    public static JiraAccount getJiraAccountObject() {
        return jiraAccount;
    }
}
