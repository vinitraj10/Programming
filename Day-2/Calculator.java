import java.util.Scanner;
public class Calculator{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    char operator;
    double num1,num2,result;
    System.out.println("Enter The No.s Respectively  ");
    num1 = input.nextDouble();
    num2 = input.nextDouble();
    System.out.println("Enter the operators like + - * / to Use the Calculator");
    operator = input.next().trim().charAt(0);
    switch(operator){
      case '+':
          result=num1+num2;
          System.out.println("The Addition is " + result);
          break;
      case '-':
          result = num1-num2;
          System.out.println("The Subtraction is " + result);
          break;
      case '*' :
          result = num1*num2;
          System.out.println("The Multiplication is " + result);
          break;
      case '/' :
          result = num1/num2;
          System.out.println("The Division is " + result);
          break;
      default:
        System.out.println("Please Enter a valid operator");
        break;
    }
  }
}
