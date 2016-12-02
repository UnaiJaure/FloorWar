package vHabitacion;
/**Clase para instanciar elementos de Habitación
 * @author Unai Jauregibeitia y Mikel Colmenares
 */
import Personajes.*;
import Gestion.*;
import javax.swing.*;

import java.awt.*;

public class JLabelHabitacion extends JFrame{
	// Una habiacion con una dimension de 32 x 24 posiciones
	// Los hemos puesto impares, para que pueda tener un centro de una unica posicion
	JLabel[][] habitacion = new JLabel[33][25];
	JLabel MM = new JLabel();
	
	public JLabelHabitacion(){
		setSize(960, 600);
		setResizable(false);
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		JPanel pCentro = new JPanel();
		pCentro.setLayout( new GridLayout(33,25) );
		for (int x = 0; x<33; x++)
			for (int y = 0; y<25; y++) {
				habitacion[x][y] = new JLabel( " " );
				habitacion[x][y].setBorder( BorderFactory.createLineBorder( Color.black ));
				habitacion[x][y].setFont( new Font( "Arial", Font.BOLD, 24 ) );
				habitacion[x][y].setHorizontalAlignment( JLabel.CENTER );
				pCentro.add( habitacion[x][y] );
			}
		MM.setFont( new Font( "Arial", Font.BOLD, 24 ) );
		MM.setHorizontalAlignment( JLabel.CENTER );
		getContentPane().add( pCentro, BorderLayout.CENTER );
		getContentPane().add( MM, BorderLayout.SOUTH );
	}
	
	public static void main(String[] args) {
		JLabelHabitacion v = new JLabelHabitacion();
		v.setVisible( true );
		//System.out.println( "Mostrado " + v.resolverTableroDesdeFila( v.habitacion, 0 ) );
	}
	
	
	
	//TODO
	//Hacer capas para meter lo grafico:
	//1ªLa base de la habitacion
	//2ªEstablecer mesas y objetos de covertura
	//3ªVentana que salte para batalla
	//Última, cambiar a capa frontal, para inicar el menu [cristal.setOpaque(false);]
	
	
	//Transparencia relativa: poner una capa parcialmente transparente, poner una capa de color meido opaca; en vez de poner RGB, se usa RG(alpha)
}
