package variables;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arreglos unidimensionales
		int numerosPrimos[]=new int[6];
		numerosPrimos[0]=2;
		numerosPrimos[1]=3;
		numerosPrimos[2]=5;
		numerosPrimos[3]=7;
		numerosPrimos[4]=11;
		numerosPrimos[5]=13;
		
		//Solución
		System.out.println(numerosPrimos[5]);
		
		double resultado;
		resultado = numerosPrimos[2]*numerosPrimos[4];
		System.out.println(resultado);
		
		resultado = (double)numerosPrimos[2]/numerosPrimos[4];
		System.out.println(resultado);
		
		resultado = numerosPrimos[2]+numerosPrimos[4];
		System.out.println(resultado);
		
		int i;
		resultado = 0;
		for(i=0;i<5;i++) {
			resultado = resultado + numerosPrimos[i];
		}
		System.out.println("El promedio de los 6 números es: "+resultado/6);
		
	}




