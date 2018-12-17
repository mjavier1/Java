import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;



 public class button extends JFrame {
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	private JLabel label1;
	
		public button() {
		setLayout(new FlowLayout());
		label=new JLabel("Enter your name");
		add(label);
		textfield=new JTextField(20);
		add(textfield);
		button = new JButton("click me!!!");
		add(button);

		
		}
		
		public static void main(String[] args) {
	//	 TODO Auto-generated method stub
	button gui=new  button();
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setVisible(true);
	gui.setSize(200,150);
	gui.setTitle("Programa crear lo butones y label texto");
	}

}

