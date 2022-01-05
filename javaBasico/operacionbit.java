/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
//binario 
//operancion
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	String bin[] = {"0000","0001","0010","0011","0100","0101",
				"0110","0111","1000","1001","1010","1011","1100",
				"1101","1110","1111"};
				
		int a=4;
		int b=6;
		int c = a|b;
		
		int d=a&b; //and
		int e=a^b; //or
		
		int f=(~a&b)|(~a&b);
		int g= ~a&0x0f;
		int h= 8>>3;
		int i=1 <<3;
		
		System.out.println("a="+bin[a]);
			System.out.println("b="+bin[b]);
				System.out.println("a|b="+bin[c]);
				System.out.println("a&b ="+bin[d]);
				System.out.println("a^b ="+bin[e]);
	
		System.out.println("(~a&b)|(~a&b);"+bin[f]);
		System.out.println("~a&0x0f = "+bin[g]);
			System.out.println("8>>3"+bin[h]);
		System.out.println("i << 3 = "+bin[i]);
		
	}
}

