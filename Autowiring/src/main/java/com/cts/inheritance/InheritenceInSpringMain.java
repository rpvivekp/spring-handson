package com.cts.inheritance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class InheritenceInSpringMain {
 
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Inheritance.xml");
        Employee emp=(Employee) appContext.getBean("employeeBean");
        System.out.println("Employee name:"+emp.getName());
        System.out.println("Employee number:"+emp.getEmployeeNumber());
    }
}