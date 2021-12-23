package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebMastersPage {

    private final WebDriver driver;

    @FindBy(id = "regusername")
    private WebElement regusername;

    @FindBy(id = "password")
    private WebElement pass;

    @FindBy(id = "passwordconfirm")
    private WebElement passfirm;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "emailconfirm")
    private WebElement emailconfirm;

    @FindBy(name = "vsaareg_code")
    private WebElement vsaareg_code;

    @FindBy(css = ".button:nth-child(11)")
    private WebElement button;

    @FindBy(linkText = "Блоги")
    private WebElement blogs;

    @FindBy(linkText = "Создать блог")
    private WebElement blogsbutton;

    @FindBy(linkText = "как получить?")
    private WebElement blogs2;

    @FindBy(name = "agree")
    private WebElement agree;

    public WebMastersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebMastersPage regusernameSendKeys(String hhgghm) {
        regusername.click();
        regusername.sendKeys(hhgghm);
        return this;

    }

    public WebMastersPage passwordSendKeys(String s) {
        pass.click();
        pass.sendKeys(s);
        return this;
    }

    public WebMastersPage passwordconfirmSendKeys(String s) {
        passfirm.click();
        passfirm.sendKeys(s);
        return this;
    }

    public WebMastersPage emailSendKeys(String s) {
        email.click();
        email.sendKeys(s);
        return this;
    }


    public WebMastersPage emailconfirmSendKeys(String s) {
        emailconfirm.click();
        emailconfirm.sendKeys(s);
        return this;
    }

    public WebMastersPage vsaareg_codeSendKeys(String dfvdfv) {
        vsaareg_code.click();
        vsaareg_code.sendKeys(dfvdfv);
        return this;
    }

    public WebMastersPage buttonClick() {
        button.click();
        return this;
    }

    public WebMastersPage blogsMoveToElement() {
        blogs.click();
        Actions action = new Actions(driver);
        action.moveToElement(blogs).build().perform();
        return this;
    }

    public WebMastersPage blogsbuttonClick() {
        blogsbutton.click();
        return this;
    }

    public WebMastersPage scrollScreen() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
        return this;
    }

    public WebMastersPage blogs2Click() {
        blogs2.click();
        return this;
    }

    public WebMastersPage agreeClick()
    {
        this.agree.click();
        return this;
    }
}
