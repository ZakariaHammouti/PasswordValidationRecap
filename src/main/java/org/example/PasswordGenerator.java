package org.example;

import java.util.Random;

public class PasswordGenerator {
    private static final char[] POSSIBLE_CHARS = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',

            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',

            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',

            '!', '#', '$', '%', '&', '/', '(', ')', '=', '?', '+', '-',
            '*', '_', '.', ',', ':', ';'
    };


    public static String generate() {
        String passwordCandidate;
        do {
            char[] chars = new char[8];

            for (int i = 0; i < chars.length; i++) {
                int charIndex = new Random().nextInt(POSSIBLE_CHARS.length - 1);
                chars[i] = POSSIBLE_CHARS[charIndex];
            }
            passwordCandidate = new String(chars);
        } while (!PasswordValidation.isSafe(passwordCandidate));

        return passwordCandidate;
    }
}
