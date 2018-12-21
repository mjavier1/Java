package inputpane;
import javax.swing.JOptionPane; //la libria para funciona dos texto

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Marcos aguirre
	 * programa termite corre dos input despues sumar
	 * https://www.youtube.com/watch?v=jJjg4JweJZU&index=2&list=PLcTTsr6vQDf3pW0MfF33rTOufHKG-8HZL
	 * tambien tien loop es do while
	 * 
	 * 
	 * */
		int x = 1;
	 do {
		
	
		
		String fn=JOptionPane.showInputDialog("Enter first number");
		String n=JOptionPane.showInputDialog("Enter first number");

		
		int num1= Integer.parseInt(fn);
		int num2= Integer.parseInt(n);
		int total=num1+num2;
		JOptionPane.showMessageDialog(null,"The answer is "+ total , "the title" ,JOptionPane.PLAIN_MESSAGE );
			 x++;
		} while (x <= 2);
	}

	
}
