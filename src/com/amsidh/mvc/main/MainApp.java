package com.amsidh.mvc.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.beans.Demo;
import com.amsidh.mvc.beans.Person;
import com.amsidh.mvc.beans.SingletonDemo;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
		/*Person person = (Person) context.getBean("amsidhPerson");
		context.getBean("amsidhPerson");*/
		Demo demo1=(Demo)context.getBean("demo1");
		Demo demo2=(Demo)context.getBean("demo2");
		System.out.println(demo2.getId()+"::::"+demo2.getName());
		
		SingletonDemo d1=SingletonDemo.getInstance();
		SingletonDemo d2=SingletonDemo.getInstance();
		SingletonDemo d3=SingletonDemo.getInstance();
		SingletonDemo d4=SingletonDemo.getInstance();
        
		System.out.println("Java Singleton by Java loading");
		System.out.println("d1="+d1.hashCode());
		System.out.println("d2="+d2.hashCode());
		System.out.println("d3="+d3.hashCode());
		System.out.println("d4="+d4.hashCode());
        
        System.out.println("Java Singleton by Spring Loading");
		
		SingletonDemo d5=(SingletonDemo)context.getBean("singleton5");
		SingletonDemo d6=(SingletonDemo)context.getBean("singleton6");
		SingletonDemo d7=(SingletonDemo)context.getBean("singleton7");
		SingletonDemo d8=(SingletonDemo)context.getBean("singleton8");

		System.out.println("d5="+d5.hashCode());
		System.out.println("d6="+d6.hashCode());
		System.out.println("d7="+d7.hashCode());
		System.out.println("d8="+d8.hashCode());

		
		
		
	}

}
