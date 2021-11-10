/*
package tests.authorization;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class OnaBadAuthTest {


    @Test
    public void TestOne() {
        open("https://online.mkb.ru/");
        $("input[name=txtLogin]").sendKeys("a6sfdas65dg");
        $("input[name=txtPassword]").sendKeys(("asdasda"));
        $("div#btnLoginStandard.btn").click();
        $("input[name=txtPassword]").sendKeys(("asdasda"));
        $("div#btnLoginStandard.btn").click();
        $("input[name=txtPassword]").sendKeys(("asdasda"));
        $("div#btnLoginStandard.btn").click();
        String kekus = $("div#errMessage.errmsg").shouldBe(Condition.visible).getText();
        System.out.println(kekus);
        //  $("div#errMessage.errmsg.login-password").shouldHave(Condition.attributeMatching(kekus, "(\\D{2})\\s(\\D{5})\\s(\\D{12})\\s(\\D{5})\\s.\\s(\\D{6})\\s\\d\\s(\\D{4}).\\s(\\D)\\s(\\D{5})\\s(\\D{12})\\s(\\D{4})\\s(\\D)\\s(\\D{7})\\s(\\D{9}).\\s(\\D{9})\\s(\\D{7})\\s(\\D{5})\\s(\\d{2})\\s(\\D{3})\\s(\\d{2})\\s(\\D{3})."));
        $("div#errMessage.errmsg.login-password").should(Condition.matchText("(\\D{5})\\s(\\D{2})\\s(\\D{5})\\s(\\D{12})\\s(\\D{5})\\s.\\s(\\D{6})\\s\\d\\s(\\D{4}).\\s(\\D)\\s(\\D{5})\\s(\\D{12})\\s(\\D{4})\\s(\\D)\\s(\\D{7})\\s(\\D{9}).\\s(\\D{9})\\s(\\D{7})\\s(\\D{5})\\s(\\d{2})\\s(\\D{3})\\s(\\d{2})\\s(\\D{3})."));
        //Assertions.assertEquals(errorMsgField, "Ошибка аутентификации." + "\n" + "Проверьте правильность указания логина и пароля.");
    }


// "(\\D{2})\\s(\\D{5})\\s(\\D{12})\\s(\\D{5})\\s.\\s(\\D{6})\\s\\d\\s(\\D{4}).\\s(\\D)\\s(\\D{5})\\s(\\D{12})\\s(\\D{4})\\s(\\D)\\s(\\D{7})\\s(\\D{9}).\\s(\\D{9})\\s(\\D{7})\\s(\\D{5})\\s(\\d{2})\\s(\\D{3})\\s(\\d{2})\\s(\\D{3})."


}
*/
