package pages.authorization;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.base.BasePage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static constants.Constants.ErrorsMessages.*;

public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    private final By inputLogin = By.cssSelector("input[name=txtLogin]");
    private final By inputPass = By.cssSelector("input[name=txtPassword]");
    private final By buttonLogin = By.cssSelector("div#btnLoginStandard.btn");
    private final By errorMsgField = By.cssSelector("div#errMessage.errmsg");
   // private final By errorMsgField3 = By.cssSelector("div#errMessage.errmsg.login-password");

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
        waitElementIsVisible(driver.findElement(errorMsgField));
        WebElement details = driver.findElement(errorMsgField);
        Assertions.assertEquals(msgText, details.getText());
        return this;
    }

    /**
     * Third validation message wrong log/pass
     * @return
     */
    public AuthorizationPage errorMsgFieldThree() {
        waitElementIsVisible(driver.findElement(errorMsgField));
        WebElement details = driver.findElement(errorMsgField);
        String takenText = details.getText(); //  Текст взятый из элемента на странице
        Pattern pattern = Pattern.compile(REG_EX_SECOND_AUTHORIZATION_FAIL); //Регулярное выражение
        Matcher matcher = pattern.matcher(takenText);
        String elementstext = null;
        boolean resultat=false;
        while (matcher.find()) {
            elementstext = takenText.substring(matcher.start(), matcher.end());
        }
        if (elementstext == (takenText))
        { resultat = true;}
        else
        {
            if (elementstext == null){
                System.out.println("Check RegEx");}
            else{
                System.out.println("Expected: " + takenText);
                System.out.println("Actual: " + elementstext);}
        }
        Assertions.assertTrue(resultat);
        return this;
    }

    /**
     * Fourth validation message wrong log/pass
     * @return
     */
    public AuthorizationPage errorMsgFieldFour() {
        waitElementIsVisible(driver.findElement(errorMsgField));
        WebElement details = driver.findElement(errorMsgField);
        String takenText = details.getText(); //  Текст взятый из элемента на странице
        Pattern pattern = Pattern.compile(REG_EX_THIRD_AUTHORIZATION_FAIL); //Регулярное выражение
        Matcher matcher = pattern.matcher(takenText);
        String elementstext = null;
        boolean resultat=false;
        while (matcher.find()) {
            elementstext = takenText.substring(matcher.start(), matcher.end());
        }
        if (elementstext == (takenText))
        { resultat = true;}
            else
                {
                if (elementstext == null){
                System.out.println("Check RegEx");}
                     else{
                         System.out.println("Expected: " + takenText);
                         System.out.println("Actual: " + elementstext);}
                }
        Assertions.assertTrue(resultat);
        return this;
    }

}

