/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main

//array for 
{
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Ingrese el tiempo de analsis t =");
	double t=sc.nextDouble();
	System.out.println("Valor ingresado t=" +t +"s");
	double posicion,velocidad,acelera;
	posicion=Math.pow(t, 3)-6*Math.pow(t, 2)-15*t+40;
	velocidad= 3*Math.pow(t, 2)-12*t-15;
	acelera=6*t-12;
	
	System.out.println("la posicion de la particula en el instante "+ t+"s es: "+posicion);
	
	System.out.println("la velocidad de la particula en el instante "+ t+"s es: "+velocidad);
	
	System.out.println("la acelerancion de la particula en el instante "+ t+"s es: "+acelera);


	}
}
