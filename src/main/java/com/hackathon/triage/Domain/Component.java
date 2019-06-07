package com.hackathon.triage.Domain;

import lombok.Data;

import java.util.List;

@Data
public class Component {
    int id;
    String name;
    List<Issue> issues;
}
