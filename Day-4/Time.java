public class Time{
	public static void main(String args[]){
		Constructor object = new Constructor();
		Constructor object1 = new Constructor(12);
		Constructor object2 = new Constructor(5,13);
		Constructor object3 = new Constructor(5,13,43);
		Time2 obj = new Time2(4,5,6);
		System.out.printf("%s\n",object.toMilitary());
		System.out.printf("%s\n",object1.toMilitary());
		System.out.printf("%s\n",object2.toMilitary());
		System.out.printf("%s\n",object3.toMilitary());
	}
}