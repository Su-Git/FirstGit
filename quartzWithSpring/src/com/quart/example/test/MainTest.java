package com.quart.example.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quart.example.scheduler.SchedulerService;


public class MainTest {

	public static void main(String[] args) throws SchedulerException {
		// TODO Auto-generated method stub
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:applicationContext_quartz.xml" });

		System.out.println("���÷���ʼ��");
		SchedulerService schedulerService = (SchedulerService) springContext
				.getBean("schedulerService");
		// ÿ10����ִ��һ�ε���
		System.out.println(" ÿ10����ִ��һ�ε���.");
		schedulerService.schedule("0/10 * * ? * * *");
		
//		Date startTime = parse("2015-04-28 16:01:15");
//		Date endTime = 	 parse("2015-04-28 16:01:50");
//		
//		// 2015-04-27 10:59:15
//		System.out.println("2015-04-28 16:01:15ִ�е��ȣ�");
//		schedulerService.schedule(startTime);
//		schedulerService.schedule(startTime, endTime);
//		schedulerService.schedule(startTime, null, 5, 20);
		
	}

	private static Date parse(String dateStr) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(dateStr);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
