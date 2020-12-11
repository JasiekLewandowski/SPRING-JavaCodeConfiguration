package com.lewy.spring;

public class WindsurferFortune implements FortuneService{
  @Override
  public String getFortune() {
    return "Dzisiaj 10 w skali Beauforta! Będzie zabawa!";
  }
}
