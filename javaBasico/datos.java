/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
    /*
    byte 8bits
    int 32 bits
    longs 
    */
	public static void main(String[] args) {
		int edad1;
		long  segundos;
		int dias,difere,suma,div,edad2;
		edad1=20;
		edad2=10;
		dias=edad1*365;
		segundos=(long)dias*86400;
		System.out.println("De la edad1 han transcurrido");
		System.out.println(segundos);
		System.out.println("s");

		dias=edad2*365;
		segundos=(long)dias*86400;
		System.out.println("De la edad2 han transcurrido");
		System.out.println(segundos);
		System.out.println("s");
		difere = edad1-edad2;
			System.out.println("La diferencia de edades en anos son:");
		System.out.println(difere);
		System.out.println("s");
		
			suma = edad1+edad2;
			System.out.println("La suma de edades en anos son:");
		System.out.println(suma);
		System.out.println("s");
		
			div = edad1/edad2;
			System.out.println("La division de edades es:");
		System.out.println(div);
		System.out.println("s");
		
		
		
	}
}
