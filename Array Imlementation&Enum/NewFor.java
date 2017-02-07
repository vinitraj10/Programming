public class NewFor{
	public static void main(String args[]){
		int arr[]={5,3,4,6,7,9};
		int total=0;
		for(int x:arr){
			total+=x;
		}
		System.out.println("Using Enhanced Loop We found Sum: " + total );
	}
}