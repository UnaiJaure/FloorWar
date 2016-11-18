package vHabitacion;
/**Clase para instanciar elementos de Habitación
 * @author Unai Jauregibeitia y Mikel Colmenares
 */
import Personajes.*;
import Gestion.*;
import javax.swing.*;

import java.awt.*;

public class Habitacion extends JFrame{
	// Una habiacion con una dimension de 9 x 9 posiciones
	JLabel[][] habitacion = new JLabel[9][9];
	JLabel MM = new JLabel();
	public Habitacion(){
		setSize(900, 900);
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		JPanel pCentro = new JPanel();
		pCentro.setLayout( new GridLayout(9,9) );
		for (int x = 0; x<9; x++)
			for (int y = 0; y<9; y++) {
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
		Habitacion v = new Habitacion();
		v.setVisible( true );
		//System.out.println( "Mostrado " + v.resolverTableroDesdeFila( v.habitacion, 0 ) );
	}
	
}
