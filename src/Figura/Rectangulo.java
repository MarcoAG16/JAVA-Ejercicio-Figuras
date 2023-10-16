//en esta clase vamos a heredar el atributo de la clase abstracta figura y lo vamos a sobreescribir

package Figura;
//1. Aplicamos herencia
public class Rectangulo extends Figura {
	
	//parametros
	double base;
	double altura;
	
	//constructor
	Rectangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	//metodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}//metodo calcularArea

}//class figura
