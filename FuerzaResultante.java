package proyectos;

public class FuerzaResultante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fuerza f1 = new Fuerza(100,15);
		Fuerza f2 = new Fuerza(150,80);
		Fuerza f3 = new Fuerza(30,63);
		Fuerza f4 = new Fuerza(80,77);
		Fuerza f5 = new Fuerza(15,21);
		Fuerza f6 = new Fuerza(f1,f2,f3,f4,f5);
		
		System.out.printf("La fuerza resultante en la armella roscada es de "+
				"%.2fN\nSu dirección es %.2f° respecto a la horizontal", f6.Fr,f6.direccionResultante);
		
	}

}
