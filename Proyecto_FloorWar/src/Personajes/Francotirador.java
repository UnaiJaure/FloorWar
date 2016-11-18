package Personajes;
/**Clase para instanciar elementos de Soldado de tipo Franco-tirador
 * @author Unai Jauregibeitia y Mikel Colmenares
 */

public class Francotirador extends Soldado{

	public Francotirador(String nombre, int hp) {
		super(nombre, hp, porcentaje_acierto);
		this.porcentaje_acierto = porcentaje_acierto*1.1;
	}

	
	
	
	/** Constructor de Francotirador.
	 *
	 */
	
}
