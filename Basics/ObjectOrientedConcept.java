class ObjectOrientedConcept{
	public static void main(String args[]){
		fact obj = new fact();
		obj.fact();
		obj.display();
	}
}
class fact{
	int num=5;
	long fact=1;
	void fact(){
		for(int i =1;i<=num;i++)
			fact*=i;
	}
	void display(){
		System.out.println("Factorial Of " + num + " is "+ fact);
	}
}
