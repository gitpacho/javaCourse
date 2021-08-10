package practica;
import javax.swing.*;
import java.awt.event.*;

public class formulario extends JFrame implements ActionListener{
    JButton boton1, boton2, boton3;

    public formulario() {
        setLayout(null);
        boton1 = new JButton("Finalizar");
        boton1.setBounds(10,100,90,30);
        add(boton1);

        boton2 = new JButton("boton 2");
        boton2.setBounds(110,100,90,30);
        add(boton2);

        boton3 = new JButton("boton 3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
        if (e.getSource() == boton2) {
            setTitle("title2");
        }
        if (e.getSource() == boton3) {
            setTitle("title3");
        }

    }

    public static void main(String[] args) {
        formulario formulario1 = new formulario();
        formulario1.setBounds(10,20, 400, 300);
        formulario1.setDefaultCloseOperation(3);
        formulario1.setVisible(true);

    }

}



