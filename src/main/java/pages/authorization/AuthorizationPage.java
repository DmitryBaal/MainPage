package pages.authorization;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }
//    private final By loginField = By.cssSelector("input[name=txtLogin]");
    private final By inputLogin = By.cssSelector("input[name=txtLogin]");
    private final By inputPass = By.cssSelector("input[name=txtPassword]");
    private final By buttonLogin = By.cssSelector("div#btnLoginStandard.btn");
    private final By errorMsgField1 = By.cssSelector("div#errMessage.errmsg.login2");
    private final By errorMsgField2 = By.xpath("//html/body/form/div[3]/div[2]/div/div[3]/div/div/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[5]");
    private final By errorMsgField3 = By.cssSelector("div#errMessage.errmsg.login-password");

    /**
     * Enter Login
     * @param login
     * @return
     */
    public AuthorizationPage inputLogin (String login){
        driver.findElement(inputLogin).sendKeys(login);
        return this;
    }

    /**
     * Enter Password
     * @param password
     */
    public AuthorizationPage inputPass (String password) {
        waitElementIsVisible(driver.findElement(inputPass));
        driver.findElement(inputPass).sendKeys(password);
        return this;
    }
    /**
     * Click button "Вход"
     */
    public AuthorizationPage selectButtonLogin () {
        waitElementIsVisible(driver.findElement(buttonLogin));
        driver.findElement(buttonLogin).click();
        return this;
    }

    /**
     *First validation message wrong log/pass
     * @param msgText
     * @return
     */
    public AuthorizationPage errorMsgField(String msgText){
        ExpectedConditions.presenceOfElementLocated(errorMsgField1);
        WebElement details = driver.findElement(errorMsgField1);
        Assertions.assertEquals( msgText, details.getText());
        return this;
    }
    /**
     *Seond validation message wrong log/pass
     * @param msgText
     * @return
     */
    public AuthorizationPage errorMsgField2(String msgText){
        ExpectedConditions.presenceOfElementLocated(errorMsgField2);
        WebElement details = driver.findElement(errorMsgField2);
        Assertions.assertEquals( msgText, details.getText());
        return this;
    }
    /**
     *Third validation message wrong log/pass
     * @param msgText
     * @return
     */
    public AuthorizationPage errorMsgField3(String msgText){
        waitElementIsVisible(driver.findElement(errorMsgField3));
        WebElement details = driver.findElement(errorMsgField3);
        Assertions.assertEquals( msgText, details.getText());
        return this;
    }

}

