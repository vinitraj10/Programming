import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Rag extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordfield;

	public Rag(){
		super("This is Title Bar");
		setLayout(new FlowLayout());

		item1 = new JTextField(10);
		add(item1);

		item2 = new JTextField("Enter Text Here");
		add(item2);

		item3 = new JTextField("Uneditable",20);
		item3.setEditable(false);
		add(item3);

		passwordfield = new JPasswordField("Enter the Password",10);
		add(passwordfield);

		thehandler handler = new thehandler();

		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordfield.addActionListener(handler);
	}

	private class thehandler implements ActionListener{

		public void actionPerformed(ActionEvent event){
			String string = "";

			if(event.getSource()==item1)
				string = String.format("Field 1 is %s",event.getActionCommand());
			else if(event.getSource()==item2)
				string = String.format("Field 2 is %s",event.getActionCommand());
			else if(event.getSource()==item3)
				string = String.format("Field 3 is %s",event.getActionCommand());
			else if(event.getSource()==passwordfield)
				string = String.format("Password field is %s",event.getActionCommand());

			JOptionPane.showMessageDialog(null,string);
		}
	}

}