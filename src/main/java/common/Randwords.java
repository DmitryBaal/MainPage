package common;

import java.util.Random;

public class Randwords {

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
}
