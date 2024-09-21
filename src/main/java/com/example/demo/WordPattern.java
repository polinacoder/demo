package com.example.demo;

import java.util.*;


public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abca", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        if (pattern.isEmpty() || pattern.length() >= 300) {
            return false;
        }
        if (s.isEmpty() || s.length() >= 3000) {
            return false;
        }
        String[] strings = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (pattern.length() == strings.length) {
            for (int i = 0; i <= pattern.length() - 1; i++) {
                if (!map.containsValue(strings[i])) {
                    map.putIfAbsent(pattern.charAt(i), strings[i]);
                }
            }
        } else {
            return false;
        }
        int count = 0;
        for (int i = 0; i <= pattern.length() - 1; i++) {
            if (Objects.equals(map.get(pattern.charAt(i)), strings[i])) {
                count++;
            }
        }
        return count == pattern.length();
    }
}
