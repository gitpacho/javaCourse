package CB_RB;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class FormularioJP extends JFrame{
    private JPanel panel, panel2;
    private JLabel lbMsg;
    public FormularioJP(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        panel.setSize(new Dimension(200,64));
        add(panel);


        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.RED);
        panel2.setSize(new Dimension(200,64));
        add(panel2);

        lbMsg = new JLabel("Mision TIC 2022");
        lbMsg.setBounds(0,0,200,60);
        panel.add(lbMsg);
    }


    public static void main(String[] args) {
        FormularioJP formulario = new FormularioJP();
        formulario.setBounds(0,0,500,500);
        formulario.setLocationRelativeTo(null);  //ventana emergente en el centro des escritorio
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
