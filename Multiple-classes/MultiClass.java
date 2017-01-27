public class MultiClass{
  private String girlName;
  public void simpleMessege(String name){
		girlName = name;
  }
  public String getname(){
	  return girlName;
  }
  public void saying(){
	  System.out.println("Your First Girlfrined Name was:" + getname());
  }
}
