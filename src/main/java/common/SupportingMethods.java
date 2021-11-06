package common;

import javax.annotation.RegEx;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static constants.Constants.ErrorsMessages.REG_EX_SECOND_AUTHORIZATION_FAIL;

public class SupportingMethods {

    public class RandomWord {

        public static String generateRandomString(int length) {
            Random r = new Random();
            StringBuffer sb = new StringBuffer();
            while (sb.length() < length) {
                sb.append(Integer.toHexString(r.nextInt()));
            }
            return sb.toString().substring(0, length);
        }
    }


    public static void main(String[] args) {
        String  a = null;
        String text = "Вы ввели неправильный логин / пароль 3 раза. В целях безопасности вход в систему ограничен. Повторите попытку через 14 мин 18 сек.";
        Pattern pattern = Pattern.compile("(\\D{2})");
        Matcher matcher = pattern.matcher(text);
        boolean kek=false;
        while (matcher.find()) {
            System.out.println(a = text.substring(matcher.start(), matcher.end()));
        }
        if (a == text)
            kek = true ;
        System.out.println(a + "\n" + text);
        System.out.print(kek);
    }


}
