package restaurant_final;
import restaurant_final.guiGenerator.PedidosList;
import restaurant_final.guiGenerator.PedidosPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

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
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\principal_04.png"));
        frame.getContentPane().setBackground(SystemColor.inactiveCaption);
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

        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(1086, 653, 268, 14);
        frame.getContentPane().add(progressBar);

        JTree tree = new JTree();
        tree.setBounds(10, 45, 278, 298);
        frame.getContentPane().add(tree);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 354, 278, 288);
        frame.getContentPane().add(panel_1);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(271, 45, 17, 298);
        frame.getContentPane().add(scrollBar);

        JLabel lblArbolDePedidos = new JLabel("Arbol de Pedidos");
        lblArbolDePedidos.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblArbolDePedidos.setBounds(10, 15, 129, 14);
        frame.getContentPane().add(lblArbolDePedidos);

        JScrollBar scrollBar_1 = new JScrollBar();
        scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
        scrollBar_1.setBounds(10, 320, 278, 23);
        frame.getContentPane().add(scrollBar_1);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBorder(null);
        tabbedPane.setBounds(308, 45, 1046, 597);
        frame.getContentPane().add(tabbedPane);
        {
            JPanel panel_01 = new JPanel();
            tabbedPane.addTab("Pedidos", panel_01);
            panel_01.setLayout(null);
            
            JButton btnNewButton = new JButton("Pag01");
            btnNewButton.setBounds(10, 535, 89, 23);
            panel_01.add(btnNewButton);

            JScrollPane scrollPane = new JScrollPane();
            panel_01.add(scrollPane);
            scrollPane.setBounds(10,535,89,23);
            {
                String[][] datos = {{"10","Hector","Flores","123"},
                        {"20","Arturo","Fernandez","456"},
                        {"30","Juan","Valdez","789"},
                        {"40","Pepito","Perez","987"},
                        {"50","Pedro","Picapiedra","654"},
                        {"60","Pablo","Marmol","321"}};
                String[] titulos = new String[]{"Identificación", "Nombre", "Apellido", "telefono"};
                TableModel modeloTabla = new DefaultTableModel(datos, titulos);
                JTable tabla = new JTable();
                tabla.setModel(modeloTabla);
                tabla.setPreferredSize(new Dimension(356, datos.length*16));
                scrollPane.setViewportView(tabla);
                TableRowSorter ordenador = new TableRowSorter(modeloTabla);
                tabla.setRowSorter(ordenador);
            }
        }
        {
            JPanel panel_02 = new JPanel();
            tabbedPane.addTab("Reservas", panel_02);
            panel_02.setLayout(null);
            
            JButton btnPag = new JButton("Pag02");
            btnPag.setBounds(10, 535, 89, 23);
            panel_02.add(btnPag);
        }
        {
            JPanel panel_03 = new JPanel();
            panel_03.setBorder(null);
            tabbedPane.addTab("Cuentas", null, panel_03, null);
            panel_03.setLayout(null);
            
            JButton btnPag_1 = new JButton("Pag03");
            btnPag_1.setBounds(10, 535, 89, 23);
            panel_03.add(btnPag_1);
        }

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(SystemColor.window);
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
        mntmNuevoPedido.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\new_pedido.png"));
        mnFile.add(mntmNuevoPedido);

        JMenuItem mntmAbrir = new JMenuItem("Abrir");
        mntmAbrir.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\Restaurant\\src\\resources\\Open.png"));
        mntmAbrir.setFont(new Font("Arial", Font.PLAIN, 12));
        mnFile.add(mntmAbrir);

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
        mntmReservarMesa.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\reservated.png"));
        mnEdit.add(mntmReservarMesa);
        
        JMenuItem mntmEditarPedido = new JMenuItem("Editar Pedido");
        mntmEditarPedido.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\edit_ped.png"));
        mnEdit.add(mntmEditarPedido);

        JMenu mnVer = new JMenu("Ver");
        mnVer.setFont(new Font("Arial", Font.PLAIN, 12));
        menuBar.add(mnVer);

        JMenuItem mntmPedidos = new JMenuItem("Pedidos");
        mntmPedidos.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\pedido.png"));
        mnVer.add(mntmPedidos);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Ingresos");
        mntmNewMenuItem.setIcon(new ImageIcon("F:\\JAVA\\Proyectos\\resaturant_final\\src\\resources\\money_02.png"));
        mnVer.add(mntmNewMenuItem);
        
        JMenu mnRestaurant = new JMenu("Restaurant");
        menuBar.add(mnRestaurant);
        
        JMenuItem mntmRegitarPensin = new JMenuItem("Regitar Pensi\u00F3n");
        mnRestaurant.add(mntmRegitarPensin);
        
        JMenu mnHelp = new JMenu("Ayuda");
        mnHelp.setFont(new Font("Arial", Font.PLAIN, 12));
        menuBar.add(mnHelp);
                
        JMenuItem mntmAcercaDeRestaurant = new JMenuItem("Acerca de Restaurant");
        mntmAcercaDeRestaurant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent mntabout) {
                if(mntabout.getSource() == mntmAcercaDeRestaurant) {
                    JOptionPane.showMessageDialog(null, "Desarrollado por Jhon Samuel", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
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
