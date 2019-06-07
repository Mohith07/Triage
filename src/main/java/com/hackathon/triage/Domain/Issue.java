package com.hackathon.triage.Domain;

import lombok.Data;

import java.util.List;

@Data
public class Issue {
    String argoNumber;
    String summary;
    String description;
    String assignee;
    int priority;
    List<User> commentedUsers;
    int watchCount;
    IssueType type;
}
