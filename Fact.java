import java.util.Scanner;
public class Fact{
  public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    int i,num,fact=1;
    System.out.println("Enter the No. to caluculate its Factorial");
    num=input.nextInt();
    for(i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println("Factorial of " + num + " is " + fact);
  }
}
