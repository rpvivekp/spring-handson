package com.cts.beanlifecycle;
public class Country {
 
 String countryName ;
 
 public String getCountryName() {
  return countryName;
 }
 
 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }
 
 public void init()
 {
  System.out.println("In init block of country");
 }
 
 public void destroy()
 {
  System.out.println("In destroy block of country");
 }
}