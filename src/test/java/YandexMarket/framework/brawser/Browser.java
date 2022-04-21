package YandexMarket.framework.brawser;

import YandexMarket.utils.ConfigFileReader;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


/**
 * Created by st on 30.03.2022.
 */
public class Browser {

    private static WebDriver driver;
    private ConfigFileReader cofig = ConfigFileReader.configFileReader;
    public static Browser BROWSER = new Browser();

    private Browser() {
        driver = BrowserFactory.getDriver(cofig.getBrowserName());
    }

    public void goTo(String url) {
        BROWSER.getDriver().get(url);
    }

    public  WebDriver getDriver() {
        return driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
    public void quit(){
        driver.quit();
    }
    public List<WebElement> findElements(By locator){
       return driver.findElements(locator);
    }

}
