package com.csc.storage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Configuration {

	private String fileConfig;
	private String browser;
	private String driver;
	private String testSlaveMachine;
	private String url;

	public String getFileConfig() {
		return fileConfig;
	}

	public void setFileConfig(String fileConfig) {
		this.fileConfig = fileConfig;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getTestSlaveMachine() {
		return testSlaveMachine;
	}

	public void setTestSlaveMachine(String testSlaveMachine) {
		this.testSlaveMachine = testSlaveMachine;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		createFileProperty();
	}

	public void createFileProperty() {
		try {

			String path = getUrl() + getFileConfig();
			File file = new File(path);
			file.createNewFile();
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
