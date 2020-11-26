package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkSeleniumTesti {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\selenium dependencies\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

         driver.get("https://www.google.com/");
    }



}
