package com.gluegun.kata5;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 */
public class SimplePigLatin {


    public static String pigIt(String str) {

        StringBuilder result = new StringBuilder();

        String[] words = str.split("\\s");

        for (int i = 0; i < words.length; i++) {
            if (isPunctuationMark(words[i])) {
                result.append(words[i]).append(" ");
                continue;
            }
            words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    private static boolean isPunctuationMark(String sequence) {
        String[] punctuationMarks = new String[]{
                "!",
                ",",
                "\\'",
                ";",
                "\"",
                ".",
                "...",
                "-",
                "?",
                ":"
        };
        for (String punctuationMark : punctuationMarks) {
            if (punctuationMark.equals(sequence)) {
                return true;
            }
        }
        return false;
    }
}
