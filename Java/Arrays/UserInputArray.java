import java.util.*;
class UserInputArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size Of The List");
		int n = input.nextInt();
		int a[] = new int [n];
		for(int i =0;i<n;i++)
			a[i]=input.nextInt();
		System.out.printf("Index\tValue \n");
		for(int i =0;i<n;i++)
			System.out.printf(i +" \t \t"+ a[i] + " \n");
	}
}