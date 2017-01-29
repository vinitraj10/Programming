public class Time2{
	private int month;
	private int day;
	private int year;
	
	public Time2(int m,int d,int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The Constructor for this %s \n",this);
	}
	public String toString(){
		return String.format("%d/%d/%d",month,day,year);
	}
}