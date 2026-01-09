package com.oopsbannerapp;

public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] dataText = {
                String.join("  ",
                        "   ***  ", "    ***  ", " ****** ", "     *****"),
                String.join("  ",
                        " **   **", "  **   **", " **    **", "  **    "),
                String.join("  ",
                        "**     **", "**     **", "** ", "  **", "**"),
                String.join("  ",
                        "**     **", "**     **", "**    **", "   **   "),
                String.join("  ",
                        "**     **", "**     **", "******    ", "   ***"),
                String.join("  ",
                        "**     **", "**     **", "**    ", "          **"),
                String.join("  ",
                        "**     **", "**     **", "**    ", "           **"),
                String.join("  ",
                        " **   **", "  **   **", " **    ", "          **"),
                String.join("  ",
                        "   ***   ", "   ***   ", "**    ", "     *****")
        };

        for (String line : dataText) {
            System.out.println(line);
        }
    }
}
