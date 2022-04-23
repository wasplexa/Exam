package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.TextElement;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;


/**
 * Created by st on 30.03.2022.
 */
public class WelcomPage {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
       public void open() {
        browser.goTo(config.getApplicationUrl());
    }

public int isOpened(){
   return openPage.findElements().size();
    }
    private TextElement clickToButtonHERE = new TextElement(By.xpath("//a[@class='start__link']"), "clickToButtonHERE");
    public TextElement openPage = new TextElement(By.xpath("//div[@id='app']"), "openPage");
    public void clickButtonHERE() {
        clickToButtonHERE.click();
    }


}
