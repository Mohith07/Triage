package com.hackathon.triage.Domain;

import lombok.Data;

import java.util.List;

@Data
public class Project {
    int id;
    String name;
    String description;
    List<Component> components;
}
