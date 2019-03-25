/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {
    
    public static void main(String[]args) throws InterruptedException{        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        String parent = driver.getWindowHandle();
        System.out.println("Parent window id is " +parent);
        
        driver.findElement(By.linkText("Multiple Windows")).click();
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("total windows counts " +allWindows.size());       
        for(String  child:allWindows){
            if(parent.equalsIgnoreCase(child)){            
                driver.switchTo().window(child);
                driver.findElement(By.linkText("Click Here")).click();
                driver.close();
            }            
            driver.switchTo().window(parent);
        }    
        driver.quit();                       
    }   
}
