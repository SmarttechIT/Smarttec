package utility.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCofigration {
	
	public static String getCofigValue(String Value) {
		
		File file = new File("./Config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro.getProperty(Value);
		
	}
	
	public static void main(String[] args) {
		
		BaseCofigration.getCofigValue("URL");
		BaseCofigration.getCofigValue("Username");
		BaseCofigration.getCofigValue("Password");
		System.out.println(BaseCofigration.getCofigValue("URL"));
		System.out.println(BaseCofigration.getCofigValue("Username"));
		System.out.println(BaseCofigration.getCofigValue("Password"));
		
	}
	
	
	
}
