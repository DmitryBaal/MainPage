package pages.authorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class TEST extends BasePage {

    public TEST (WebDriver driver) {
        super(driver);
    }
    //    private final By loginField = By.cssSelector("input[name=txtLogin]");
    private final By inputLogin = By.cssSelector("input[name=txtLogin]");
    private final By inputPass = By.cssSelector("input[name=txtPassword]");
    private final By buttonLogin = By.cssSelector("div#btnLoginStandard.btn");
    private final By errorMsgField = By.cssSelector("div#errMessage.errmsg");
//    private final By errorMsgField3 = By.cssSelector("div#errMessage.errmsg.login-password");

    public void errorMsgField(){
        String getMsgError = driver.findElement(errorMsgField).getText();
        System.out.println(getMsgError);

    }


}

