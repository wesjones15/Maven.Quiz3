package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    static String[] vowels = {"a","e","i","o","u"};
    public static Boolean hasVowels(String word) {
        for (String vowel: vowels) {
            if (word.contains(vowel)) return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) return i;
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        for (String vowel : vowels) {
            if (vowel.equals(character.toString().toLowerCase())) return true;
        }
        return false;
    }
}
