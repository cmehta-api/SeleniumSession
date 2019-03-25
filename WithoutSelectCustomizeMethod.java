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
public class WithoutSelectCustomizeMethod {
   static  WebDriver driver;;
   
    
    public static void main(String []args) throws InterruptedException{
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        String continentsXpath = "//select[@name = 'continents']//option";
        slectDropDown(continentsXpath , "Africa");
        

        driver.quit();
    }
    
    
    public static void slectDropDown(String xPath , String value) throws InterruptedException{
       List<WebElement> continentslist = driver.findElements(By.xpath(xPath));
        //System.out.println("Continents list size :-  " +continentslist.size());
        for(int i=0;i<continentslist.size();i++){
            //System.out.println(continentslist.get(i).getText());
            if(continentslist.get(i).getText().equals(value)){
                //System.out.println("selct the africa country from the list" +continentslist.get(i).getText() );
                continentslist.get(i).click();
                Thread.sleep(2000);
                break;
            }
            
        }
        
    }
    
}
