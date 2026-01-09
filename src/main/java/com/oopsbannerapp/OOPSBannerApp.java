package com.oopsbannerapp;

import java.util.HashMap;

public class OOPSBannerApp {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[]{
                "   ***    ",
                " **   **  ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "   ***    "
        });
        charMap.put('P', new String[]{
                "******    ",
                "**    **  ",
                "**     ** ",
                "**    **  ",
                "******    ",
                "**        ",
                "**        ",
                "**        ",
                "**        "
        });
        charMap.put('S', new String[]{
                "    ***** ",
                "  **      ",
                "**        ",
                "  **      ",
                "    ***   ",
                "      **  ",
                "        ** ",
                "      **   ",
                " *****     "
        });
        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;
        char[] chars = message.toCharArray();

        for (int line = 0; line < patternHeight; line++) {
            for (char ch : chars) {
                String[] pattern = charMap.get(ch);
                System.out.print(pattern[line]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String dataMessage = "OOPS";
        displayBanner(dataMessage, charMap);
    }
}
