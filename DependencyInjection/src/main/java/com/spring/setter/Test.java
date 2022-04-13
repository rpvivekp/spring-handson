package com.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
//	Resource r=new ClassPathResource("applicationContext.xml");
	//BeanFactory factory=new XmlBeanFactory(r);
	//iniilizing the container
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
	//retriving beans
	Employee e=context.getBean("obj1", Employee.class);
	e.displayInfo();
	
	//context.registerShutdownHook();
}
}
