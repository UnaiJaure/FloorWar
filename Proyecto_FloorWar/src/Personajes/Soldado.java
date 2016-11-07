package Personajes;

/** Clase abstracta que modela los elementos  de Soldado. Tiene nombre y vida.
 * @author Unai Jauregibeitia y Miker Colmenares
 */
public abstract class Soldado {
	
	/** Constructor de Soldado.
	 * @param nombre	Nombre(nombre)
	 * @param vida	NumericoEntero(hp)
	 */
	protected static String nombre;
	protected static int hp;
	
	public Soldado(){}
	
	public Soldado(String nombre, int hp){
		this.nombre = nombre;
		this.hp = hp;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Soldado.nombre = nombre;
	}

	public static int getHp() {
		return hp;
	}

	public static void setHp(int hp) {
		Soldado.hp = hp;
	}
	
	
	
}
