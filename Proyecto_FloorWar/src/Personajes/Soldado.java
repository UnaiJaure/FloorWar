package Personajes;

public class Soldado {

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
