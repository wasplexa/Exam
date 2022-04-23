package YandexMarket.project.test;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

/**
 * Created by st on 30.03.2022.
 */
public class BaseTest {
    private Browser browser = Browser.BROWSER;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeTest

    public void before(){
        browser.getDriver().manage().window().maximize();
           }
}
