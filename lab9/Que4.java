package lab9;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Initialize counters
        int digitCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        int vowelCount = 0;
        int wordCount = 0;

        // Convert the sentence to character array for analysis
        char[] chars = sentence.toCharArray();

        // Loop through each character in the sentence
        for (char ch : chars) {
            // Check if character is a digit
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            // Check if character is an alphabet
            else if (Character.isAlphabetic(ch)) {
                alphabetCount++;
                // Check if character is uppercase
                if (Character.isUpperCase(ch)) {
                    upperCaseCount++;
                }
                // Check if character is lowercase
                else {
                    lowerCaseCount++;
                }
                // Check if character is a vowel
                if (isVowel(ch)) {
                    vowelCount++;
                }
            }
            // Check if character is a special character
            else if (!Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        // Calculate word count
        String[] words = sentence.split("\\s+");
        wordCount = words.length;

        // Display results
        System.out.println("a) Total number of digits: " + digitCount);
        System.out.println("b) Total number of uppercase letters: " + upperCaseCount);
        System.out.println("   Total number of lowercase letters: " + lowerCaseCount);
        System.out.println("c) Total number of alphabets: " + alphabetCount);
        System.out.println("d) Total number of special characters: " + specialCharCount);
        System.out.println("e) Total number of vowels: " + vowelCount);
        System.out.println("f) Total number of words: " + wordCount);

        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
