package org.example.codingBat;

import java.util.Map;
import java.util.HashMap;

public class wordcount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String string : strings) {
            if(map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }
}