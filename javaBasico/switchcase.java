import java.util.Scanner;
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  //switch basico numero a diez falta arreglarlo 
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese su mes de nacimiento numero : ");
		int mes = sc.nextInt();
		switch(mes){
		   
	 case 1:
	     break;
	 case 2:
	  //   System.out.println("usted nacio en inverno");
		break;
		    	 case 3:
		    	     break;
	 case 4:
	     break;
	     	 case 5:
	     	     break;
	 case 6:
	     System.out.println("usted nacio en inverno");
	     break;
	        	 case 7:
	        	     break;
	 case 8:
	     break;
	     	 case 9:
	     	     break;
	 case 10:
	     break;
	     	 case 11:
	     	     break;
	 case 12: 
	       System.out.println("usted nacio en inverno");
	     break;
	
	     default:
	     System.out.println("El mes no valido");
	     break;
	     
	     
	     
		}
		
		
		
		
	}
}
