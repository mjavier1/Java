/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

class matriz{
    int n;
		double m[][];
		void capture(){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese el tamano de la matriz");
		   n=sc.nextInt();
		   m=new double[n][n];
		   for(int i=0;i<n;i++){
		       for(int j=0;j<n;j++){
		   System.out.println("Ingrese el elemento de la material" + i+""+j +"):");
		  m[i][j]=sc.nextDouble();
		 
		   }
		   
		   }
		   
		}
	void mostrarMatriz(){
	    System.out.println("matriz");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	               
	        System.out.println(m[i][j]+"\t");
	    }
	    System.out.println();
	    }  
	}	
        void SumarMatrizes(Matriz matriz1, Matriz matriz2){
        if(matriz1.n == matriz2.n){
           n=matriz1.n;
           m= new double[n][n];
           for(int i=0;i<n;i++)
           for(int j=0;j<n;j++){
              m[i][j]= matriz1.m[i][j]+matriz2.m[i][j];
              
              
           }
        }
        System.out.println("\n Resultado de la suma de matriz");
    
            
        }

    
} 

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		matriz m1=new   matriz();
		matriz m2=new matriz();
		m1.capture();
		m2.capture();
		
m1.mostrarMatriz();
m2.mostrarMatriz();
	
	    
	}
}
