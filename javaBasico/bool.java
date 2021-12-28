/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    //boolean true o falso operadores basico 
    //igual otros 
    /*
    == igual a 
    != diferencia 
    > mayor que
    < menor que
    >=mayor o igual que
    <= menor o igual que
    
    */
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int a,b;
		a=7;
		b=5;
		boolean resultado = true;
		resultado = (a==b);
		System.out.println("El resultado del operador relacional es: "+ resultado);
		resultado = (a!=b);
		System.out.println("El resultado operador relacional es :" + resultado);
		resultado =(a>b);
		System.out.println("El resultado del operador relacional es :" + resultado);
			resultado= (a<b);
		System.out.println("El resultado del operador relacional es :" + resultado);
			resultado =(a>=b);
		System.out.println("El resultado del operador relacional es :" + resultado);
			resultado= (a<=b);
		System.out.println("El resultado del operador relacional es :" + resultado);
		
		
	}
}
