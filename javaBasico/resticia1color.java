/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	Scanner sc= new Scanner(System.in);
	String resitencia[]=new String[4];
	String cadena ="",tol ="";
	double R=0;
	int n=0;
	final String colores[]={
	    "negro","cafe","rojo","narajan","amarillo"
	    ,"verde","violeta","Gris","blanco","oro","plata"
	};
	final String tole[]={"-","1%","2%","-","-","%0.5","%0.25","%0.10","%0.05","%5","%10"};
	System.out.println("****cALCULO DE VALOres de resitencia");
	System.out.println("negro\t\tcafe\t\trojo\t\tnaraja");
	System.out.println("amarillo\tverde\t\tazul\t\tvioleta");
	
	System.out.println("Gris\t\tBlanco\t\tOro\t\tplata");
	while(n<4){
	    System.out.println("Ingrese un color valido :");
	    resitencia[n]=sc.next().toLowerCase();
	n++;
	    
	}
	
		
	}
}
