package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class FormularioFlowLayout extends JFrame implements ActionListener{
    private JButton b1, b2, b3, b4, b5;
    private FlowLayout miFlowLayout;

    public FormularioFlowLayout(){
        miFlowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
        setLayout(miFlowLayout);


        b1 = new JButton("Boton 1");
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Boton 2");
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("Boton 3");
        add(b3);
        b3.addActionListener(this);

        b4 = new JButton("Boton 4");
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("Boton 5");
        add(b5);
        b5.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        miFlowLayout.setHgap(miFlowLayout.getHgap() + 5);
        miFlowLayout.setVgap(miFlowLayout.getVgap() + 0);
        setLayout(miFlowLayout);
        validate();
    }

    public static void main(String[] args) {
        FormularioFlowLayout formulario = new FormularioFlowLayout();
        formulario.setBounds(0,0,500,500);
        formulario.setLocationRelativeTo(null);
        formulario.setLocationRelativeTo(null);  //ventana emergente en el centro des escritorio
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
