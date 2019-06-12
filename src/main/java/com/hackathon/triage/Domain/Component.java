package com.hackathon.triage.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Component {
    @Id
    int id;
    String name;
    List<Issue> issues;
}
