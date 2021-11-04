package tests.authorization;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import tests.base.BaseTest;

import static constants.Constants.AuthorizationTestData.AUTHORIZATION_LOGIN;
import static constants.Constants.AuthorizationTestData.INVALID_PASSWORD;
import static constants.Constants.ErrorsMessages.FIRST_AUTHORIZATION_FAIL;
import static constants.Constants.Urls.AUTHORIZATION_PAGE_URL;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstBadAuthorizationTest extends BaseTest{



        @Test
        @Order(1)
        public void checkErrorMsg() {
            basepage.openUrl(AUTHORIZATION_PAGE_URL);
            authorizationPage.inputLogin(AUTHORIZATION_LOGIN)
                    .inputPass(INVALID_PASSWORD)
                    .selectButtonLogin()
                    /*     .errorMsgField(FIRST_AUTHORIZATION_FAIL)
                          .inputPass(INVALID_PASSWORD)
                          .selectButtonLogin()*/
                    .errorMsgField(FIRST_AUTHORIZATION_FAIL);

        }


        @Test
        @Order(2)
        public void checkErrorMsg2() {
            basepage.openUrl(AUTHORIZATION_PAGE_URL);
            authorizationPage.inputLogin(AUTHORIZATION_LOGIN)
                    .inputPass(INVALID_PASSWORD)
                    .selectButtonLogin()
                    // .errorMsgField(FIRST_AUTHORIZATION_FAIL)
                    // .inputPass(INVALID_PASSWORD)
                    //.selectButtonLogin()
                    .errorMsgField(FIRST_AUTHORIZATION_FAIL);
        }

}
