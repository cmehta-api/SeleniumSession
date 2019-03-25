/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author cmehta
 */
public class GoogleSerachDynamicXpathConcepts {
    
        public static void main (String[]args) throws InterruptedException{
                        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//input[@title ='Search']")).sendKeys("Selenium");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class = 'sbl1']"));
            System.out.println("total suggession found :- " +list.size() +" first element found :- "+ list.get(0).getText());
            
            System.out.println("Prints all input suggestion on google search");
            for(int i=0;i<list.size();i++){
                
                System.out.println(list.get(i).getText());
                if(list.get(i).getText().contains("selenium ide")){
                    list.get(i).click();
                    System.out.println("Selenium ide option selected");
                    break;                    
                }
            }                
        driver.quit();               
        }   
}
