package day03;
//1. Bir class oluşturun: LocatorsIntro
  //      2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //    a. http://a.testaddressbook.com adresine gidiniz.
      //  b. Sign in butonuna basin
       // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
       // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
       // i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
       // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
       // doğrulayin(verify).
       // 3. Sayfada kac tane link oldugunu bulun.





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsIntro {
    public static <list> void main(String[] args)  {
        //1. Bir class oluşturun: LocatorsIntro

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\selenium dependencies\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //      2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();//
        WebElement singInLinki = driver.findElement(By.linkText("Sign in"));
         singInLinki.click();

// c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    WebElement emailTextBox = driver.findElement(By.id("session_email"));

        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
     WebElement singInButonu = driver.findElement(By.name("commit"));
// d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!

     emailTextBox.sendKeys("testtechproed@gmail.com");
     passwordTextBox.sendKeys("Test1234!");

     singInButonu.click();

 // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
     WebElement kullaniciAdi=driver.findElement(By.className("navbar-text"));
     if (kullaniciAdi.isDisplayed()){
         System.out.println("Kullanici adi testtechproed@gmail.com PASS");
     }else {
         System.out.println("Kullanici adi testtechproed@gmail.com FAILED");
     }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
        // doğrulayin(verify).

        WebElement adresLinki = driver.findElement(By.linkText("Addresses"));
     if (adresLinki.isDisplayed()){
         System.out.println("Adres linki gorundu testi PASS");
     }else {
         System.out.println("Adres linki gorundu testi FAILED");
     }

        WebElement signOutText = driver.findElement(By.linkText("Sign out"));
          if (signOutText.isDisplayed()){
              System.out.println("Sign out gorundu testi PASS");
          }else {
              System.out.println("Sign out gorundu testi FAILED");
          }



        // 3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> listListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfada"  +  listListesi.size() +  "tane link var");

     driver.close();


    }

}
