package com.mkv.design.patterns.factory;

public class FileLoggerImpl implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Logging to File");

	}

}
