package com.cts.setinject;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext4.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee e=(Employee)factory.getBean("obj");  
        e.display();  
          
    }  
}  