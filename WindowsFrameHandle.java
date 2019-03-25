/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsFrameHandle {
    
    public static void main(String[]args) throws InterruptedException{
        
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\cmehta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        Thread.sleep(5000);
        
        WebDriver frame =  driver.switchTo().frame(2);

        String str = frame.getTitle();
        System.out.println(str);
        if(str.equals("Sample frames page")){
            System.out.println("Passed, frame switched");
        }
        else
        {
            System.out.println("error in switching frame");
        }                
        driver.quit();        
    }    
}
