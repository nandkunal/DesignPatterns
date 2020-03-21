package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WetherInformation implements Subject {
	
	private String temp;
	private String pressure;
	
	public WetherInformation() {
		observers = new ArrayList<>();
	}
	
	public void setState(String temp, String pressure) {
		this.temp =  temp;
		this.pressure = pressure;
		notifyObservers();
	}
	
	private List<Observer> observers;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		System.out.println("Registered");
		
		
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notify all observers");
		for (Observer obs : observers) {
			obs.update(temp, pressure);
		}
		
		
	}

	@Override
	public void dRegisterObserver(Observer observer) {
		if (observers.size() > 0 && observers.indexOf(observer) > -1) {
			observers.remove(observers.indexOf(observer));
		}
		
	}

}
