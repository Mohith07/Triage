package com.hackathon.triage.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
=======
import javax.persistence.Entity;
import javax.persistence.Id;
>>>>>>> develop
import java.util.List;

@Entity
@Data
<<<<<<< HEAD
@AllArgsConstructor
@NoArgsConstructor
public class Component {

    @Id
    private int componentId;

    private String componentName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "component_issue_table",
            joinColumns = @JoinColumn(name = "component_id", referencedColumnName = "componentId"),
            inverseJoinColumns = @JoinColumn(name = "issue_id", referencedColumnName = "issueId"))
    private List<Issue> issues;
=======
@Entity
public class Component {
    @Id
    int id;
    String name;
    List<Issue> issues;
>>>>>>> develop
}
