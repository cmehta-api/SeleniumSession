/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author cmehta
 */
public class MouseMovementHandle {
    
    
    public static void main(String[]args) throws InterruptedException{
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        
        Actions action  = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[@class='burger-bread']"))).build().perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("FAQ")).click();
        String actualFAQ = driver.findElement(By.xpath("//h1[contains(text(),'FAQ -')]")).getText();
        System.out.println(actualFAQ);
        String expecredFAQ = "FAQ - GENERAL";
        
        if(expecredFAQ.equals(actualFAQ)){            
            System.out.println("FAQ text verified");
        }
        else{
            System.out.println("FAQ text is incorrect");
        }                
        driver.quit();       
    }
}
