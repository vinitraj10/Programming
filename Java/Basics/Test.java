class Test{
	public static void main(String args[]){
		sum obj = new sum();
		obj.show();
	}
}
class sum{
	void show(){
		System.out.println("I am in Sum class called in Test class");
	}
}