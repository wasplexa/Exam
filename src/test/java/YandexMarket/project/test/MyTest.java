package YandexMarket.project.test;


import YandexMarket.project.pages.RegistartionSecond;
import YandexMarket.project.pages.RegistrationFirst;
import YandexMarket.project.pages.WelcomPage;
import YandexMarket.utils.ConfigFileReader;
import YandexMarket.utils.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by st on 30.03.2022.
 */
public class MyTest extends BaseTest {
    WelcomPage welcomPage = new WelcomPage();
    RegistrationFirst registrationFirst = new RegistrationFirst();

    @Test
    public void firstTest() throws IOException, InterruptedException {
        welcomPage.open();
        Assert.assertNotNull(welcomPage.isOpened(), "страница не открылась");
        welcomPage.clickButtonHERE();
        Assert.assertEquals(registrationFirst.checkPageFirst(registrationFirst.numberOfPage), "1 / 4", "Первая страница не отрылась");
        registrationFirst.inputPassword();
        registrationFirst.inputEmail();
        registrationFirst.inputDomain();
        registrationFirst.chooseDomain();
        registrationFirst.acceptTerms();
        registrationFirst.goTosecond();
        RegistartionSecond registartionSecond = new RegistartionSecond();
        Assert.assertEquals(registartionSecond.checkPageSecond(registartionSecond.numberOfPage), "2 / 4", "Вторая страница не отрылась");
        registartionSecond.chooseInterest();
        registartionSecond.uploadImage();
        registartionSecond.goThird();
        Assert.assertEquals(registartionSecond.checkPageSecond(registartionSecond.numberOfPage), "3 / 4", "Вторая страница не отрылась");
    }

    @Test
    public void secondTest() {
        welcomPage.open();
        welcomPage.clickButtonHERE();
        Assert.assertNotNull(welcomPage.isOpened(), "страница не открылась");
        registrationFirst.clickHelpFOrm();
        Assert.assertNotNull(registrationFirst.hiddenForm.findElements().size(), "форма не спряталась");
    }

    @Test
    public void thirdTest() {
        welcomPage.open();
        welcomPage.clickButtonHERE();
        Assert.assertNotNull(welcomPage.isOpened(), "страница не открылась");
        registrationFirst.cliclCookie();
        Assert.assertNull(registrationFirst.coockie.findElements().size(), "coockie не закрылись");
    }

    @Test
    public void forthTest() {
        welcomPage.open();
        welcomPage.clickButtonHERE();
        Assert.assertNotNull(welcomPage.isOpened(), "страница не открылась");
        Assert.assertEquals(registrationFirst.timer.getText(), "00:00:00", "таймер ведет отсчет не с нуля");
    }
}


