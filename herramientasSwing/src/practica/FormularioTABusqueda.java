package practica;
import javax.swing.*;
import java.awt.event.*;

/**
 * FormularioTABusqueda
 */
public class FormularioTABusqueda extends JFrame implements ActionListener{
    private JScrollPane scrollPanel1;
    private JTextArea textArea1;
    private JButton boton1;

    public FormularioTABusqueda() {
        setLayout(null);
        textArea1 = new JTextArea();
        scrollPanel1 = new JScrollPane(textArea1);
        scrollPanel1.setBounds(10,10,300,200);
        add(scrollPanel1);

        boton1 = new JButton("Verificar");
        boton1.setBounds(10,250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String texto = textArea1.getText();
            if (texto.indexOf("programa") != -1) {
                setTitle("Si contiene la palabra clave");
                textArea1.setText("");
            } else{
                setTitle("No contiene la palabra clave");
                textArea1.setText("");
            }
        }   
    }

    public static void main(String[] args) {
        FormularioTABusqueda formulario = new FormularioTABusqueda();
        formulario.setBounds(0,0,400,400);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(3);
    }
    
    
}