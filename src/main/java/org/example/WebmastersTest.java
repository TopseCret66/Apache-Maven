package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebmastersTest {

    public static void test(){
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

        WebElement button = driver.findElement(By.cssSelector(".button:nth-child(11)"));
        button.click();

        WebElement blogs = driver.findElement(By.linkText("Блоги"));
        blogs.click();
        Actions action = new Actions(driver);
        action.moveToElement(blogs).build().perform();

        WebElement blogsbutton = driver.findElement(By.linkText("Создать блог"));
        blogsbutton.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");

        WebElement blogs2 = driver.findElement(By.linkText("как получить?"));
        blogs2.click();
    }
}
