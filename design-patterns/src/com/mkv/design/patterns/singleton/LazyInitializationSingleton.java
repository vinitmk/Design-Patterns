package com.mkv.design.patterns.singleton;

public class LazyInitializationSingleton {
	
	public static LazyInitializationSingleton instance;
	
	private LazyInitializationSingleton(){}
	
	public static LazyInitializationSingleton getInstance(){
		if(instance == null){
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}
	
	public static LazyInitializationSingleton getInstanceDoubleLocking(){
		if(instance == null){
			synchronized (LazyInitializationSingleton.class) { 
				if(instance == null){
					instance = new LazyInitializationSingleton();
				}
			}
		}
		return instance;
	}
}
