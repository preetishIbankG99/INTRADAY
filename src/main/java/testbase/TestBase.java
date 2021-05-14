package testbase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestBase {
    public static WebDriver driver;
    public static Logger logger;
    

    @Test
    public void myFirstTest()throws IOException{
        logger=Logger.getLogger("INTRADAY");
        PropertyConfigurator.configure("log4j.properties");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        logger.info("######Open Browser######");
        driver.manage().window().maximize();
        logger.info("######Browser Maxmimized######");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        logger.info("######Entered Url######");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        logger.info("######UserName Enterd######");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        logger.info("######Password Entered######");
        driver.close();
    }

}
