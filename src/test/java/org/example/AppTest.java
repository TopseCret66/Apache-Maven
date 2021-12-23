package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppTest {
    WebDriver driver;

    @Before

    public void init() {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        driver = new ChromeDriver();
        driver.get("http://webmasters.ru/forum/register.php");
        driver.manage().window().setSize(new Dimension(1301, 860));
    }

    @Test
    public void TestCase1() {

        WebMastersPage page = new WebMastersPage(this.driver);

        page.regusernameSendKeys("hhgghm")
                .passwordSendKeys("01081991")
                .passwordconfirmSendKeys("01081991")
                .emailSendKeys("pala487@mail.ru")
                .emailconfirmSendKeys("pala487@mail.ru")
                .vsaareg_codeSendKeys("dfvdfv")
                .agreeClick()
                .buttonClick();

        WebElement email3 = driver.findElement(By.id("email"));
        String text = email3.getAttribute("value");

        assertEquals("pala487@mail.ru", text);

    }

    @Test
    public void TestCase2() {
        WebMastersPage page = new WebMastersPage(this.driver);

        page.regusernameSendKeys("hhgghm")
                .passwordSendKeys("01081991")
                .passwordconfirmSendKeys("01081991")
                .emailSendKeys("pala487@mail.ru")
                .emailconfirmSendKeys("pala487@mail.ru")
                .vsaareg_codeSendKeys("dfvdfv")
                .agreeClick()
                .buttonClick();

        WebElement reguser1 = driver.findElement(By.id("regusername"));
        String text = reguser1.getAttribute("value");

        assertEquals("hhgghm", text);

    }

    @Test
    public void TestCase3() {
        WebMastersPage page = new WebMastersPage(this.driver);

        page.regusernameSendKeys("hhgghm")
                .passwordSendKeys("01081991")
                .passwordconfirmSendKeys("01081991")
                .emailSendKeys("pala487@mail.ru")
                .emailconfirmSendKeys("pala487@mail.ru")
                .vsaareg_codeSendKeys("dfvdfv")
                .agreeClick()
                .buttonClick();

        WebElement adminemail = driver.findElement(By.id("cb_adminemail"));
        String value = adminemail.getAttribute("checked");

        assertEquals("true", value);

    }

}
