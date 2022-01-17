/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

class Matriz{
    int n;
		double m[][];
		void capture(){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Ingrese el tamano de la matriz");
		   n=sc.nextInt();
		   m=new double[n][n];
		   for(int i=0;i<n;i++){
		       for(int j=0;j<n;j++){
		   System.out.println("Ingrese el elemento de la material " + i+" "+j + "):");
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
	//sumarMatrices(Matriz matriz1,Matriz matriz2) 
   void sumarMatrices(Matriz matriz1,Matriz matriz2){
        if(matriz1.n == matriz2.n){
           n=matriz1.n;
           m= new double[n][n];
           for(int i=0;i<n;i++)
           for(int j=0;j<n;j++){
              m[i][j]= matriz1.m[i][j]+matriz2.m[i][j];
              
              
           }
        }
        else {
            System.out.println("\nLas matric0es no tienen la misma  dimension");
      
        }
        
        System.out.println("\n Resultado de la suma de matriz");
        } 



void restamartiz(Matriz matriz1,Matriz matriz2){
        if(matriz1.n == matriz2.n){
           n=matriz1.n;
           m= new double[n][n];
           for(int i=0;i<n;i++)
           for(int j=0;j<n;j++){
              m[i][j]= matriz1.m[i][j]-matriz2.m[i][j];
              
              
           }
        }
        else {
            System.out.println("\nLas matric0es no tienen la misma  dimension");
      
        }
        
        System.out.println("\n Resultado de la resta de matriz");
        } 




void multiamartiz(Matriz matriz1,Matriz matriz2){
        if(matriz1.n == matriz2.n){
           n=matriz1.n;
           m= new double[n][n];
           for(int i=0;i<n;i++)
           for(int j=0;j<n;j++){
              m[i][j]= matriz1.m[i][j]*matriz2.m[i][j];
              
              
           }
        }
        else {
            System.out.println("\nLas matric0es no tienen la misma  dimension");
      
        }
        
        System.out.println("\n Resultado de la multiplicar  de matriz");
        } 



void diviamartiz(Matriz matriz1,Matriz matriz2){
        if(matriz1.n == matriz2.n){
           n=matriz1.n;
           m= new double[n][n];
           for(int i=0;i<n;i++)
           for(int j=0;j<n;j++){
              m[i][j]= matriz1.m[i][j]/matriz2.m[i][j];
              
              
           }
        }
        else {
            System.out.println("\nLas matric0es no tienen la misma  dimension");
      
        }
        
        System.out.println("\n Resultado de la division de matriz");
        } 








    
} 

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Matriz m1=new   Matriz();
		Matriz m2=new Matriz();
		m1.capture();
		m2.capture();
		
m1.mostrarMatriz();
m2.mostrarMatriz();
Matriz m3= new Matriz();
m3.sumarMatrices(m1, m2);
m3.mostrarMatriz();
m3.restamartiz(m1, m2);
m3.mostrarMatriz();
m3.multiamartiz(m1,m2);
m3.mostrarMatriz();
m3.diviamartiz(m1, m2);

m3.mostrarMatriz();
				
	
	
	
	
	
	
	
	    
	}
}
