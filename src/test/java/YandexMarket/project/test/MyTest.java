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

    @Test
    public void firstTest() throws IOException, InterruptedException {
        welcomPage.open();
        Assert.assertNotNull(welcomPage.openPage.findElements().size(), "страница не открылась");
        welcomPage.clickButtonHERE();
        RegistrationFirst registrationFirst = new RegistrationFirst();
        Assert.assertEquals(registrationFirst.numberOfPage.getText(),"1 / 4","Первая страница не отрылась");
        registrationFirst.inputPassword();
        registrationFirst.inputEmail();
        registrationFirst.inputDomain();
        registrationFirst.chooseDomain();
        registrationFirst.acceptTerms();
        registrationFirst.goTosecond();
        RegistartionSecond registartionSecond = new RegistartionSecond();
        Assert.assertEquals(registartionSecond.numberOfPage.getText(),"2 / 4","Вторая страница не отрылась");
        registartionSecond.chooseInterest();
        registartionSecond.uploadImage();
        registartionSecond.goThird();
        Assert.assertEquals(registartionSecond.numberOfPage.getText(),"3 / 4","Вторая страница не отрылась");
    }

    @Test
    public void secondTest() {
        welcomPage.open();
        welcomPage.clickButtonHERE();
        Assert.assertNotNull(welcomPage.openPage.findElements().size(), "страница не открылась");
        TestCaseSecond testCaseSecond = new TestCaseSecond();
        testCaseSecond.clickHelpFOrm();
        Assert.assertNotNull(testCaseSecond.hiddenForm.findElements().size(), "форма не спряталась");
    }

    @Test
    public void thirdTest() {
        welcomPage.open();
        welcomPage.clickButtonHERE();
        Assert.assertNotNull(welcomPage.openPage.findElements().size(), "страница не открылась");
        TestCaseThird testCaseThird = new TestCaseThird();
        testCaseThird.cliclCookie();
        Assert.assertNull(testCaseThird.coockie.findElements().size(), "coockie не закрылись");
    }

    @Test
    public void forthTest() {
        welcomPage.open();
        welcomPage.clickButtonHERE();
        Assert.assertNotNull(welcomPage.openPage.findElements().size(), "страница не открылась");
        TestCaseForth testCaseForth = new TestCaseForth();
        Assert.assertEquals(testCaseForth.timer.getText(), "00:00:00", "таймер ведет отсчет не с нуля");
    }
}


