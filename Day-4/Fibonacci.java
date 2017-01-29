import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n,fib;
		System.out.println("Which Term No of Fibonacci do you want To print");
		n=input.nextInt();
		fib=fib(n);
		System.out.println("That term is " + fib);
	}
	private static int fib(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
}