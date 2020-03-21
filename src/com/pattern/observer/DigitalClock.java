package com.pattern.observer;

public class DigitalClock implements Observer, DisplayDevice {
	
	private Subject subject;
	
	private String temp;
	private String pressure;
	
	public  DigitalClock(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(temp);
		System.out.println(pressure);
		
	}

	@Override
	public void update(String temp, String pressure) {
		this.temp = temp;
		this.pressure = pressure;
		
	}



}
