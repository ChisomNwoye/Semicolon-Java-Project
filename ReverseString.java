/*A program that uses a loop to reverse a string entered by the user without using any built-in reverse method.*/
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = inputCollector.nextLine();

        String reversedWord = "";
        
        for (int count = word.length() - 1; count >= 0; count--) {
            reversedWord = reversedWord + word.charAt(count);
        }

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
}
