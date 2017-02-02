public class Array3{
	public static void main(String args[]){
		System.out.println("The program is for Showing Array Table");
		System.out.println("Index \t Value");
		int arr[]={32,45,67,89,90,103},sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println(i + "\t" + arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("And The Sum is " + sum);
	}
}