package Personajes;

/** Clase abstracta que modela los elementos  de Soldado. Tiene nombre y vida.
 * @author Unai Jauregibeitia y Mikel Colmenares
 */
public abstract class Soldado {
	
	/** Constructor de Soldado.
	 * @param nombre	Nombre(nombre)
	 * @param vida	NumericoEntero(hp)
	 */
	protected static String nombre;
	public static int hp;
	protected static double porcentaje_acierto=85;

	public Soldado(){}
	
	public Soldado(String nombre, int hp, double porcentaje_acierto){
		this.nombre = nombre;
		this.hp = hp;
		this.porcentaje_acierto = porcentaje_acierto;
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

	public double getPorcentaje_acierto() {
		return porcentaje_acierto;
	}

	public void setPorcentaje_acierto(double porcentaje_acierto) {
		this.porcentaje_acierto = porcentaje_acierto;
	}
	
	
	
}
