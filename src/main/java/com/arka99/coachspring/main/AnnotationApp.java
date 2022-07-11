package com.arka99.coachspring.main;

import com.arka99.coachspring.coach.Coach;
import com.arka99.coachspring.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        //        read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        get the bean
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
