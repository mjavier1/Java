import java.awt.*;
import javax.swing.*;

public class helpwin extends  JDialog{
JLabel label;
public helpwin(JFrame frame) {
	super(frame,"help",true);
	setLayout(new FlowLayout());
	
	label=new JLabel("ff");
	add(label)
	;
}
	
}
