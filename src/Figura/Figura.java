
//vamos a usar clases abstractas para evitar la instanciacion de objetos que no necesito (generalmente son objetos muy abstractos, como persona, figura, transporte, animal, comida, arte, operaciones matematicas,lecturas,ropa, etc)

package Figura;
//utilizando clases abstractas, evitamos las instancias no necesarias

//Para que una clase se vuelva abstracta, usamosla palabra reservada abstract antesde class
public abstract class Figura {
	
	//declaramos un metodo abstracto (no tiene cuerpo)
	//metodo abstracto que nos dice que tenemos que hacer, pero no nos dice el como
	public abstract double calcularArea();

}//clase figura


/*NOTA Las clases abstractas pierden la capacidad de instanciar.
 * una clase abstracta, necesita si o si metodos abstractos. 
 * cuando usamos clases abstractas, estamos obligados a utilizar todos los metoos abstractos */
