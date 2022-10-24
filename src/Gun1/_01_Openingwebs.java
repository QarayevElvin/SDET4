package Gun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _01_Openingwebs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //web sayfasini kotrol edin
        driver.get("https://form.jotform.com/221934510376353");// web sayfasini ac

       // driver.quit(); butun acilmislari kapatir
       // driver.close(); aktiv olan tarayici kapanir


        try
        {
            WebElement element= driver.findElement(By.id("ismet"));
            System.out.println("element= " + element.getText());
        }catch (Exception ex)
        {
            System.out.println("Eleman bulunamadi="+ex.getMessage());
        }



        MyFunc.Bekle(5);
        driver.quit();
    }
}
