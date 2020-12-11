package com.lewy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WindsurferDemoApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WindsurferConfig.class);
    WindsurfingCoach theCoach = context.getBean("windsurfingCoach", WindsurfingCoach.class);
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());
    System.out.println(theCoach.getEmail());
    System.out.println(theCoach.getTeam());
    context.close();
  }
}
