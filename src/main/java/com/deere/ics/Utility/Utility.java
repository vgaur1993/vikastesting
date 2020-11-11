
package com.deere.ics.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import com.deere.ics.Driver.Driver1;

public class Utility {

    public static Properties getproperties(String path) throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        }
        catch (Exception e) {
            System.out.println("Exception " + e);
        }

        return properties;
    }

    public static boolean verifyElementAbsent(String locator) throws Exception {

        try {
        	Driver1.getDriver().findElement(By.xpath(locator));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

}
