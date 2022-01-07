package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingCharacters {
    public static void main(String[] args) {
        String characters = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. ";
       HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();

        char[] strArray = characters.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c,charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar: charCountMap.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }



}
