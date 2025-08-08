
// Problem-1: Palindrome Detector 
// Objective: 
// Check if each word in a sentence is a palindrome. 
// Instructions: 
// 1. Ask the user to input a sentence. 
// 2. Extract all words and store them in an ArrayList<String>. 
// 3. Check each word to see if it’s a palindrome. 
// 4. Display a list of palindrome words. 
// Sample Input and Output: 
// Enter a sentence: Madam Arora teaches malayalam 
// Palindromes found: madam, arora, malayalam 

import java.util.*;

public class problem_1 {
    public static void main(String[] args) {
        // Step 1: Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Step 2: Extract words into ArrayList
        String[] words = sentence.split("\\s+");  // Split by spaces
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));

        // Step 3: Check each word for palindrome
        ArrayList<String> palindromes = new ArrayList<>();
        for (String word : wordList) {
            String cleaned = word.toLowerCase(); // Case-insensitive
            if (isPalindrome(cleaned)) {
                palindromes.add(cleaned);
            }
        }

        // Step 4: Display result
        if (palindromes.isEmpty()) {
            System.out.println("No palindromes found.");
        } else {
            System.out.println("Palindromes found: " + String.join(" ", palindromes));
        }

        scanner.close();
    }

    // Helper method to check palindrome
    private static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
