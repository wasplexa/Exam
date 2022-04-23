package YandexMarket.framework.brawser.elemets;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class AbstractElement {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private By locator;
    private String name;
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element;

    public AbstractElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
        driver = Browser.BROWSER.getDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(config.getTimeWait()));
    }

    private WebElement findElement() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public void click() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            findElement().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(String text) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            findElement().sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            return findElement().getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getAttribute(String name) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            return findElement().getAttribute(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getHref() {
        return getAttribute("href");
    }

    public void clear() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            findElement().clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<WebElement> findElements(){
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            return driver.findElements(locator);
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }
    }



