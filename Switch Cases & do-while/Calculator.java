import java.util.Scanner;
public class Calculator{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int opt;
    double num1,num2,result;
    System.out.println("Enter The No.s Respectively  ");
    num1 = input.nextDouble();
    num2 = input.nextDouble();
    System.out.println("Enter the operators like + - * / to Use the Calculator");
    do{
        System.out.println("Enter 1 To Add :");
        System.out.println("Enter 2 To Subtract:");
        System.out.println("Enter 3 To Multiply:");
        System.out.println("Enter 4 To Divide:");
        System.out.println("Enter the 0 to exit");
        opt=input.nextInt();
      switch(opt){
      case 1:
          result=num1+num2;
          System.out.println("The Addition is " + result);
          break;
      case 2:
          result = num1-num2;
          System.out.println("The Subtraction is " + result);
          break;
      case 3:
          result = num1*num2;
          System.out.println("The Multiplication is " + result);
          break;
      case 4:
          result = num1/num2;
          System.out.println("The Division is " + result);
          break;
      case 0: System.exit(0);
      default:
        System.out.println("Please Enter a valid operator");
        break;
      }

    }while(opt!=0);
    
  }
}
