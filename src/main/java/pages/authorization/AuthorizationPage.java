package pages.authorization;

import com.sun.source.tree.UsesTree;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }
//    private final By loginField = By.cssSelector("input[name=txtLogin]");
    private final By inputLogin = By.cssSelector("input[name=txtLogin]");
    private final By inputPass = By.cssSelector("input[name=txtPassword]");
    private final By buttonLogin = By.cssSelector("div#btnLoginStandard.btn");
    private final By errorMsgField = By.cssSelector("div#errMessage.errmsg");
//    private final By errorMsgField3 = By.cssSelector("div#errMessage.errmsg.login-password");

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
        driver.findElement(inputPass).sendKeys(password);
        return this;
    }
    /**
     * Click button "Вход"
     */
    public AuthorizationPage selectButtonLogin () {
        driver.findElement(buttonLogin).click();
        return this;
    }

    /**
     *Validation message wrong log/pass
     * @param msgText
     * @return
     */
    public AuthorizationPage errorMsgField(String msgText){
        waitElementIsVisible(driver.findElement(errorMsgField));
        WebElement details = driver.findElement(errorMsgField);
        Assertions.assertEquals( msgText, details.getText());
        return this;

    }


}

