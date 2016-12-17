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
	static JLabel[][] habitacion = new JLabel[33][25];
	JLabel MM = new JLabel();
	
	public JLabelHabitacion(){
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		setSize(960, 600);
		setResizable(false);
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		JPanel pCentro = new JPanel();
		pCentro.setLayout( new GridLayout(33,25) );
		for (int x = 0; x<33; x++)
			for (int y = 0; y<25; y++) {
				habitacion[x][y] = new JLabel( " " );
				habitacion[x][y].setBorder( BorderFactory.createLineBorder( Color.black ));
				//habitacion[x][y].setFont( new Font( "Arial", Font.BOLD, 24 ) );
				habitacion[x][y].setHorizontalAlignment( JLabel.CENTER );
				pCentro.add( habitacion[x][y] );
				if (((x == 0 || x == 32) || (y == 0 || y == 24)) && 
						!((x == 0 && y == 12) || (x == 16 && y == 24) ||
								(x == 16 && y== 0) || (x == 32 && y == 12)) ){
					habitacion[x][y].setText("C");
					//habitacion[x][y].setForeground(Color.BLACK);//.setFrontground(Color.BLACK);
				}
			}
		//MM.setFont( new Font( "Arial", Font.BOLD, 24 ) );
		//MM.setHorizontalAlignment( JLabel.CENTER );
		getContentPane().add( pCentro, BorderLayout.CENTER );
		getContentPane().add( MM, BorderLayout.SOUTH );
	}
	
	public static void main(String[] args) {
		JLabelHabitacion v = new JLabelHabitacion();
		v.setVisible( true );
		
		
		//System.out.println( "Mostrado " + v.resolverTableroDesdeFila( v.habitacion, 0 ) );
	}
	
	/*
	 * @Override
	protected void paintComponent(Graphics g){
		//super.paintComponent(g);
		if(imagen!=null){
			g.drawImage(imagen,  0, 0, null);
		}
	}
	*/
	//TODO
	//ud.prog3.cap06.PruebaDeAreas		para hacer objetos de colision
	
	//TODO
	//Hacer capas para meter lo grafico:
	//1ªLa base de la habitacion
	//2ªEstablecer mesas y objetos de covertura
	//3ªVentana que salte para batalla
	//Última, cambiar a capa frontal, para inicar el menu [cristal.setOpaque(false);]
	
	//Para que graphics no sea volatil, super. , pjara modificar el paintComponent [super.paintComponent()]
	//Transparencia relativa: poner una capa parcialmente transparente, poner una capa de color meido opaca; en vez de poner RGB, se usa RG(alpha)
}
