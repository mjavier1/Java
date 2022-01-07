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
		Scanner sc= new Scanner(System.in);
		System.out.println("************* calculo de area y perimetro");
			System.out.println("*****1. Triangulo");
				System.out.println("*******2. Cuadrado");
					System.out.println("********* 3.Rectangulo");
						System.out.println("4. Circulo");
							System.out.println("5.Rombo");
								System.out.println("6.Pewntagono");
									System.out.println("seleccione una opcion");
						int figura;
						figura=sc.nextInt();
						int calc;
						System.out.println("1. Area");
							System.out.println("2.perimetro");
								System.out.println("seleccione un calculo");
						calc=sc.nextInt();
						//varaible necesarias
						double resultado,altura,base,labol,radio,diagonamenor,diagonMayor,apotema;
						switch (figura){
						   
						         case 1:
						        System.out.println("Ingrese la base :");
						       base=sc.nextDouble();
						       System.out.println("Ingrese la altura :");
						       altura=sc.nextDouble();
						       if (calc==1) {
						       resultado=base*altura*0.5;
						       System.out.println("El area del triangulo es :" + resultado);
						       
						       }else if(calc==2){
						           resultado= base *3;
						           
						        System.out.println("El area del triangulo es :" + resultado);
						           
						       }
						        break;
						         case 2:
						        break;
						         case 3:
						        break;
						         case 4:
						        break;
						         case 5:
						        break;
						         case 6:
						        break;
						         case 7:
						        break;
						         case 8:
						        break;
						        
						        default:
						        break;
						        
						        
						}
						
	}
}
