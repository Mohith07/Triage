package com.hackathon.triage;

import com.hackathon.triage.scheduler.BaseScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TriageApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TriageApplication.class, args);
		BaseScheduler executor = applicationContext.getBean(BaseScheduler.class);
		executor.execute();
	}

}
