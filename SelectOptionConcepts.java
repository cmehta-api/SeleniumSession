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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author cmehta
 */
public class SelectOptionConcepts {
    
    public static void main(String[]args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.toolsqa.com/automation-practice-form/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        WebElement element = driver.findElement(By.xpath("//select[@name = 'continents']"));
        
        Select select = new Select(element);
        //select.selectByIndex(1);
        //select.selectByVisibleText("Europe");
        
        List<WebElement> list = select.getOptions();
        System.out.println("Continents total size :- " +list.size());
        
        
        for(int i=0;i<list.size();i++){
            
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equalsIgnoreCase("Europe")){
                System.out.println("If country found europe then get the text & select the option and break the loop" +list.get(i).getText());
                list.get(i).click();
                break;
                
            }
        }
        
       driver.quit();
    }
    
}
