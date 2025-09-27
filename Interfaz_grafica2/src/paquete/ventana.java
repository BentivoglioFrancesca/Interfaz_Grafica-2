package paquete;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class ventana extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JList<Heroe> list;
    private JTextArea textArea;
    private JTextField textFieldnombre, textField_fuerza, textField_velocidad;
    private JButton Agregar, Eliminar, moverBtn, atacarBtn;
    private JRadioButton Fuerza, Velocidad, Resistencia, inteligencia;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private DefaultListModel<Heroe> modeloLista = new DefaultListModel<Heroe>();
    private JPanel panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ventana frame = new ventana();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(5,5));
        setContentPane(contentPane);

    
        JPanel mainPanel = new JPanel(new GridLayout(1, 3, 5, 0));
        contentPane.add(mainPanel, BorderLayout.CENTER);

        
        JPanel panelIzq = new JPanel(new BorderLayout());
        list = new JList<>();
        list.setModel(modeloLista);
        JScrollPane scrollLista = new JScrollPane(list);
        panelIzq.add(scrollLista, BorderLayout.CENTER);
        mainPanel.add(panelIzq);

  
        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));
        mainPanel.add(panelCentro);

        atacarBtn = new JButton("Atacar");
        atacarBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelCentro.add(atacarBtn);
        JPanel moverPanel = new JPanel(new FlowLayout());
        moverPanel.add(new JLabel("X:"));
        JTextField xField = new JTextField(5);
        moverPanel.add(xField);
        moverPanel.add(new JLabel("Y:"));
        JTextField yField = new JTextField(5);
        moverPanel.add(yField);
        moverBtn = new JButton("Mover");
        moverPanel.add(moverBtn);
        panelCentro.add(moverPanel);


        JPanel panelDer = new JPanel();
        mainPanel.add(panelDer);
        panelDer.setLayout(new GridLayout(0, 1, 0, 0));

        JPanel creacionPanel = new JPanel();
        creacionPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        creacionPanel.setLayout(new GridLayout(6, 2, 5, 5));
        panelDer.add(creacionPanel);


        creacionPanel.add(new JLabel("Nombre:"));
        textFieldnombre = new JTextField();
        creacionPanel.add(textFieldnombre);

        creacionPanel.add(new JLabel("X"));
        textField_fuerza = new JTextField();
        creacionPanel.add(textField_fuerza);

        creacionPanel.add(new JLabel("Y"));
        textField_velocidad = new JTextField();
        creacionPanel.add(textField_velocidad);


        JPanel radioPanel = new JPanel(new GridLayout(4,1));
        Fuerza = new JRadioButton("Fuerza");
        Velocidad = new JRadioButton("Velocidad");
        Resistencia = new JRadioButton("Resistencia");
        inteligencia = new JRadioButton("Inteligencia");
        buttonGroup.add(Fuerza); buttonGroup.add(Velocidad); buttonGroup.add(Resistencia); buttonGroup.add(inteligencia);
        radioPanel.add(Fuerza); radioPanel.add(Velocidad); radioPanel.add(Resistencia); radioPanel.add(inteligencia);
        panelDer.add(radioPanel);
                
                panel = new JPanel();
                panelDer.add(panel);
                
                        Agregar = new JButton("Crear Personaje");
                        panel.add(Agregar);
                        Eliminar = new JButton("Eliminar Personaje");
                        panel.add(Eliminar);


        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        contentPane.add(scrollPane, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}
