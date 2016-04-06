package com.mkv.design.patterns.factory;

public abstract class LoggerCreator {
	
	public abstract ILogger createLogger();
	
	public ILogger getLogger(){
		ILogger iLogger = createLogger();
		return iLogger;
	}
	
}
