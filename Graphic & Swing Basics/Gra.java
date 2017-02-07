import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Gra extends JFrame{
	private JLabel item1;

	public Gra(){
		super("This is Title Bar");
		setLayout(new FlowLayout());
		item1 = new JLabel("This is Content of this");
		item1.setToolTipText("This is gonna Show Up Hover");
		add(item1);
	}

}