package com.cts.byconst;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class BeanAutowiringByConstructorMain{
 
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Country countryObj = (Country) appContext.getBean("country");
        String countryName=countryObj.getCountryName();
        String capitalName=countryObj.getCapitalObj().getCapitalName();
        System.out.println(capitalName+" is capital of "+countryName);
 
    }
}