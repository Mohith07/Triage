package com.hackathon.triage.Domain;

import lombok.Data;

import java.util.List;

@Data
public class User {
    String name;
    String email;
    List<Expertise> areaOfExpertise;

}
