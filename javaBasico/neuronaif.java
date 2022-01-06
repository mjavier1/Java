import java.util.Scanner;
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
		Scanner sc = new Scanner(System.in);
		int x1,x2;
		System.out.println("Ingrese un valor logico (1,0) :");
		x1=sc.nextInt();
	    System.out.println("Ingrese un valor logico (1,0) :");
		x2=sc.nextInt();
		double w1=0.5,w2=0.5;
		double b=-0.6;
		boolean resultado=true;
		System.out.println("Que operacion desea realizar"
		
		+"AND-bool, and neurona, 3 or bool");
		int opcion;
		opcion=sc.nextInt();
		if (opcion ==1){
		    resultado =x1 == 1&x2 ==1;
		    
		    
		} else if(opcion==2){
		    double f=x1*w1*w2*w2+b;
		    resultado = f>=0;
		    
		    
		}else if(opcion==3){
		    resultado = (x1+x2) >=1;
		    
		    
		}else{
		    
		System.out.println("seleccion no valida");
		    
		}
		System.out.println("El resultado de la operacion sale" + resultado);
		
		
		
	}
}
