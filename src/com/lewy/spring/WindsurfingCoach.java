package com.lewy.spring;

import org.springframework.beans.factory.annotation.Value;

public class WindsurfingCoach implements Coach {

  @Value("${foo.email}")
  private String email;
  @Value("${foo.team}")
  private String team;

  private FortuneService fortuneService;

  public WindsurfingCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Końcówka bomu bliżej wody! Halsujemy do końca zatoki i z powrotem.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public String getEmail() {
    return email;
  }

  public String getTeam() {
    return team;
  }
}
