package vHabitacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JLabelPersonaje extends JLabel {

	
	public static final int Tamaño_Personaje = 100;
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelPersonaje frame = new JLabelPersonaje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JLabelPersonaje() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{
			setIcon( new ImageIcon( JLabelPersonaje.class.getResource( "img/flecha01.jpg")));
		}catch (Exception e){
			System.err.println( "Error en la carga del recurso de la imgen de flecha");
			e.printStackTrace();
		}
		setBounds(0, 0, Tamaño_Personaje, Tamaño_Personaje);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Image img = ((ImageIcon)getIcon()).getImage();
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//TODO
		g2.drawImage( img, 0, 0, Tamaño_Personaje, Tamaño_Personaje, null);
		
	}
}
