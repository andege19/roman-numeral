// package test.pkgcase;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andege
 */
public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static void main(String[] args) {
        RomanNumeral romanNumeral = new RomanNumeral();
        System.out.println("Conversion result: " + romanNumeral.romanToInt("XXIV"));
    }

    public int romanToInt(String s) {
        int convertedNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
            if (currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }
        return convertedNumber;
    }
}
