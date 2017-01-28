import java.util.Random;
public class ArRand{
	public static void main(String args[]){
		Random rand = new Random();
		int arr[] = new int[7];
		for(int roll=1;roll<1000;roll++){
			++arr[1+rand.nextInt(6)];
		}
		System.out.println("Face\t Rolls");
		for(int face=1;face<arr.length;face++){
			System.out.println(face+ " \t " + arr[face]);
		}
	}
}//Array used for counting The rolls Of dice