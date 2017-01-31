public class Main{
	public static void main(String args[]){
		Food object[] = new Food[2];
		object[0]= new Main2();
		object[1]=new Main3();
		for(int i=0;i<2;i++){
			object[i].eat();
		}
	}
}