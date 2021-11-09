package pages.authorization;



import common.SupportingMethods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.base.BasePage;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    private final By inputLogin = By.cssSelector("input[name=txtLogin]");
    private final By inputPass = By.cssSelector("input[name=txtPassword]");
    private final By buttonLogin = By.cssSelector("div#btnLoginStandard.btn");
    private final By errorMsgField = By.cssSelector("div#errMessage.errmsg");
    private final By errorMsgField2 = By.cssSelector("div#errMessage.errmsg.login-password");

    /**
     * Input login
     * @param login
     * @return
     */
    public AuthorizationPage inputLogin(String login) {
        driver.findElement(inputLogin).sendKeys(login);
        return this;
    }

    /**
     * Clear Login field
     * @return
     */
    public AuthorizationPage clearLogin(){
        driver.findElement(inputLogin).clear();
        return this;
    }

    /**
     * Enter Password
     * @param password
     */
    public AuthorizationPage inputPass(String password) {
        waitElementIsVisible(driver.findElement(inputPass));
        driver.findElement(inputPass).sendKeys(password);
        return this;
    }

    /**
     * Click button "Вход"
     */
    public AuthorizationPage selectButtonLogin() {
        waitElementIsVisible(driver.findElement(buttonLogin));
        driver.findElement(buttonLogin).click();
        return this;
    }

    /**
     * First and Second validation message wrong log/pass
     * @param msgText
     * @return
     */
    public AuthorizationPage errorMsgField(String msgText) {
        waitImplicit();
    //    waitElementIsVisible(driver.findElement(errorMsgField));
        WebElement details = driver.findElement(errorMsgField);
        Assertions.assertEquals(msgText, details.getText());
        return this;
    }

    /**
     * variables for regEfind
     * 1. get text from web element
     * 2. received Text is null
     * @param regExpression
     * @return
     */
    public AuthorizationPage errorMsgExperiment(String regExpression){
        waitImplicit();
        waitElementIsVisible(driver.findElement(errorMsgField2));
        WebElement details = driver.findElement(errorMsgField2);
        Assertions.assertTrue(SupportingMethods.RegExFindElement.regExFind(details.getText(), null,regExpression));
        return this;
    }



}

