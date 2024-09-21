package com.example.demo;


public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("raceacar"));
    }

    public static boolean isPalindrome(String s) {
        if (s.isBlank()) { return  true;}
        if (s.length() > 200000) { return false;}
        if (isPrintableASCII(s)) {
        StringBuilder sb = new StringBuilder();
        for (char aChar : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(aChar)) {
                sb.append(aChar);
                System.out.println(aChar);
            }
        }
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        return str2.equals(str1);
        }
        return false;
    }

    public static boolean isPrintableASCII(String s) {
        for (Character ch: s.toCharArray()) {
            if (ch > 127 || ch < 32){
                return false;
            }
        }
        return true;
    }
}
