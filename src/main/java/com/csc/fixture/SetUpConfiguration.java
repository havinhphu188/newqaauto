package com.csc.fixture;

import org.apache.log4j.Logger;

import com.csc.storage.Configuration;

public class SetUpConfiguration {

	private static org.apache.log4j.Logger log = Logger.getLogger(SetUpConfiguration.class);

	public static Configuration configuration = new Configuration();

	public SetUpConfiguration() {
	}

	public void setFileConfig(String fileName) {
		configuration.setFileConfig(fileName);
		log.info("Set File Config: " + fileName);
	}

	public void setBrowser(String browser) {
		configuration.setBrowser(browser);
		log.info("setBrowser: " + browser);
	}

	public void setDriver(String driver) {
		configuration.setDriver(driver);
		log.info("setDriver: " + driver);
	}

	public void setTestSlaveMachine(String machineUrl) {
		configuration.setTestSlaveMachine(machineUrl);
		log.info("setTestSlaveMachine: " + machineUrl);
	}

	public void setUrl(String url) {
		configuration.setUrl(url);
		log.info("setUrl: " + url);
	}

}
