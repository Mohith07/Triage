package com.hackathon.triage.Domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Expertise {
    ComponentEnum area;
    int points;
}
