package tests.authorization;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constants.AuthorizationTestData.AUTHORIZATION_LOGIN;
import static constants.Constants.AuthorizationTestData.INVALID_PASSWORD;
import static constants.Constants.ErrorsMessages.*;
import static constants.Constants.Urls.AUTHORIZATION_PAGE_URL;


public class SecondBadAuthorizationTest extends BaseTest {


    @Test
    @Order(1)
    public void checkErrorMsg() {
        basepage.openUrl(AUTHORIZATION_PAGE_URL);
        authorizationPage.inputLogin(AUTHORIZATION_LOGIN)
                .inputPass(INVALID_PASSWORD)
                .selectButtonLogin()
                .errorMsgField(FIRST_AUTHORIZATION_FAIL)
                .inputPass(INVALID_PASSWORD)
                .selectButtonLogin();
        authorizationPage.errorMsgExperiment(REG_EX_THIRD_AUTHORIZATION_FAIL);
    }

}
