class ObjectOrientedConcept{
	public static void main(String args[]){
		greater obj = new greater();
		obj.compare();
	}
}
class greater{
	int a=1,b=2,c=3;
	void compare(){
		display obj2 = new display();
		if(a>b&&a>c)
			obj2.display(a);
		else if(b>a&&b>c)
			obj2.display(b);
		else
			obj2.display(c);
	}
}
class display{
	void display(int x){
		System.out.println(x +" Is the Largest Among The Three Integers");
	}
}
