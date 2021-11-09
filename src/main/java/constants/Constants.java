package constants;

import common.SupportingMethods;

public class Constants {

    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 10;
        public static final int EXPLICIT_WAIT = 15;
    }
    public static class Urls{
        public static final String AUTHORIZATION_PAGE_URL = "https://online.mkb.ru/";
    }
    public static class AuthorizationTestData {
        public static final String AUTHORIZATION_LOGIN = SupportingMethods.RandomWord.generateRandomString(8);
       // public static final String AUTHORIZATION_LOGIN = "TESTERmkb";
        public static final String INVALID_PASSWORD = "!Q2w3e4r";
    }


    public static class ErrorsMessages{
        public static final String FIRST_AUTHORIZATION_FAIL = "Ошибка аутентификации." + "\n" + "Проверьте правильность указания логина и пароля.";
        public static final String SECOND_AUTHORIZATION_FAIL = "Вы ввели неправильный логин / пароль 3 раза. В целях безопасности вход в систему ограничен. Повторите попытку через 14 мин 59 сек.";
        public static final String REG_EX_SECOND_AUTHORIZATION_FAIL = "(\\D{2})\\s(\\D{5})\\s(\\D{12})\\s(\\D{5})\\s.\\s(\\D{6})\\s\\d\\s(\\D{4}).\\s(\\D)\\s(\\D{5})\\s(\\D{12})\\s(\\D{4})\\s(\\D)\\s(\\D{7})\\s(\\D{9}).\\s(\\D{9})\\s(\\D{7})\\s(\\D{5})\\s(\\d{2})\\s(\\D{3})\\s(\\d{2})\\s(\\D{3}).";
        public static final String REG_EX_THIRD_AUTHORIZATION_FAIL = "(\\D{5})\\s(\\D{2})\\s(\\D{5})\\s(\\D{12})\\s(\\D{5})\\s.\\s(\\D{6})\\s\\d\\s(\\D{4}).\\s(\\D)\\s(\\D{5})\\s(\\D{12})\\s(\\D{4})\\s(\\D)\\s(\\D{7})\\s(\\D{9}).\\s(\\D{9})\\s(\\D{7})\\s(\\D{5})\\s(\\d{2})\\s(\\D{3})\\s(\\d{2})\\s(\\D{3}).";

    }

}
