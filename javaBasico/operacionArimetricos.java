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
	
	//Scanner sc= new Scanner(System.in);
	//System.out.println("Ingrese el tiempo de analsis t =");
	
	System.out.println("Asignacion inefiente\n");
	int a=5,b=7,c=4,d=6,e=10;
	// a = a+3;
	// b = b-9*a;
	// c=c*6;
	 //d=d/3;
	 //e=e%2;
//incremento y decremento
//b=5 + a++;
//c=3 +b++;
//d=7+e--;
System.out.println("incremento y decremento como prefijos\n");
a=5;b=7;c=4;d=6;e=10;
//cuando el operador esta como prefijp primero se hace la operacion y despues se hace la asignacion
a= --e+6;
b= --d+3;
e = --c+ a++;




	 System.out.println("a = "+a);
	 	 System.out.println("b = "+b);
	 	 	 System.out.println("c = "+c);
	 System.out.println("d= "+d);
	 	 	 System.out.println("e = "+e);


        System.out.println("Asignacion eficiente");
//incremento y decremento prefijos subfijos
//la expresion a=a+1; a+=1; es equivalente




	}
}
