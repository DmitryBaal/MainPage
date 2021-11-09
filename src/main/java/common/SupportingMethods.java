package common;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SupportingMethods {

    public static class RandomWord {

        public static String generateRandomString(int lineLength) {
            Random randomString = new Random();
            StringBuffer newLetter = new StringBuffer();
            while (newLetter.length() < lineLength) {
                newLetter.append(Integer.toHexString(randomString.nextInt()));
            }
            return newLetter.toString().substring(0, lineLength);
        }
    }


    public class RegExFindElement {
        public static boolean regExFind(String takenText, String receivedText, String regExpression){
            // takenText Текст взятый из элемента на странице
            boolean resultat=false;
            Pattern pattern = Pattern.compile(regExpression); //Регулярное выражение
            Matcher matcher = pattern.matcher(takenText); //сравнение
            while (matcher.find()) {
                receivedText = takenText.substring(matcher.start(), matcher.end());
            }
            if (receivedText == (takenText))
            { resultat = true;}
            else
            {
                if (receivedText == null){
                    System.out.println("Check RegEx");}
                else{
                    System.out.println("Expected: " + takenText);
                    System.out.println("Actual: " + receivedText);}
            }
            return resultat;

        }
    }

}
