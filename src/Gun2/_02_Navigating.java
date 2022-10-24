package Gun2;

import utility.BaseDriver;
import utility.MyFunc;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://www.hepsiburada.com/");
        MyFunc.Bekle(3);

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        MyFunc.Bekle(3);
        driver.navigate().back();

        driver.navigate().forward();

        driverBekleKapat();
    }
}
