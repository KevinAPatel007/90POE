package com.exercise;

import java.util.*;

public class VowelCount {

    public static boolean main(String[] args) {
        if (args.length > 4) {
            System.out.println("Extra arguments passed.");
        } else {
            Map<String, Integer> vowelCount = new LinkedHashMap<>();
            Map<String, Integer> consonantCount = new LinkedHashMap<>();
            List<String> argumentList = Arrays.asList(args);
            System.out.println(argumentList);
            argumentList.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
            argumentList.forEach(argument -> consonantCount.put(argument, getConsonantCount(argument)));
            System.out.println("Number of Vowel are :" + vowelCount);
            System.out.println("Number of Consonant are :" + consonantCount);
            return true;
        }
        return false;
    }

    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

    private static Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[^aeiou]")).count();
    }

}
