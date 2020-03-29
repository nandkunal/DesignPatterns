package com.pattern.singelton;

public class SingletonDemo {
	

	
	private volatile static SingletonDemo singletonDemo;
	
	private SingletonDemo() {
		
	}
	
	public void display() {
		System.out.println("Hello Singleton Demo");
	}
	
	public static SingletonDemo getInstance() {
		if (singletonDemo == null ) {
			synchronized (SingletonDemo.class) {
				if(singletonDemo == null)
					singletonDemo = new SingletonDemo();
			}
		}
		return singletonDemo;
	}

}
