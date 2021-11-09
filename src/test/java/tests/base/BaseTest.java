package tests.base;

import com.codeborne.selenide.Configuration;
import common.CommonActions;
import org.junit.jupiter.api.*;
import pages.authorization.AuthorizationPage;
import pages.base.BasePage;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import static common.Config.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected BasePage basepage = new BasePage();
    protected AuthorizationPage authorizationPage = new AuthorizationPage();



    @AfterAll
    void close() {
        if (HOLD_BROWSER_OPEN) {
            Configuration.holdBrowserOpen = true;

        }
    }



}