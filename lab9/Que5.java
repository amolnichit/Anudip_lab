package lab9;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or a string: ");
        String input = scanner.nextLine();

        String output = removeVowels(input);

        System.out.println("After removing vowels: " + output);

        scanner.close();
    }

    private static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is not a vowel
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
