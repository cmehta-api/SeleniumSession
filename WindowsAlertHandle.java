/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAlertHandle {
    
    public static void main(String[]args) throws InterruptedException{       
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@title='Sign in']")).click();
        Thread.sleep(4000);
        
        Alert alert = driver.switchTo().alert(); 
        System.out.println(alert.getText());         
        if(alert.getText().equals("Please enter a valid user name")){            
            System.out.println("Correct alert message");
        }
        else{
            System.out.println("Alert message is incorrect");
        }
        alert.accept(); 
        driver.quit();       
    }   
}
