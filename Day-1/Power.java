import java.util.Scanner;

public class Pxp{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    double num,pow=1;
    int exp,i;
    System.out.println("Enter the Base :-");
    num = input.nextDouble();
    System.out.println("Enter the Exponent:-");
    exp = input.nextInt();
    if(exp==0){
      pow=1;
    }
    else{
      for(i=1;i<=exp;i++)
        pow=pow*num;
    }
    System.out.println("Result is " + pow );  
  }
}
