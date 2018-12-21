package restaurant_final;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowDesing {
    private JFrame frame;

    /**
     * Ejecucion de la aplicacion
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WindowDesing window = new WindowDesing();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Creacion de la aplicacion.
     */
    public WindowDesing() {
        initialize();
    }

    /**
     * inicializa los componentes del JFrame
     */
    private void initialize() {
        frame = new JFrame("Restaurant v1.0");
        frame.getContentPane().setBackground(new Color(128, 128, 128));
        frame.setBounds(100, 100, 1380, 735);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setBounds(751, 291, 156, 86);
        addPopup(frame.getContentPane(), popupMenu);

        JMenuItem mntmCopiar = new JMenuItem("Copiar");
        popupMenu.add(mntmCopiar);

        JMenuItem mntmPegar = new JMenuItem("Pegar");
        popupMenu.add(mntmPegar);

        JMenuItem mntmCortar = new JMenuItem("Cortar");
        popupMenu.add(mntmCortar);

        JMenuItem mntmSeleccionarTodo = new JMenuItem("Seleccionar Todo");
        popupMenu.add(mntmSeleccionarTodo);
        frame.getContentPane().setLayout(null);

        JButton btnPedidos = new JButton("Pedidos");
        btnPedidos.setForeground(new Color(255, 255, 255));
        btnPedidos.setBackground(new Color(0, 100, 0));
        btnPedidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnPedidos.setBounds(10, 11, 120, 23);
        frame.getContentPane().add(btnPedidos);

        JButton btnReservas = new JButton("Reservas");
        btnReservas.setBackground(new Color(255, 215, 0));
        btnReservas.setForeground(new Color(255, 255, 255));
        btnReservas.setBounds(140, 11, 120, 23);
        frame.getContentPane().add(btnReservas);

        JButton btnCuentas = new JButton("Cuentas");
        btnCuentas.setForeground(new Color(255, 255, 255));
        btnCuentas.setBackground(new Color(255, 215, 0));
        btnCuentas.setBounds(270, 11, 120, 23);
        frame.getContentPane().add(btnCuentas);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(211, 211, 211));
        menuBar.setBorderPainted(false);
        frame.setJMenuBar(menuBar);

        JMenu mnFile = new JMenu("Archivo");
        mnFile.setFont(new Font("Arial", Font.PLAIN, 12));
        menuBar.add(mnFile);
        
        JMenu mnNuevo = new JMenu("Nuevo");
        mnNuevo.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\form.png"));
        mnFile.add(mnNuevo);
        
        JMenuItem mntmDesayuno = new JMenuItem("Desayuno");
        mnNuevo.add(mntmDesayuno);
        
        JMenuItem mntmAlmuerzo = new JMenuItem("Almuerzo");
        mnNuevo.add(mntmAlmuerzo);
        
        JMenuItem mntmCena = new JMenuItem("Cena");
        mnNuevo.add(mntmCena);
        
        JMenu mnPedidosRecientes = new JMenu("Pedidos Recientes");
        mnFile.add(mnPedidosRecientes);

        JMenuItem mntmNuevoPedido = new JMenuItem("Nuevo Pedido");
        mntmNuevoPedido.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\document-new.png"));
        mnFile.add(mntmNuevoPedido);

        JMenuItem mntmAbrir = new JMenuItem("Abrir");
        mntmAbrir.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\Open.png"));
        mntmAbrir.setFont(new Font("Arial", Font.PLAIN, 12));
        mnFile.add(mntmAbrir);

        JMenuItem mntmCerrarVentana = new JMenuItem("Cerrar Ventana");
        mntmCerrarVentana.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\Close Window.png"));
        mntmCerrarVentana.setFont(new Font("Arial", Font.PLAIN, 12));
        mnFile.add(mntmCerrarVentana);

        JMenuItem mntmGuardar_1 = new JMenuItem("Guardar");
        mntmGuardar_1.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\save16x16.png"));
        mntmGuardar_1.setFont(new Font("Arial", Font.PLAIN, 12));
        mnFile.add(mntmGuardar_1);

        JMenuItem mntmGuardarComo = new JMenuItem("Guardar Como...");
        mntmGuardarComo.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\save_as.png"));
        mntmGuardarComo.setFont(new Font("Arial", Font.PLAIN, 12));
        mnFile.add(mntmGuardarComo);

        JMenuItem mntmSalir = new JMenuItem("Salir");
        mntmSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                if (arg0.getSource() == mntmSalir) {
                    JOptionPane.showMessageDialog(null, "Salr", "Salir", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        mntmSalir.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\exit.png"));
        mntmSalir.setFont(new Font("Arial", Font.PLAIN, 12));
        mnFile.add(mntmSalir);

        JMenu mnEdit = new JMenu("Editar");
        mnEdit.setFont(new Font("Arial", Font.PLAIN, 12));
        menuBar.add(mnEdit);

        JMenuItem mntmReservarMesa = new JMenuItem("Reservar Mesa");
        mnEdit.add(mntmReservarMesa);
        
        JMenuItem mntmEditarPedido = new JMenuItem("Editar Pedido");
        mnEdit.add(mntmEditarPedido);

        JMenu mnVer = new JMenu("Ver");
        mnVer.setFont(new Font("Arial", Font.PLAIN, 12));
        menuBar.add(mnVer);

        JMenuItem mntmPedidos = new JMenuItem("Pedidos");
        mnVer.add(mntmPedidos);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Ingresos");
        mnVer.add(mntmNewMenuItem);

        JMenu mnHelp = new JMenu("Ayuda");
        mnHelp.setFont(new Font("Arial", Font.PLAIN, 12));
        menuBar.add(mnHelp);

        JMenuItem mntmAcercaDeRestaurant = new JMenuItem("Acerca de Restaurant");
        mntmAcercaDeRestaurant.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\help.png"));
        mnHelp.add(mntmAcercaDeRestaurant);

        JMenuItem mntmBuscar = new JMenuItem("Buscar");
        mntmBuscar.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\Search16x16.png"));
        mnHelp.add(mntmBuscar);
    }

    /*Captura de Eventos realizados por las selecciones*/
    private class SwingAction extends AbstractAction {
        public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    /**
     * Captura de eventos realizados por el Mouse
     */
    private static void addPopup(Component component, final JPopupMenu popup) {

        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }

            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
