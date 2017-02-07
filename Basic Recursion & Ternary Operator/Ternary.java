import java.util.Scanner;
public class Ternary{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Age We will notify You that Whether You Are 18+ or not?");
		int age;
		age = input.nextInt();
		System.out.println(age>18?"You are Adult":"You Are Not Adult");
	}
}