import java.util.Scanner;
public class Fibonacci{
	private static long fib(long n){
		if(n < 2)
        	return n;
    	long  a = 0,b = 1;
    	long ans=0;
    	int i = 1;
   		 while(i < n) {
        	ans = (a+b) % 1000000007;
        	a = b;
        	b = ans;
        	i++;
    	}
    	return ans;
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

