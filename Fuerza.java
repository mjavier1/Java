package proyectos;

public class Fuerza {
	double magnitud, direccion;
	double componenteX,componenteY;
	double FxTotal,FyTotal,Fr,direccionResultante;
	
	Fuerza(double m,double d){	//Constructor
		magnitud = m;	//Newtons
		direccion = d;	//Grados
		componenteX = this.calcularComponenteX(magnitud,direccion);
		componenteY = this.calcularComponenteY(magnitud, direccion);
	}
	
	Fuerza(Fuerza ...fn){
		calcularResultanteX(fn);
		calcularResultanteY(fn);
		Fr = this.calcularResultante();
		direccionResultante = this.calcularDireccionResultante();
	}
	
	double calcularResultanteX(Fuerza ...f) {
		for(Fuerza fi:f) {
			FxTotal += fi.componenteX;
		}
		return FxTotal;
	}
	
	double calcularResultanteY(Fuerza ...f) {
		for(Fuerza fi:f) {
			FyTotal += fi.componenteY;
		}
		return FyTotal;
	}
	
	double calcularComponenteX(double m,double d) {
		return m*Math.cos(d*(Math.PI/180));
	}
	
	double calcularComponenteY(double m, double d) {
		return m*Math.sin(d*(Math.PI/180));
	}
	
	double calcularResultante() {
		return Math.sqrt(Math.pow(FxTotal,2)+Math.pow(FyTotal,2));
	}
	
	double calcularDireccionResultante() {
		return Math.atan(FyTotal/FxTotal)*(180/Math.PI);
	}
}
