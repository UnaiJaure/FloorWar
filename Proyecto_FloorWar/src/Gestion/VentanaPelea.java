package Gestion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPelea extends JDialog {

	private final JPanel contentPanel = new JPanel();
	Pelea p = new Pelea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaPelea dialog = new VentanaPelea();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaPelea() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		{
			JButton btnNewButton = new JButton("Atacar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					p.MMalosdañado(50);
				}
			});
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_2 = new JButton("Curar");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			contentPanel.add(btnNewButton_2);
		}
		{
			JButton btnNewButton_1 = new JButton("Granada");
			contentPanel.add(btnNewButton_1);
		}
	}

}
