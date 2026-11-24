import java.util.Scanner;
public class LargestNumberFinder{
  public static void main(String[] args){
  
  int counter = 1;
  int largest = 0;
  int number;
  
  Scanner inputCollector = new Scanner(System.in);
   
  while(counter <= 10){
     System.out.printf("Enter your Number%d: ",counter);
     number = inputCollector.nextInt();
     
     if(number > largest){
     largest = number;
     }
     counter++;
  
  }
  
  System.out.println("Largest Number is: " + largest);
  
  }

}
