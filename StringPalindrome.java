/*A program that uses a loop to check whether a string entered by the user is a palindrome*/

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = inputCollector.nextLine();
        
        String reversedWord = "";

        for (int count = word.length() - 1; count >= 0; count--) {
            reversedWord = reversedWord + word.charAt(count);
        }
        
        if (word.equals(reversedWord)) {
            System.out.println(word + " is a palindrome.");
        } 
        else {
            System.out.println(word + " is not a palindrome.");
        }
  }
}
  
