public class Buck{
	public static void main(String args[]){
		Tuna object = new Tuna(10);
		for(int i=0;i<=5;i++){
			object.add();
			System.out.printf("%s",object);
		}
	}
}