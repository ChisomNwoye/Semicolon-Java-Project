/*A program that uses a loop to display all characters in a string entered by the user that are at even index positions*/

import java.util.Scanner;

public class EvenIndexCharacters {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = inputCollector.nextLine();

        for (int count = 0; count < word.length(); count += 2) {
            System.out.println(word.charAt(count));
        }
  }
}
