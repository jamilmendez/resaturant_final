package restaurant_final.guiGenerator;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;

public class PedidosList extends JPanel{
	private int dmA;
	private int dmB;
	private int dmX;
	private int dmY;

	private JLabel labelIdentificacion;
	private JTextField textIdentificacion;
	private JLabel labelNombre;
	private JTextField textNombre;
	private JLabel labelApellido;
	private JTextField textApellido;

	public PedidosList(int dmA, int dmB, int dmX, int dmY) {
		this.dmA = dmA;
		this.dmB = dmB;
		this.dmX = dmX;
		this.dmY = dmY;
		Initialize();
	}
	
	public void Initialize() {
		setLayout(new GridLayout(dmA,dmB,dmX,dmY));
		{
			labelIdentificacion = new JLabel();
			this.add(labelIdentificacion);
			labelIdentificacion.setText("Identificacion");
		}
		{
			textIdentificacion = new JTextField();
			this.add(textIdentificacion);
		}
		{
			labelNombre = new JLabel();
			this.add(labelNombre);
			labelNombre.setText("Nombre");
		}
		{
			textNombre = new JTextField();
			this.add(textNombre);
		}
		{
			labelApellido = new JLabel();
			this.add(labelApellido);
			labelApellido.setText("Aellidos");
		}
	}
}
