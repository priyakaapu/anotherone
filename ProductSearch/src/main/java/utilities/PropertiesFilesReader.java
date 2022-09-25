package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Priyanka
 *
 * 
 */
public class PropertiesFilesReader {

	public static String Url = ".\\ConfigFiles\\config.properties";
	public static File file = null;
	public static FileInputStream rFile = null;
	public static Properties properties = null;

//*************************************************************************************************************
	public static void readProperties(String key) {
		try {
			file = new File(Url);
			rFile = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			System.out.println("File Not Found." + e1.getMessage());
			e1.printStackTrace();
		}
		properties = new Properties();
		try {
			properties.load(rFile);
			System.out.println(properties.getProperty(key));
		} catch (IOException e2) {
			System.out.println("Unable to load the content. " + e2.getMessage());
			e2.printStackTrace();
		}
	}
//*************************************************************************************************************
}
