package org.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Configuration_Reader {
	public static Properties p;
     public Configuration_Reader() throws IOException {
	 File loc=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\MakeMyTrip\\src\\test\\java\\org\\properties\\mmt.properties");
		
		FileInputStream fi=new FileInputStream(loc);
		
		 p=new Properties();
		p.load(fi);
 }

 public String geturl() {
 String pt = p.getProperty("url");
return pt;
	 
}
 
 
}
