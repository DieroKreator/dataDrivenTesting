package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/*
 * Superclass BaseTest
 * 
 * Initialize:
 * WebDriver
 * Properties
 * Logs
 * ExtentReports
 * DB
 * Excel
 * Mail
 * 
 */

public class TestBase {

	public static WebDriver driver;
	
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis; 
	
	@BeforeSuite
	public void setUp() {

		if(driver==null) {
			
			try {
				fis = new FileInputStream("//Users//DieroKreator//code//eclipse-workspace//dataDrivenTesting//src//test//resources//properties//Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis = new FileInputStream("//Users//DieroKreator//code//eclipse-workspace//dataDrivenTesting//src//test//resources//properties//OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@AfterSuite
	public void tearDown() {

	}
}
