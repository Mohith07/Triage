package com.hackathon.triage.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

<<<<<<< HEAD
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
=======
import javax.persistence.Entity;

@Data
@Entity
>>>>>>> develop
public class Expertise {
    ComponentEnum area;
    int points;
}
