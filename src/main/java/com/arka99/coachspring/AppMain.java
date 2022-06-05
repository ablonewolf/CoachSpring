package com.arka99.coachspring;

import com.arka99.coachspring.coach.Coach;
import com.arka99.coachspring.coach.CricketCoach;
import com.arka99.coachspring.coach.TennisCoach;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args) throws BeansException {
//		load the spring configuration file, which is the spring container
		ClassPathXmlApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("context.xml");

//		retrieve bean from spring container and call the methods on fetched object
		Coach cricketCoach = applicationContext.getBean("cricket",Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		Coach tennisCoach = applicationContext.getBean("tennis",Coach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		applicationContext.close();
	}

}
