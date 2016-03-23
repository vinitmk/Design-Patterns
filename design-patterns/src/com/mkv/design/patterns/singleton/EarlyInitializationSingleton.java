package com.mkv.design.patterns.singleton;

public class EarlyInitializationSingleton {
	
	private static final EarlyInitializationSingleton instance = new EarlyInitializationSingleton();
	
	private EarlyInitializationSingleton(){}
	
	public static EarlyInitializationSingleton getInstance(){
        return instance;
    }

}
