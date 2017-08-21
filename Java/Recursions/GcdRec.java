import java.util.Scanner;
public class GcdRec{
	private static void swap(int n1,int n2){
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
	}
	private static int gcd(int n1,int n2){
		if(n1%n2==0)
			return n2;
		else
			return gcd(n2,n1%n2);
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n1,n2,gcd;
		System.out.println("Enter the Number Respectively:");
		n1=input.nextInt();
		n2=input.nextInt();
		if(n1<n2)
			swap(n1,n2);
		gcd=gcd(n1,n2);
		System.out.println("The Gcd of the following No is " + gcd);
	}
}