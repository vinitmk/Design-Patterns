package com.mkv.design.patterns;

import com.mkv.design.patterns.singleton.EarlyInitializationSingleton;

public class SingletonDesignPatternMain {

	public static void main(String[] args) {
		EarlyInitializationSingleton singleton1 = EarlyInitializationSingleton.getInstance();
		System.out.println(singleton1);
		
	}

}
