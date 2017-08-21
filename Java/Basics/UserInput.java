import java.util.*;
public class UserInput{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The String Input:");
		String s = input.nextLine();
		System.out.println("You Entered " + s);
		System.out.println("Enter The Integer Input:");
		int n= input.nextInt();
		System.out.println("You Entered " + n);
		System.out.println("Enter The Float Input:");
		float f=input.nextFloat();
		System.out.println("You Entered " + f);
		System.out.println("Enter The Double Input:");
		double d = input.nextDouble();
		System.out.println("You Entered " + d);
		System.out.println("Enter The  Long Input:");
		long l = input.nextLong();
		System.out.println("You Entered " + l);
		System.out.println("Enter The  Char Input:");
		char c = input.next().charAt(0);
		System.out.println("You Entered " + c);

	}
}