package com.hackathon.triage;

import com.hackathon.triage.controller.BaseExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TriageApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TriageApplication.class, args);
		BaseExecutor executor = applicationContext.getBean(BaseExecutor.class);
		executor.execute();
	}

}
