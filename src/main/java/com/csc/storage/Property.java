package com.csc.storage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import com.csc.fixture.SetUpConfiguration;

public class Property {
	public static void setProperty(String fileName, String value, String property) {
		Properties prop = new Properties();
		OutputStream output = null;
		String path = SetUpConfiguration.configuration.getUrl() + "/" + fileName;
		try {

			output = new FileOutputStream(path, true);
			prop.setProperty(value, property);

			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
