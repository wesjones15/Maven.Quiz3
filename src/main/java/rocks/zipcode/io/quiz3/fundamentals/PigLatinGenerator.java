package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    String[] vowels = {"a","e","i","o","u"};
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            message.append(piggify(words[i]));
            if (i != words.length-1) message.append(" ");
        }

        return message.toString();
    }
     public String piggify(String word) {
        String head = getConsos(word);
        if (isVowel(String.valueOf(word.charAt(0)))) {
            return word + "way";
        }
        return word.substring(head.length()) + head + "ay";
     }

     public Boolean isVowel(String letter) {
        for (String vowel : vowels) {
            if (vowel.equals(letter.toLowerCase())) return true;
        }
        return false;
     }

     public String getConsos(String str) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(String.valueOf(str.charAt(i)))) {
                out.append(str.charAt(i));
            } else break;
        }
        return out.toString();
     }
}
