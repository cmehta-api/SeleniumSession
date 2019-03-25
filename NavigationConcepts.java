/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author cmehta
 */
public class NavigationConcepts {
    
    public static void main(String[]args) throws InterruptedException{
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        
        driver.get("https://www.google.com");
        Thread.sleep(4000);
        //navigates to amazone site
        driver.navigate().to("https://www.amazon.in");
        Thread.sleep(4000);
        //navigates back to google page
        driver.navigate().back();
        Thread.sleep(4000);
        //navigates to amazon page
        driver.navigate().forward();
        
        Thread.sleep(2000);
        //navigates back to google page & rfresh the page
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
        
    }
    
}
