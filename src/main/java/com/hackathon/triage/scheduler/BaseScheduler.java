package com.hackathon.triage.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:arpit.srivastava@navis.com">Arpit Srivastava</a>
 */
//@Component
public class BaseScheduler {

    private ScheduledExecutorService executor;

    public void execute() {
        executor = Executors.newScheduledThreadPool(10);

        executor.scheduleWithFixedDelay(new JiraApiCaller(), 0, 10000, TimeUnit.MILLISECONDS);
    }

}
