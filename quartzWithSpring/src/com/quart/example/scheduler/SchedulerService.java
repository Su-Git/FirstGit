package com.quart.example.scheduler;

import java.util.Date;

import org.quartz.CronExpression;

public interface SchedulerService {

	void schedule(String cronExpression);

	void schedule(String name, String cronExpression);

	void schedule(CronExpression cronExpression);

	void schedule(String name, CronExpression cronExpression);

	void schedule(Date startTime);

	void schedule(String name, Date startTime);

	void schedule(Date startTime, Date endTime);

	void schedule(String name, Date startTime, Date endTime);

	void schedule(Date startTime, Date endTime, int repeatCount);

	void schedule(String name, Date startTime, Date endTime, int repeatCount);

	void schedule(Date startTime, Date endTime, int repeatCount,
			long repeatInterval);

	void schedule(String name, Date startTime, Date endTime, int repeatCount,
			long repeatInterval);
}
