import java.io.*;
class Buf{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The integer :");
		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
	}
}