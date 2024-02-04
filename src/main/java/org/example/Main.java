package org.example;

import static org.apache.commons.lang3.text.WordUtils.capitalize;

public class Main {

    public static void main(String[] args) {
        //given
        String phrase = "How can mirrors be real if our eyes aren't real";

        //when
        String result = toJadenCase(phrase);
        System.out.println(result);
    }

    private static String toJadenCase(String phrase) {
        //empty string
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        //split

        String[] word = phrase.split(" ");
        //capitalize
        for (int i = 0; i < word.length; i++) {
            word[i] = capitalize(word[i]);
        }
        //sentence

        return String.join(" ", word);
    }
}