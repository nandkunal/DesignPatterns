package com.pattern.observer;

public class TestObserverPattern {

	public static void main(String[] args) {
		WetherInformation info = new WetherInformation();
		DisplayDevice digital = new DigitalClock(info);
		info.setState("kk", "pp");
		digital.display();

	}

}
