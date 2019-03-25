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
public class HTMLWebTableConcepts {
    
    
    public static void main(String[]args){
        
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        
        //*[@id="customers"]/tbody/tr[2]/td[1]
        //*[@id="customers"]/tbody/tr[5]/td[1]
        //*[@id="customers"]/tbody/tr[4]/td[1]
        //*[@id="customers"]/tbody/tr[7]/td[1]
        
        String beforeXpathCompany = "//*[@id='customers']/tbody/tr[";   //xpath of row number
        String afterXpathCompany = "]/td[1]";    //xpath of column
        //total row counts
        List<WebElement> row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        int rowCount = row.size();
        System.out.println("totla number of row in table are :- " +rowCount );
        
        for(int i=2;i<=rowCount;i++){
            String actualXpath = beforeXpathCompany+i+afterXpathCompany;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            if(element.getText().equals("Ernst Handel")){
                System.out.println("Company name" +element.getText()+"is found" + "at position" +(i-1));
                break;
            }
        }
        
        
        System.out.println("*******************************************");
        //*[@id="customers"]/tbody/tr[2]/td[2]
        //*[@id="customers"]/tbody/tr[3]/td[2]
        String afterXpathContact = "]/td[2]";
        for(int i=2;i<=rowCount;i++){
            String actualXpath = beforeXpathCompany+i+afterXpathContact;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        }
        
        
       System.out.println("*******************************************");
        //*[@id="customers"]/tbody/tr[2]/td[3]
        //*[@id="customers"]/tbody/tr[3]/td[3]
        String afterXpathCountry = "]/td[3]";
        for(int i=2;i<=rowCount;i++){
            String actualXpath = beforeXpathCompany+i+afterXpathCountry;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
        } 
        
        
        //total column counts in HTML table
        
        //*[@id="customers"]/tbody/tr[1]/th[1]
        //*[@id="customers"]/tbody/tr[1]/th[2]
        //*[@id="customers"]/tbody/tr[1]/th[3]
        
        List<WebElement> col = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
        System.out.println("Total column counts in html table are :- "  +col.size());
        
        String beforeXpathCol = "//*[@id='customers']/tbody/tr[1]/th[";
        String afterXpathCol = "]";
        System.out.println("Column name are");
        for(int i=1;i<=col.size();i++){
           String actualXpath =  beforeXpathCol+i+afterXpathCol;
           WebElement element =driver.findElement(By.xpath(actualXpath));
           System.out.println(element.getText());
            
        }
        
        driver.quit();
    }
    
}
