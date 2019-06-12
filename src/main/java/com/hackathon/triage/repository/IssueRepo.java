package com.hackathon.triage.repository;

import com.hackathon.triage.Domain.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class IssueRepo implements JpaRepository<Issue, String> {

}
