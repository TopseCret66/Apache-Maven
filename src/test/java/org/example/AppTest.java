package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1301, 860));

        WebElement prependedInput2 = driver.findElement(By.id("prependedInput2"));
        prependedInput2.click();
        prependedInput2.sendKeys("Student2020!");

        WebElement submit = driver.findElement(By.id("_submit"));
        submit.click();

        WebElement first = driver.findElement(By.cssSelector(".first .last .title"));
        first.click();

        WebElement text = driver.findElement(By.linkText("Создать контактное лицо"));
        text.click();

        WebElement prependedInput3 = driver.findElement(By.id("crm_contact_lastName-uid-619d4671c5d6a"));
        prependedInput3.click();
        prependedInput3.sendKeys("Nikerov");

        WebElement prependedInput4 = driver.findElement(By.id("crm_contact_firstName-uid-619d4671c5c91"));
        prependedInput4.click();
        prependedInput4.sendKeys("Dmitryi");

        WebElement clik = driver.findElement(By.cssSelector(".select2-chosen"));
        Actions action = new Actions(driver);
        action.moveToElement(clik).build().perform();

        WebElement clik2 = driver.findElement(By.id("select2-drop-mask"));
        action.moveToElement(clik2).build().perform();

        WebElement lang = driver.findElement(By.cssSelector(".lang-ru"));
        lang.click();

        WebElement clik3 = driver.findElement(By.linkText("Открыть \"123test\""));
        action.moveToElement(clik3).build().perform();

        WebElement crm = driver.findElement(By.id("crm_contact_jobTitle-uid-619d4671c5e25"));
        crm.click();

        crm.sendKeys("test");

        WebElement btn = driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn"));
        btn.click();

        // ассерт чего я должен сюда добавить??? страница не прогружается я ничего не вижу!
    }

    @Test
    public void webmastersTest(){
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("http://webmasters.ru/forum/register.php");
        driver.manage().window().setSize(new Dimension(1301, 860));
        //WebElement css = driver.findElement(By.cssSelector(".dropdown:nth-child(3) .single:nth-child(4) .title"));
        //WebElement css = driver.findElement(By.linkText("Создать проект"));


        WebElement regusername = driver.findElement(By.id("regusername"));
        regusername.click();
        regusername.sendKeys("hhgghm");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("01081991");

        WebElement passwordconfirm = driver.findElement(By.id("passwordconfirm"));
        passwordconfirm.click();
        passwordconfirm.sendKeys("01081991");

        WebElement email = driver.findElement(By.id("email"));
        email.click();

        WebElement email2 = driver.findElement(By.id("email"));
        email2.click();
        email2.sendKeys("pala487@mail.ru");

        WebElement emailconfirm = driver.findElement(By.id("emailconfirm"));
        emailconfirm.click();
        emailconfirm.sendKeys("pala487@mail.ru");

        WebElement vsaareg_code = driver.findElement(By.name("vsaareg_code"));
        vsaareg_code.click();
        vsaareg_code.sendKeys("dfvdfv");

        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        WebElement button = driver.findElement(By.cssSelector(".button:nth-child(11)"));
        button.click();

        WebElement email3 = driver.findElement(By.id("email"));
        String text = email3.getAttribute("value");

        assertEquals("pala487@mail.ru", text);

//        WebElement blogs = driver.findElement(By.linkText("Блоги"));
//        blogs.click();
//        Actions action = new Actions(driver);
//        action.moveToElement(blogs).build().perform();
//
//        WebElement blogsbutton = driver.findElement(By.linkText("Создать блог"));
//        blogsbutton.click();
//
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,500)");
//
//        WebElement blogs2 = driver.findElement(By.linkText("как получить?"));
//        blogs2.click();
    }
}
