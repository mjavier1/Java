import java.util.Scanner;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class factorizar{
    int fact(int i){
        int resultado;
        if(i==1) return 1;
        resultado = fact(i-1)*i;
        return resultado;
        
        
    }
}

public class Main
{
	public static void main(String[] args) {
		
		factorizar f  = new factorizar();
		Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero :");
		numero = sc.nextInt();
		System.out.println("El factorial de " + numero +" es :" +f.fact(numero));
		
		
		
		
		
		
		
		
		
		System.out.println("Hello World");
	}
}
