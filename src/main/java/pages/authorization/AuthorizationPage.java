package pages.authorization;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage extends BasePage {

    private final SelenideElement inputLogin = $("input[name=txtLogin]");
    private final SelenideElement inputPass = $("input[name=txtPassword]");
    private final SelenideElement buttonLogin = $("div#btnLoginStandard.btn");
    private final SelenideElement errorMsgField = $("div#errMessage.errmsg.login2");
    private final SelenideElement errorMsgField2 = $("div#errMessage.errmsg.login-password");

    /** Input login */
    public AuthorizationPage inputLogin(String login) {
        clearAndType(inputLogin, login);
        return this;
    }

    /** Enter Password */
    public AuthorizationPage inputPass(String password) {
        clearAndType(inputPass, password);
        return this;
    }

    /** Click button "Вход" */
    public AuthorizationPage selectButtonLogin() {
        buttonLogin.shouldBe(Condition.visible).click();
        return this;
    }

    /** First and Second validation message wrong log/pass */
    public AuthorizationPage errorMsgField(String msgText) {
        errorMsgField.shouldBe(Condition.visible).shouldHave(Condition.text(msgText));
        return this;
        }
    /** variables for regExfind */
    public AuthorizationPage errorMsgField2(String msgText) {
        errorMsgField2.shouldBe(Condition.visible).should(Condition.matchText(msgText));
        return this;
    }
}

