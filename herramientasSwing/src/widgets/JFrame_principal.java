package widgets;
import javax.swing.*;

import java.awt.event.*;

/**
 * JFrame_principal
 */

public class JFrame_principal extends JFrame implements ActionListener{
    private JLabel label1;
    private JButton button1;
    private JToggleButton tb;
    public JFrame_principal() {
        setLayout(null);
        label1 = new JLabel(); 
        label1.setText("label1");
        label1.setBounds(140, 20, 300, 30);
        add(label1);

        button1 = new JButton();
        button1.setText("botton 1");
        button1.setBounds(10,100, 300,20);
        add(button1);
        button1.addActionListener(this);

        tb = new JToggleButton();
        tb.setText("Encender");
        tb.setBounds(10, 200, 300, 20);
        add(tb);
        tb.addActionListener(this);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            label1.setText("boton bresionado");            
        }
        if (e.getSource() == tb) {
            if (tb.isSelected()){
                label1.setText("Encendido");  
            } else {label1.setText("Apagar");}          
        } 
    }

    public static void main(String[] args) {
        JFrame_principal jf = new JFrame_principal();
        jf.setBounds(0,0,500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
    }

}