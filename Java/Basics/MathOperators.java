import java.util.Scanner; //to make use of Scanner we need to import this

public class MathOperators {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); //this is a Scanner variable to take the further inputs in our program
    double num1,num2,sum,sub,prod,div;
    System.out.println("You can use the program to add,subtract,multiply,divide");
    System.out.println("Enter the First Number: ");
    num1 = input.nextDouble(); //input is scanner variable & .next is used with the data type of the variable to take the user input
    System.out.println("Enter the Second Number: ");
    num2 = input.nextDouble();
    sum=num1+num2;
    System.out.println("Sum of the Two no. " + sum );
    sub=num1-num2;
    System.out.println("Subtraction of the Two no " + sub);
    prod=num1*num2;
    System.out.println("Multiplication of the Two no." + prod);
    div=num1/num2;
    System.out.println("Division of the Two no. " + div);
  }

}
