package com.csc.storage;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.csc.fixture.SetUpConfiguration;

public class Logging {	
	private static org.apache.log4j.Logger log = Logger.getLogger(Logging.class);

	public static void info(String message) {
		log.info(message);
	}

	public static void warn(String message) {
		log.warn(message);
	}

	public static void error(String message) {
		log.error(message);
	}

	public static void fatal(String message) {
		log.fatal(message);
	}

	public static void debug(String message) {
		log.debug(message);
	}
}
