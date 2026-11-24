import java.util.Scanner;
public class TwoLargestNumbers{
  public static void main(String[] args){
  
  int counter = 1;
  int firstLargest = 0;
  int secondLargest = 0;
  int number;
  
  Scanner inputCollector = new Scanner(System.in);
   
  while(counter <= 10){
     System.out.printf("Enter your Number%d: ",counter);
     number = inputCollector.nextInt();
     
     if(number > firstLargest){
     firstLargest = number;
        if(firstLargest > secondLargest){
        secondLargest = firstLargest;
        }
     }
     counter++;
  
  }
  
  System.out.println("First Largest Number is: " + firstLargest);
  System.out.println("Second Largest Number is: " + secondLargest);
  
  }

}
