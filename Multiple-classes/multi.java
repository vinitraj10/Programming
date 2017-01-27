import java.util.Scanner;

class Multi{
  public static void main(String args[]){
      Scanner input= new Scanner(System.in);
      MultiClass object = new MultiClass();
      System.out.println("Enter the name here :");
      String name = input.nextLine();
      object.simpleMessege(name);
	  object.saying();
  }
}
