import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class sele extends JFrame {
	JMenuBar menubar;
	JMenu help;	
	JMenuItem about;
	JMenuItem c;
	
	public sele() {
		setLayout(new FlowLayout());
		menubar = new JMenuBar();
		add(menubar);
		help = new JMenu("Help");
		menubar.add(help);
		about=new JMenuItem("About");
		help.add(about);
		setJMenuBar(menubar);
		c=new JMenuItem("c");
		help.add(c);
		setJMenuBar(menubar);
		
	}	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			helpwin gui = new  helpwin(sele.this);
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			gui.setSize(300,100);
			gui.setLocation(300,300);
			gui.setVisible(true);
		
			
		}
	}

		public static void main(String args[]) {
			sele gui= new sele();	
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(300,100);
			gui.setVisible(true);
			gui.setTitle("Main window");
		
			
			
		}	





}
