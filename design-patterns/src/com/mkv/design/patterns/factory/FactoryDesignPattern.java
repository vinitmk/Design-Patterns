package com.mkv.design.patterns.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		LoggerCreator creator = new FileLoggerCreater();
		ILogger logger = creator.getLogger();
		logger.log("This is a message");
	}
}
