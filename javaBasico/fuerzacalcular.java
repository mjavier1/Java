/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class fuerza{
    double magnitud,direccion;
    double componentex,componentey;
    double fxtotal,fytotal,fr,direccionresultant;

    double calcularcartx(double m,double d){
        return m*Math.cos(d*(Math.PI/180));
        
    }

double calcularcarty (double m, double d){
    return m*Math.sin(d*(Math.PI/180));
    
}
   
   double calcularResultante(double fx1, double fx2, double fy1,double fy2){
       fxtotal = fx1+ fx2;
       fytotal = fy1+fy2;
       return Math.sqrt(Math.pow(fxtotal ,2)+Math.pow(fytotal, 2));
       
       
   }
   double calculardireccionResultante(){
       return Math.atan(fytotal/fxtotal) * (180/Math.PI);
       
   }
   
}











public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		fuerza f1 = new fuerza();
		f1.magnitud=100;
		f1.direccion=15;
		f1.componentex = f1.calcularcartx(f1.magnitud, f1.direccion);
		f1.componentey = f1.calcularcarty(f1.magnitud, f1.direccion); 
		
		
		fuerza f2 = new fuerza();
		f2.magnitud=150;
		f2.direccion=80;
		f2.componentex = f2.calcularcartx(f1.magnitud, f2.direccion);
		f2.componentey = f2.calcularcarty(f1.magnitud, f2.direccion); 
		
		
		
		fuerza f3 = new  fuerza();
	f3.fr = f3.calcularResultante(f1.componentex, f2.componentex, f1.componentey, f2.componentey);
		//f3.direccionResultante = f3.calcularDireccionResultante();
		
		f3.direccionresultant = f3.calculardireccionResultante();
                
		System.out.printf("La fuerza resultante en la armella roscada es de "+
				"%.2fN\nSu dirección es %.2f° respecto a la horizontal", f3.fr,f3.direccionresultant);
		

//System.out.printf("la fuerzas resultante en la armella roscada es de " + " %.2\nSu direccion  es %.2f respecto a la horizontal " , f3.fr, f3.direccion);
		
	}
}
