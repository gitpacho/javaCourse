package practica;

import javax.swing.*;
import java.awt.event.*;

public class Formulary extends JFrame implements ActionListener{
    private JTextField cmpUser;
    private JLabel lbuser;
    private JButton btnAcept;

    public Formulary() {
        setLayout(null);
        lbuser = new JLabel("Usuario");
        lbuser.setBounds(10, 10, 100, 30);
        add(lbuser);

        cmpUser = new JTextField();
        cmpUser.setBounds(120, 10, 150, 30);
        add(cmpUser);

        btnAcept = new JButton("aceptar");
        btnAcept.setBounds(10,70, 100, 30);
        add(btnAcept);
        btnAcept.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAcept) {
            setTitle(cmpUser.getText());   
            cmpUser.setText("Ingrese titulo");   
        }
        
    }

    public static void main(String[] args) {
        Formulary formulario = new Formulary();
        formulario.setBounds(0,0,350,200);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(3);

    }
}
