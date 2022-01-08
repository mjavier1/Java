package control;

public class Main {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		// Break con etiqueta
		System.out.println("****Break con etiqueta****");
		exterior1:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j>i) {
					System.out.println();
					break exterior1;
				}
				System.out.print(" "+i*j);
			}
		}
		// Break sin etiqueta
		System.out.println("****Break sin etiqueta****");
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j>i) {
					System.out.println();
					break;
				}
				System.out.print(" "+i*j);
			}
		}
		// Continue sin etiqueta
		System.out.println("\n****Continue sin etiqueta****");
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j>i) {
					System.out.println();
					continue;
				}
				System.out.print(" "+i*j);
			}
		}
		// Continue con etiqueta
		System.out.println("\n****Continue con etiqueta****");
		exterior2:
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(j>i) {
					System.out.println();
					continue exterior2;
				}
				System.out.print(" "+i*j);
			}
		}
	}

}




