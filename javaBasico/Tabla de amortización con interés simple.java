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
	
	    //tabla
	    final double tasa=0.3984;
	    double precio,meses,monto,abono,amortizacion,interes;
	    double saldoInsoluto;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("**** tabla de amortizacion para interes simple");
	    System.out.println("Ingrese el precio de contsdo");
	    precio=sc.nextDouble();
	    System.out.println("Ingrese el plazo en mese para pagar : ");
	    meses=sc.nextDouble();
	    monto=precio*(1+(tasa/12)*meses);
	    abono=monto/meses;
	    amortizacion=precio/meses;
	    interes=abono-amortizacion;
	   	saldoInsoluto = precio;	
	    System.out.println("***************************************************************************");
	 	System.out.println("Mes\tamortizacion\t"+
				"Intereses\tabono\t\tsaldo insoluto");
				
	//	System.out.println("0\t\t\t\t\t\t\t"+saldoInsoluto);
	     
	     		System.out.println("0\t\t\t\t\t\t\t"+saldoInsoluto);
	    
for (int i=1;i<=meses;i++)
{
    saldoInsoluto-=amortizacion;
   System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n",
					i,amortizacion,interes,abono,saldoInsoluto);
}

System.out.println("_____________________________________________________________________________");
		System.out.printf("Total:\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n",
				amortizacion*meses,interes*meses,abono*meses,saldoInsoluto);	    
	}
}
