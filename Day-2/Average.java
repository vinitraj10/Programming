import java.util.Scanner;

public class Average{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int count=0,n;
		double sum=0,avg,num;
		System.out.println("Count of the Numbers which we want to Calculate the Average");
		n=input.nextInt();
		System.out.println("Enter those " + n + " Numbers");
		while(count<n){
			num=input.nextDouble();
			sum=sum+num;
			count++;
		}
		avg=sum/n;
		System.out.println("Average of those " + n + " Numbers is " + avg);
	}
}