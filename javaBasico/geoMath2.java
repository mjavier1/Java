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
						double resultado,altura,base,lado,radio,diagonamenor,diagonMayor,apotema;
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
						             System.out.println("Ingrese la lado :");
						       lado=sc.nextDouble();
						       if (calc==1) {
						       resultado=Math.pow(lado, 2);
						       System.out.println("El area del Cuadrado es :" + resultado);
						       
						       }else if(calc==2){
						           resultado= 4*lado;
						           
						        System.out.println("El area del triangulo es :" + resultado);
						           
						       }
						        break;
						         case 3:
						             
						            System.out.print("Ingrese la base: ");
			base = sc.nextDouble();
			System.out.print("Ingrese la altura: ");
			altura = sc.nextDouble();
			if(calc == 1) {
				resultado = base*altura;
				System.out.print("El área del rectángulo es: "+resultado);
			}else if(calc== 2) {
				resultado = 2*(base+altura);
				System.out.print("El perímetro del rectángulo es: "+resultado);
			}
						             
						             
						             
						             
						             
						             
						             
						             
						             
						             
						             
						             
						             
						        break;
						         case 4:
						             System.out.print("Ingrese el radio: ");
			radio = sc.nextDouble();
			if(calc == 1) {
				resultado = Math.PI*Math.pow(radio, 2);
				System.out.print("El área del círculo es: "+resultado);
			}else if(calc == 2) {
				resultado = Math.PI*2*radio;
				System.out.print("El perímetro del círculo es: "+resultado);
			}
						        break;
						         case 5:
						             
						             System.out.print("Ingrese el diagona: ");
			diagonamenor = sc.nextDouble();
			System.out.print("Ingrese el diagonaMayor: ");
			diagonMayor = sc.nextDouble();
			
			
			if(calc == 1) {
			resultado = diagonamenor*diagonMayor*0.5;
				
				System.out.print("El área del Rombo es : "+resultado);
			}else if(calc == 2) {
				resultado = 4*(Math.sqrt(Math.pow(diagonamenor/2, 2) +
				Math.pow(diagonMayor/2,2)));
				
				
				System.out.print("El perímetro del círculo es: "+resultado);
			}
						             
						             
						             
						             
						             
						             
						             
						             
						        break;
						         case 6:
						 
						 System.out.print("Ingrese el lado: ");
			lado = sc.nextDouble();
			apotema = lado/(2*Math.tan(72/2*Math.PI/180));
			if(calc == 1) {
				resultado = lado*5*apotema*0.5;
				System.out.print("El área del pentágono es: "+resultado);
			}else if(calc == 2) {
				resultado = lado*5;
				System.out.print("El perímetro del pentágono es: "+resultado);
			}
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						        break;
						 
						        
						        default:
						        System.out.println("haga una seleccion valida");
						        break;
						        
						        
						}
						
	}
}
