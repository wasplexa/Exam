package YandexMarket.project.test;

import YandexMarket.framework.brawser.elemets.TextElement;
import YandexMarket.project.pages.WelcomPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseForth extends BaseTest{

    TextElement timer = new TextElement(By.xpath("//div[@class='timer timer--white timer--center']"),"timer");

}
