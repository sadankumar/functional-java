package org.problam;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String str = "java program";
        countDuplicateChar(str);
    }

    private static void countDuplicateChar(String str) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            charMap.compute(ch, (k,v)-> (v == null)? 1 : ++v);
        }
        charMap.entrySet()
                .stream()
                .forEach(e -> {

                    System.out.println( e.getKey() + ":" + e.getValue());

                });
    }
}
