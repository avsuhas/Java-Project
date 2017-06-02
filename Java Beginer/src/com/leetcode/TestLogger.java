package com.leetcode;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class TestLogger {

	final static Logger logger = Logger.getLogger(TestLogger.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j-console-file.properties");
		logger.debug("this is Debug");
		logger.info("this is info");
		logger.warn("this is warning");
		logger.error("this is error");
		logger.fatal("this is fatal");
		
	}
	
}
