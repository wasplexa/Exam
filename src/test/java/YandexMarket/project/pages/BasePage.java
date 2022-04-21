package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import org.openqa.selenium.WebDriver;

/**
 * Created by st on 06.04.2022.
 */
public class BasePage {
    protected Browser browser;

    public BasePage( ) {
        this.browser = Browser.BROWSER;
    }
}
