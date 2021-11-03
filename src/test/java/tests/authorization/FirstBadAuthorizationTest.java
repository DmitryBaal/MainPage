package tests.authorization;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.authorization.AuthorizationPage;
import tests.base.BaseTest;

import static constants.Constants.AuthorizationTestData.AUTHORIZATION_LOGIN;
import static constants.Constants.AuthorizationTestData.AUTHORIZATION_PASSWORD;
import static constants.Constants.ErrorsMessages.FIRST_AUTHORIZATION_FAIL;
import static constants.Constants.Urls.AUTHORIZATION_PAGE_URL;

public class FirstBadAuthorizationTest extends BaseTest{


    @Test
    public void checkErrorMsg (){
        basepage.openUrl(AUTHORIZATION_PAGE_URL);
        authorizationPage.inputLogin(AUTHORIZATION_LOGIN)
                         .inputPass(AUTHORIZATION_PASSWORD)
                         .selectButtonLogin()
                         .errorMsgField(FIRST_AUTHORIZATION_FAIL);






    }

}
