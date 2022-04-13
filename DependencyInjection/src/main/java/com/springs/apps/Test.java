package com.springs.apps;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext2.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee s=(Employee)factory.getBean("e1");  
        s.show();  
          
    }  
}  