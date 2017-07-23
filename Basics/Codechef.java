import java.util.Scanner;

class Codechef{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		String s;
		while(test>=0){
			s=input.nextLine();
			opt object = new opt();
			object.calculate(s);
			System.out.println(test);
			test--;
		}		
	}
}
class opt{
	void calculate(String s){
		char ch[] =s.toCharArray();
	}
}