package variables;

public class Arreglos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String productos[][] = {
				{"1L Leche","1.00 dólares"},
				{"Galletas","0.75 dólares"},
				{"1Kg Azúcar","1.25 dólares"}
		};
		int producto = 1;
		
		System.out.println("Tienda 1");
		System.out.println(productos[producto][0]+
				" "+productos[producto][1]);
		
		String productosSocios[][][] = 
			{
				{
					{"1L leche","1.00 dólares"},
					{"Galletas","0.75 dólares"},
					{"1Kg Azúcar","1.25 dólares"}
				},
				{
					{"1L Crema","1.75 dólares"},
					{"1 Lata de chiles","1.35 dólares"},
					{"1 Paleta de hielo","1.40 dólar"}
				},
				{
					{"1 Paleta de caramelo","0.85 dólares"},
					{"1 Paquete de vasos","2.5 dólares"},
					{"1Kg Arroz","2.25 dólares"}
				}
			};
		int persona = 0;
		producto = 1;
		
		System.out.println("\nTienda 2");
		System.out.println(productosSocios[persona][producto][0]+ " "+
				productosSocios[persona][producto][1]);
		
	}

}




