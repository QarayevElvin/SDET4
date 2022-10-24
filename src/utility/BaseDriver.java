package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    public static WebDriver driver;

    static
    {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();//ekrani max yapar
    }

    public static void driverBekleKapat()
    {
        MyFunc.Bekle(10);
        driver.quit();
    }
}
