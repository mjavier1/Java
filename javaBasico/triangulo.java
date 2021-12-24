/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
    /*
    byte 8bits
    int 32 bits
    longs 
    */
	public static void main(String[] args) {
	float cateto1,cateto2;
	double hip;
	cateto1=3;
	cateto2=4;
	hip=Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
//	hip=Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2,2));
	System.out.println("la hipotenusa del triangulo es :"+hip);	
		double radio,volumen,area;
		radio=3;
		//volumen=(4/3)*Math.PI*(Math.pow)(radio,3));
		//area=4*Math.PI*(Math.pow)(radio, 2));
		
			volumen = (4/3)*Math.PI*(Math.pow(radio,3));
	area = 4*Math.PI*(Math.pow(radio, 2));
		
		System.out.println("El volumen de la esfera es :" + volumen);
		System.out.println("El area de la esfera es :" + area);
		
		
	}
}
