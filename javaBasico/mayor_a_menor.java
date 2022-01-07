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
		int arreglo[]=new int[10];
		Scanner sc= new Scanner(System.in);
		for (int i=0; i<9; i++){
		    
		    System.out.println("ingrese el numero" +i +": ");
		    arreglo[i]=sc.nextInt();
		    
		    
		}
		//version for each en java 
		System.out.println("\nArreglo ingresado");
		for (int x:arreglo ) {
		    System.out.println(x+"\t");
		    
		    
		}
		int temp;
		for(int i=0; i<arreglo.length;i++){
		    
		    for(int j=0; j<arreglo.length; j++){
		        if (arreglo[i]>arreglo[j]){
		           temp= arreglo[j];
		           arreglo[j]=arreglo[i];
		           arreglo[i]=temp;
		           
		        } 
		        
		    
		}
		
		System.out.println("\nArreglo ordenado de mayor a menor");
	    for(int x=9;i>=0;i--){
	       System.out.println(x+"\t"); 
	       
	    }
	    	System.out.println("\nArreglo ordenado de menor a  mayor");
	    for(int x:arreglo){
	       System.out.println(x+"\t"); 
	       System.out.println(arreglo[i]+"\t");
	       
	       
	    
	    }
	    
	}
	}
}
