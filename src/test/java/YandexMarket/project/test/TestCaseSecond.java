package YandexMarket.project.test;

import YandexMarket.framework.brawser.elemets.TextElement;
import org.openqa.selenium.By;

public class TestCaseSecond {
   private TextElement helpForm = new TextElement(By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']"), "helpForm");
    TextElement hiddenForm = new TextElement(By.xpath("//div[@class='help-form is-hidden']"), "hiddenForm");

    public void clickHelpFOrm() {
        helpForm.click();
    }
}
