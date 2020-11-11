package com.deere.ics.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertfileReader {
	
	
	
	 public static Properties getproperties(String path) throws IOException {
	        Properties properties = new Properties();
	        try {
	            properties.load(new FileInputStream(System.getProperty("user.dir")+path));
	        }
	        catch (Exception e) {
	            System.out.println("Exception " + e);
	        }

	        return properties;
	    }

}
