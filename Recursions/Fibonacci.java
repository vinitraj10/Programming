import java.util.Scanner;
public class Fibonacci{
	private static long fib(long n){
		if(n==1||n==0)
            return 1;
        else
    	   return fib(n-1)+fib(n-2);
    }
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		long n,a;
			System.out.println("Which Term of Fibonacci Series You want to Print:");
			n=input.nextLong();
			a=fib(n);
			System.out.println(a);
		}
	}

