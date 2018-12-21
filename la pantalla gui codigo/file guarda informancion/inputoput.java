import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class inputoput extends JFrame{
JLabel label;
JTextField tf;
JButton	bu;

public inputoput() {
	setLayout(new FlowLayout());
	label=new JLabel("Enter text to wreit to file");
	add(label);
	tf=new JTextField(10);
	add(tf);
	bu=new JButton("write to file");
	add(bu);
	event e =new event();
	bu.addActionListener(e);
}

public class event implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		try {
			String word= tf.getText();
			FileWriter stream = new 	FileWriter("E:\\eclipse-committers-oxygen-3-win32-x86_64\\fileinput txt\\file.doc"); 
			
		BufferedWriter out = new BufferedWriter (stream);
		out.write(word);
		out.close();
		
		}catch(Exception ex) {}

  }
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	inputoput gui = new inputoput();
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setSize(300,150);
	gui.setTitle("title");
	gui.setVisible(true);
	
}

}


