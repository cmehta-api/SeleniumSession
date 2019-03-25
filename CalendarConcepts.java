/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static seleniumsessions.WithoutSelectCustomizeMethod.driver;

/**
 *
 * @author cmehta
 */
public class CalendarConcepts {
    
    public static void main (String[]args){
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
         //a[@class='k-link k-nav-fast k-state-hover']
        //a[@class='k-link'][contains(text(),'Mar')]
        
        
        
        //*[@id="efcc5b0b-abc8-4dab-bbb2-7ae1d4434f1c"]/div[2]/table/tbody/tr[1]/td[1]/a
        //*[@id="efcc5b0b-abc8-4dab-bbb2-7ae1d4434f1c"]/div[2]/table/tbody/tr[1]/td[2]/a
        //*[@id="efcc5b0b-abc8-4dab-bbb2-7ae1d4434f1c"]/div[2]/table/tbody/tr[1]/td[7]/a
        
        String beforeXpath = "//*[@id=\"efcc5b0b-abc8-4dab-bbb2-7ae1d4434f1c\"]/div[2]/table/tbody/tr[";
        String afterXpath = "]/td[";
        String endXapth = "]/a";
        
        
       
        
        String selectDate = "30-March-2019";
        String[] dateArr =  selectDate.split("-");
        String dayValue = dateArr[0];
        String monthValue = dateArr[1];
        String yearValue = dateArr[2];
        //System.out.println(yearValue);
        
        
    }
    
}
