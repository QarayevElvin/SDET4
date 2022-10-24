package Gun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

import java.util.List;

public class _04_Findingclassname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); //web sayfasini kotrol edin
        driver.get("https://form.jotform.com/221934510376353");// web sayfasini ac

        // driver.quit(); butun acilmislari kapatir
        // driver.close(); aktiv olan tarayici kapanir


        WebElement submitButton= driver.findElement(By.className("form-submit-button"));
        System.out.println("submitButton = " + submitButton);
        submitButton.click();

        //Chrome ctrl+f ye basildiginda inspect bolumunde
        //first_name yazarsak butun kelimelerde arar
        //#first_name yazarsak butun ID parametrlerinde arar
        //.first_name yazarsak CALSS parametrelerinde arar
        
        //birden fazla ayni locator a sahib eleman bulursa findElement ne yapar?
        
        WebElement element= driver.findElement(By.className("form-submit-label"));
        System.out.println("element.getText() = " + element.getText());

        //bu locator a ait elemanlarin hepsini nasil alirim
        List<WebElement> labeller= (List<WebElement>) driver.findElement(By.className("form-submit-label"));
        System.out.println("element.getText() = " + labeller.size());
        for (WebElement e: labeller  ) 
        {
            System.out.println("e.getText() = " + e.getText());
            
        }



        MyFunc.Bekle(5);
        driver.quit();

    }
}
