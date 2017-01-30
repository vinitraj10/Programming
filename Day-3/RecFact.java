import java.util.Scanner;
public class RecFact{
	private static long Fact(int n){
		if(n==1)
			return 1;
		else
			return n*Fact(n-1);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number to Calculate Its Factorial Using Recursion:");
		int n;
		long Ans;
		n=input.nextInt();
		Ans = Fact(n);
		System.out.println("Factorial is " + Ans);
	}
}