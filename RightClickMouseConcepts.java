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
public class RightClickMouseConcepts {
    
    
    public static void main (String[]args) throws InterruptedException{
        
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        driver.switchTo().frame(0);
        
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"))).build().perform();
        Thread.sleep(2000);
        
        driver.quit();
        
    }
    
}
