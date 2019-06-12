package com.hackathon.triage.excelreader.domain;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class ExcelComponent {
    String Component;
    List<ExcelTopic> topics;

    public ExcelComponent(String component) {
        Component = component;
    }
}
