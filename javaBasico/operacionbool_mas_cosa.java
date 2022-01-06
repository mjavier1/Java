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
		boolean a= true;
		boolean b=false;
		boolean c= a|b;
		boolean d= a&b;
		boolean e=a|=b;
		boolean F=(!a&b)|(a&!b);
		boolean g=!a;
		System.out.println("a= "+a);
			System.out.println("b= "+b);
				System.out.println("a|b"+c);
					System.out.println("a&b"+d);
	
	    	System.out.println("a|=b"+e);
	    		System.out.println("(!a&b) |(a&!b) = "+F);
	    			System.out.println("!a= "+g);
	    			int x,y,z;
	    			x=y=0;
	    			z=50;
	    			for(int i=0;i<100;i++){
	    			    if(x==10&z++<100)
	    			    {
	    			        System.out.println("Esto no se ejecuta");
	    			    }
	    			    System.out.println("z1="+ z);
	    			}
	    			z=50;
	    			for(int i=0;i<100;i++){
	    			    if(x==10&&z++<100)
	    			    {
	    			        System.out.println("Esto no se ejecuta");
	    			    }
	    			    System.out.println("z2="+ z);
	    			}
	    			int resultado=0,a1=11,a2=10;
	    			resultado = (a1< a2) ? 14:++resultado;
	    			System.out.println("resultado = "+resultado);
	    			
	    			
	    			
	}
}
