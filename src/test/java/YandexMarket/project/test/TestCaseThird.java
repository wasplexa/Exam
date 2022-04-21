package YandexMarket.project.test;

import YandexMarket.framework.brawser.elemets.TextElement;
import YandexMarket.project.pages.WelcomPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseThird extends BaseTest{
    TextElement coockie = new TextElement(By.xpath("//button[@class='button button--solid button--transparent']"),"coockie");

    public void cliclCookie(){
        coockie.click();
        }
}
