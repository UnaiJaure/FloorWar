package Personajes;

/**Clase para instanciar elementos de Soldado de tipo Medico
 * @author Unai Jauregibeitia y Miker Colmenares
 */
public class Medico extends Soldado{

	/** Constructor de Medico.
	 *
	 */
	int porcentaje_curacion;

	public int getPorcentaje_curacion() {
		return porcentaje_curacion;
	}

	public void setPorcentaje_curacion(int porcentaje_curacion) {
		this.porcentaje_curacion = porcentaje_curacion;
	}
	
}
