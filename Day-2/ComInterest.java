import java.util.Scanner;
public class ComInterest{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double p,r,temp=1,a;
		int t;
		System.out.println("Enter the Principal Amount:");
		p=input.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		r=input.nextDouble();
		r=r/100;
		System.out.println("Enter the Time Period");
		t=input.nextInt();
		for(int i=1;i<=t;i++){
			temp=temp*(1+r);
		}
		a=p*(temp);
		System.out.println("The Compound Interest On the Following Data is " + a);
	}
}