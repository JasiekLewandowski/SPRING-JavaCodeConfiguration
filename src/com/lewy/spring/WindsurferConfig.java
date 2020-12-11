package com.lewy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class WindsurferConfig {

  @Bean
  public FortuneService windsurferFortune(){
    return new WindsurferFortune();
  }

  @Bean
  public Coach windsurfingCoach (){
    WindsurfingCoach myCoach = new WindsurfingCoach(windsurferFortune());
    return myCoach;
  }

}
