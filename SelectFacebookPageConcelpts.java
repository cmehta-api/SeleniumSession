/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author cmehta
 */
public class SelectFacebookPageConcelpts {
    
    public static void main (String[]args) {
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        
        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        
   //     Thread.sleep(2000);
//        Select selectDay = new Select(day);
//        //selectDay.selectByIndex(1);
//        selectDay.selectByVisibleText("31");
//        
//        Select selectMonth = new Select(month);
//        //selectMonth.selectByIndex(1);
//        selectMonth.selectByVisibleText("Mar");
//        
//        Select selectYear = new Select(year);
//        //selectYear.selectByIndex(1);
//        selectYear.selectByVisibleText("1981");
        
      
      //using split method to split the date in day , month & year
        
        String dob = "31-Dec-1981";
        String[] dobarr = dob.split("-");
        
        selectValueFromDropDown(day,dobarr[0]);  
        selectValueFromDropDown(month,dobarr[1]);
        selectValueFromDropDown(year,dobarr[2]);
        
        
        
      
        driver.quit();
    }
    
    
    //create the method for common Select calss to pass the argumnets whenever required 
    public static void selectValueFromDropDown(WebElement element , String value){
        
        Select select = new Select(element);
        select.selectByVisibleText(value);
        
    }
    
}
