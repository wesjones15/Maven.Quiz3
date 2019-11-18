package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        String[] output = new String[countAlpha(str)];
        Integer lastCapIdx = 0;
        for (int i = 0; i < output.length; i++) {
            StringBuilder waver = new StringBuilder();
            Integer capIdx = getNextAlphaIdx(str, lastCapIdx);
            lastCapIdx = capIdx+1;

            for (int j = 0; j < str.length(); j++) {
                String letter = String.valueOf(str.charAt(j));
                if (j == capIdx) letter = letter.toUpperCase();
                waver.append(letter);
            }
            output[i] = waver.toString();
        }
        return output;
    }

    public static Boolean isAlpha(String letter) {
        return letter.matches("[A-Za-z]");
    }

    public static Integer countAlpha(String str) {
        Integer count = 0;
        for (Character c : str.toCharArray()) {
            if (isAlpha(c.toString())) count++;
        }
        return count;
    }

    public static Integer getNextAlphaIdx(String str, Integer index) {
        for (int i = index; i < str.length(); i++) {
            String letter = String.valueOf(str.charAt(i));
            if (isAlpha(letter)) return i;
        }
        return -1;
    }
}
