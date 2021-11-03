package constants;

public class Constants {
    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }
    public static class Urls{
        public static final String AUTHORIZATION_PAGE_URL = "https://online.mkb.ru/";
    }
    public static class AuthorizationTestData {
        public static final String AUTHORIZATION_LOGIN = "MKBTester";
        public static final String AUTHORIZATION_PASSWORD = "!Q2w3e4r";
    }
    public static class ErrorsMessages{
        public static final String FIRST_AUTHORIZATION_FAIL = "Ошибка аутентификации.\\n\" +\n" +
                "                                 \"Проверьте правильность указания логина и пароля.";
        public static final String SECOND_AUTHORIZATION_FAIL = "Вы ввели неправильный логин / пароль 3 раза. В целях безопасности вход в систему ограничен. Повторите попытку через";

    }

}
