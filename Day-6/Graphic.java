import javax.swing.JOptionPane;

public class Graphic{
	public static void main(String args[]){

		String fn = JOptionPane.showInputDialog("Enter The First Number");
		String sn = JOptionPane.showInputDialog("Enter The Second Number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);

		int sum = num1+num2;

		JOptionPane.showMessageDialog(null,"The Answer is " +sum,"Addition By Gui Interface",JOptionPane.PLAIN_MESSAGE);
			
	}
}