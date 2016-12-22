package vHabitacion;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class PanelFondo extends javax.swing.JPanel{
	public PanelFondo(){
		initComponents();
		this.setSize(858, 650);
		Icon imgBoton = new ImageIcon( getClass().getResource(
				"img/FondoPrueba1.jpg"));
		btnIngresar.setIcon(imgBoton);
	}
	public void paintComponent(Graphics g){
		Dimension tamaño = getSize();
		ImageIcon imagenFondo = new ImageICon(getClass().getResource(
				"img/FondoPrueba1.png"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamaño.width, tamaño.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}

public class FramePrincipal extends JFrame{
	public FramePrincipal(){
		initComponents();
		PanelFondo panelFondo = new PanelFondo();
		this.add(panelFondo), BorderLayout.CENTER);
		this.pack();
	}
}