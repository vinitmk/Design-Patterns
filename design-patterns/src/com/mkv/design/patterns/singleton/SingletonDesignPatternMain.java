package com.mkv.design.patterns.singleton;

import com.mkv.design.patterns.singleton.EarlyInitializationSingleton;

public class SingletonDesignPatternMain {

	public static void main(String[] args) {
		EarlyInitializationSingleton earlySingleton = EarlyInitializationSingleton.getInstance();
		System.out.println(earlySingleton);
		
		LazyInitializationSingleton lazySingleton = LazyInitializationSingleton.getInstance();
		System.out.println(lazySingleton);
		
		LazyInitializationSingleton lazyLockSingleton = LazyInitializationSingleton.getInstanceDoubleLocking();
		System.out.println(lazyLockSingleton);
		
		BillPughSingleton singleton = BillPughSingleton.getInstance();
		System.out.println(singleton);
		
	}

}
