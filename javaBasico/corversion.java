/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		//conversion
		//variable
		byte b;
		int i =129;
		
		double d=323.142;
		b=(byte)i;
		System.out.println("i y "+i+" "+b);
		
		System.out.println("\nConversion de double a int");
		i=(int)d;
		System.out.println("d y i "+d+" " +i);
		System.out.println("\nConversion de double a byte");
		b=(byte)d;
		System.out.println("d y b"+d+" "+b);
		System.out.println("\nConversion  automatica");
		byte c=42;
		char e='z';
		short t=1024;
		int k=50000;
		float f=5.67f;
		double w=0.1258;
		double resultado=(f*c)+(k/e)-(w*t);
		System.out.println(resultado);
		
	}
}
