package com.ms.main;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		String[] config = {

				"config/context.xml", "jobs/job-descriptor.xml" };

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(config);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("splitterJob");

		try {
			JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + jobExecution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
}
