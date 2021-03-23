package test.sonali.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Configirations {
	
	private Properties prop;

	
	public Configirations() {
		prop = new Properties();
		
		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getProperty(String key) {
     return prop.getProperty(key);
     }
}
