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
		Coach cricketCoach =  applicationContext.getBean("cricket",Coach.class);
		cricketCoach = (CricketCoach) cricketCoach;
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getProdcut());
		System.out.println("Email address of the coach: " + ((CricketCoach) cricketCoach).getEmailAddress());
		System.out.println("Team : " + ((CricketCoach) cricketCoach).getTeam());
		System.out.println("-------------------------------------------------------------");
		Coach tennisCoach = applicationContext.getBean("tennis",Coach.class);
		tennisCoach = (TennisCoach) tennisCoach;
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getProdcut());
		System.out.println(((TennisCoach) tennisCoach).getEmail());
		System.out.println(((TennisCoach) tennisCoach).getPlayer());
		applicationContext.close();
	}

}
