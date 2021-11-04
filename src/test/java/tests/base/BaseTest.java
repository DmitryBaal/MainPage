package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.authorization.AuthorizationPage;
import pages.base.BasePage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basepage = new BasePage(driver);
    protected AuthorizationPage authorizationPage = new AuthorizationPage(driver);

    @AfterEach
    void clearCookies(){
        if(CLEAR_COOKIES){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }

    }
    @AfterAll
    void close(){
        if(HOLD_BROWSER_OPEN){
            driver.close();

        }
    }
}
