/*A program that uses nested loops to print all three-digit numbers where the sum of the square of the digits equals the number itself.*/


public class SumOfSquares{
  public static void main(String[] args){
  
  int count;
  int number;
  int numberExtract;
  int numberRemainder;
  int numberExtractSquare;
  int sumOfnumberExtractSquare;
  
  for(number = 100; number <= 999; number++){
    numberRemainder = number;
    sumOfnumberExtractSquare = 0;
    
    for(count = 1; count <= 3; count++){
      numberExtract = numberRemainder % 10;
      numberExtractSquare = numberExtract * numberExtract;
      
      sumOfnumberExtractSquare = sumOfnumberExtractSquare + numberExtractSquare;
      
      numberRemainder = numberRemainder/10;         
      }
   
  if(sumOfnumberExtractSquare == number){
    System.out.print(number);
  } 
     
  }
  
}
}
