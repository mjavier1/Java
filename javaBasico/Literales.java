package tiposDato;

public class Literales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Literales enteros
		int num;
		num = 15;
		System.out.println("Número decimal: "+num);
		num = 0111;
		System.out.println("Número octal: "+num);
		num = 0xB;
		System.out.println("Número hexadecimal: "+num);
		
		//Literales decimales
		double num2;
		float num3;
		
		num2 = 15.258E7;
		num3 = 157.4578963201584548f;
		System.out.println("Num2 = " + num2);
		System.out.println("Num3 = " + num3);
		
		num2 = 14.58513695475215f;
		num3 = 157.4578965201452875f;
		System.out.println("Num2 = " + num2);
		System.out.println("Num3 = " + num3);
		
		num2 = 15.2575849620154d;
		num3 = 157.5214578965214587f;
		System.out.println("Num2 = " + num2);
		System.out.println("Num3 = " + num3);
		
		// Literales booleanos
		boolean b1 = true;
		b1 = false;
		// b1 = 1 	NO ES CORRECTO
		// b1 = 0	NO ES CORRECTO
		
		// Literales tipo cadena
		
		/*
		 * \ddd			Octal
		 * \'			Comilla simple
		 * \"			Comilla doble
		 * \\ 			Diagonal
		 * \r			Retorno de carro
		 * \n			Salto de línea
		 * \f			Comienzo de página
		 * \t			Tabulador
		 * \b			Retroceso
		 */
		
		System.out.println("Comilla doble \"");
	}

}




