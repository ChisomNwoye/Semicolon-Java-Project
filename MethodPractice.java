import java.util.Scanner;

public class MethodPractice{

  static int summation(){
  
    int firstNumber;
    int secondNumber;
    int sum;
    
    Scanner inputCollector = new Scanner(System.in);
    System.out.print ("Enter the first Number: ");
    firstNumber = inputCollector.nextInt();
    
    System.out.print ("Enter the second Number: ");
    secondNumber = inputCollector.nextInt();
    
    sum = firstNumber + secondNumber;
    
    //System.out.println("Sum is: "+sum);
    return sum;
      
  }

  public static void main(String[] args){

    int result = summation();
    System.out.println("Sum is: "+result);
}

}
