package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.TextElement;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class RegistrationFirst {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private TextElement passwordIn = new TextElement(By.xpath("//input[@placeholder='Choose Password']"), "passwordIn");
    private TextElement emailIn = new TextElement(By.xpath("//input[@placeholder='Your email']"), "emailIn");
    private TextElement domainIn = new TextElement(By.xpath("//input[@placeholder='Domain']"), "domainIn");
    private TextElement clickToSecond = new TextElement(By.xpath("//a[@class='button--secondary']"), "clickToSecond");
    private TextElement domainClick = new TextElement(By.xpath("//div[@class='dropdown__field']"), "domainClick");
    private TextElement domainDrop = new TextElement(By.xpath("//div[@class='dropdown__list-item']"), "domainDrop");
    private TextElement clickAccept = new TextElement(By.xpath("//span[@class='checkbox']"), "clickAccept");
    private Browser browser = Browser.BROWSER;
    public TextElement numberOfPage = new TextElement(By.xpath("//div[@class='page-indicator']"), "numberOfPage");

    public void inputPassword() {
        passwordIn.clear();
        passwordIn.sendKeys(config.getPassword());
    }

    public void inputEmail() {
        emailIn.clear();
        emailIn.sendKeys(config.getEmailName());
    }

    public void inputDomain() {
        domainIn.clear();
        domainIn.sendKeys(config.getDomainName());
    }

    public void chooseDomain() {
        domainClick.click();
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            int item = random.nextInt(11);
            if(domainDrop.findElements().get(item).getText().equals("other")){
                i--;
                continue;
            }else domainDrop.findElements().get(item).click();
        }
       }

    public void acceptTerms() {
        clickAccept.click();
    }

    public void goTosecond() {
        clickToSecond.click();
    }
}
