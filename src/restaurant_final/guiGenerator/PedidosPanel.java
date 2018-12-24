package restaurant_final.guiGenerator;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;

public class PedidosPanel extends JPanel {
	private int dmA;
	private int dmB;
	private int dmX;
	private int dmY;
	/**
	 * Create the panel.
	 */
	/*public PedidosPanel(int dmA, int dmB, int dmX, int dmY) {
		this.dmA = dmA;
		this.dmB = dmB;
		this.dmX = dmX;
		this.dmY = dmY;
		setVisible(true);
	}*/
	public PedidosPanel() {
		setLayout(null);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(10, 564, 89, 23);
		add(btnAgregar);
		
		JButton btnQuitar = new JButton("Quitar");
		btnQuitar.setBounds(109, 564, 89, 23);
		add(btnQuitar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(208, 564, 89, 23);
		add(btnModificar);
	}
}
