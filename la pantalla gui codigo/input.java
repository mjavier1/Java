package inputpane;
import javax.swing.JOptionPane;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn=JOptionPane.showInputDialog("Enter first number");
		String n=JOptionPane.showInputDialog("Enter first number");

		
		int num1= Integer.parseInt(fn);
		int num2= Integer.parseInt(n);
		int total=num1+num2;
		JOptionPane.showMessageDialog(null,"The answer is "+ total , "the title" ,JOptionPane.PLAIN_MESSAGE );
		
	}

}
