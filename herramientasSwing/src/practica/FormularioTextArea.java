package practica;

import javax.swing.*;
import java.awt.event.*;

public class FormularioTextArea extends JFrame implements ActionListener{
    private JTextField cmpEmail;
    private JTextArea cmpArea;
    private JScrollPane scrollpanel;
    



    public FormularioTextArea() {
        setLayout(null);
        cmpEmail = new JTextField("Ingrese Email");
        cmpEmail.setBounds(10,10,200,30);
        add(cmpEmail);

        cmpArea = new JTextArea("Ingrese comentario");
        scrollpanel = new JScrollPane(cmpArea);
        scrollpanel.setBounds(10, 50, 400, 300);
        add(scrollpanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        FormularioTextArea formulario = new FormularioTextArea();
        formulario.setBounds(0,0, 600,450);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(3);
    }
    
}
