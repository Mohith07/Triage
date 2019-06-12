package com.hackathon.triage.excelreader.domain;


import javax.persistence.Entity;
import java.util.List;

@Entity
public class ExcelTopic {
    String topicName;
    List<DeveloperPoints> points;
}
