package YandexMarket.project.pages;

import YandexMarket.framework.brawser.Browser;
import YandexMarket.framework.brawser.elemets.TextElement;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Random;

public class RegistartionSecond {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private TextElement clear = new TextElement(By.xpath("//label[@for='interest_unselectall']"), "clear");
    private TextElement choose = new TextElement(By.xpath("//div[@class='avatar-and-interests__interests-list__item']"), "choose");
    private TextElement clickInterst = new TextElement(By.xpath("//span[@class='checkbox__box']"), "clickInterst");
    private TextElement upload = new TextElement(By.xpath("//a[@class='avatar-and-interests__upload-button']"), "upload");
    private TextElement goToThird = new TextElement(By.xpath("//button[@class='button button--stroked button--white button--fluid']"), "goToThird");
    public TextElement numberOfPage = new TextElement(By.xpath("//div[@class='page-indicator']"), "numberOfPage");

    public void chooseInterest() {
        clear.click();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(21);
            WebElement choos = choose.findElements().get(number);
            WebElement element = clickInterst.findElements().get(number);
            element.click();
            if (choos.getText().equals("Select all")) {
                --i;
            } else if (choos.getText().equals("Unselect all")) {
                --i;
            } else {
                choose.findElements().get(number).click();
            }
        }
    }

    public void uploadImage() throws IOException, InterruptedException {
        upload.click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec(config.getAutoItScript());
    }

    public void goThird() {
        for (int i = 0; i < goToThird.findElements().size(); i++) {
            System.out.println(goToThird.findElements().get(i).getText());
            if (goToThird.findElements().get(i).getText().equals("Next")) goToThird.findElements().get(i).click();
            break;
        }
    }
}
