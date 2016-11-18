package Personajes;
/**Clase para instanciar elementos de Soldado de tipo Ingeniero
 * @author Unai Jauregibeitia y Mikel Colmenares
 */
public class Ingeniero extends Soldado{
	int NGranadas;


	public Ingeniero(String nombre, int hp, int nGranadas) {
		super(nombre, hp, porcentaje_acierto);
		NGranadas = nGranadas;
	}
	
	/** Constructor de Ingeniero.
	 *
	 */
	public int getNGranadas() {
		return NGranadas;
	}

	public void setNGranadas(int nGranadas) {
		NGranadas = nGranadas;
	}

}
