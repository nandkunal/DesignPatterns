package com.pattern.observer;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void notifyObservers();
	public void dRegisterObserver(Observer observer);

}

