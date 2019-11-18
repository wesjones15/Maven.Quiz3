package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) + String.valueOf(str.charAt(indexToCapitalize)).toUpperCase() + str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        String out = "";
        for (int i = 0; i < string.length()-1; i++) {
            for (int j = i+1; j <= string.length(); j++) {
                String sub = string.substring(i,j);
                if (!out.contains(" "+sub+" ")) out = out + " " + sub;
            }
        }
        out = out + " " + string.substring(string.length()-1);
        return out.trim().split(" ");
    }

//    public static Integer getNumberOfOccurrances(ArrayList<String> array, String str) {
//        Integer count = 0;
//        for (String item : array) {
//            if (item.equals(str)) count++;
//        }
//        return count;
//    }

    public static Integer getNumberOfSubStrings(String input){
        Integer num = input.length();
        Integer out = 0;
        while (num >0) {
            out += num;
            num --;
        }
        return out-1;//getAllSubStrings(input).length;
    }
}
