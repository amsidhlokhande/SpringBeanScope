package com.amsidh.mvc.beans;

public class SingletonDemo {

	private static volatile SingletonDemo SINGLETON_DEMO=null;

	private SingletonDemo() {
		System.out.println("Singleton constructor called");
	}

	public static SingletonDemo getInstance() {
		 if(SINGLETON_DEMO==null){
			 synchronized (SingletonDemo.class) {
			
				 if(SINGLETON_DEMO==null){
					 SINGLETON_DEMO=new SingletonDemo();
				 }
			}
			 
		 }
		return SINGLETON_DEMO;
	}
}
