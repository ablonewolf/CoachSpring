package com.arka99.coachspring.main;

import com.arka99.coachspring.coach.Coach;
import com.arka99.coachspring.coach.CricketCoach;
import com.arka99.coachspring.configuration.CoachConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfiguration.class);
        Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getProdcut());
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getProdcut());
        Coach footballCoach = context.getBean("footballCoach",Coach.class);
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getProdcut());

        context.close();
    }


}
