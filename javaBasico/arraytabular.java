/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
//array for 
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int array [][] = new int [6][];
		array[0]=new int[1];
		array[1]=new int[2];
		array[2]=new int[4];
		array[3]=new int[8];
		array[4]=new int[16];
		array[5]=new int[32];
	
		int i,j,k=0;
		
		for (i=0;i<6;i++){
		    for(j=0;j<Math.pow(2, i);j++){
		        array[i][j]=k;
		        System.out.println(array[i][j] +"\t");
		        k++;
		        
		    }
		    System.out.println();
		}
		
		
	}
}
