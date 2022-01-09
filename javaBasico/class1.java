/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class piezas {
    String sistemaCAd;
    String sistemaCAm;
    String material;
    double costoTotal;
    double tiempoma;
    double cantidadpiezas;
    double costomolde;
    

    
}

public class Main
{
	public static void main(String[] args) {
		
		piezas piezascliente =new piezas();
		
		double costoinyecciontotal,costoinyeccionpiezas;;
		
		piezascliente.sistemaCAd="zw3d";
		piezascliente.sistemaCAm="abs";
		piezascliente.costoTotal=9265;
		piezascliente.tiempoma=17;
		piezascliente.cantidadpiezas=500;
		piezascliente.costomolde=8000;
		
	  costoinyecciontotal = piezascliente.costoTotal-piezascliente.costomolde;
      costoinyeccionpiezas = costoinyecciontotal/piezascliente.cantidadpiezas;
      
	System.out.println("El costo total de inyeccion es :" +costoinyecciontotal+" dolares");
		System.out.println("El costo de inyeccion por piezas es :" + costoinyeccionpiezas+ "dolares");
		System.out.println("El sistema cad en el que fue real" +piezascliente.sistemaCAd+ "dolares");
		System.out.println("El sistema cam en el que fue real" +piezascliente.sistemaCAm+ "dolares");
		System.out.println("El material de inyeccion es : "
		+ piezascliente.material);
		System.out.println("el costo del molde es : " +piezascliente.costomolde);
		
		
		//System.out.println("Hello World");
	}
}
