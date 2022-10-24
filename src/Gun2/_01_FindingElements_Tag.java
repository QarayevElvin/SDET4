package Gun2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BaseDriver;
import utility.MyFunc;

import java.util.List;

public class _01_FindingElements_Tag extends BaseDriver {
    public static void main(String[] args) {
                driver.get("https://www.hepsiburada.com");// web sayfasini ac

        List<WebElement> linkler= driver.findElements(By.tagName("a"));

        for (WebElement a:linkler)
        {
            if(a.getText()=="")
                System.out.println(a.getText());
        }



        driverBekleKapat();

    }
}
