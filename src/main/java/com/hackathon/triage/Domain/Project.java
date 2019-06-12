package com.hackathon.triage.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Project {
    int id;
    String name;
    String description;
    List<Component> components;
}
