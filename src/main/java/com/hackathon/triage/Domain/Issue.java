package com.hackathon.triage.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Issue {
    @Id
    String argoNumber;
    String summary;
    String description;
    String assignee;
    int priority;
    List<User> commentedUsers;
    int watchCount;
    IssueType type;
}
