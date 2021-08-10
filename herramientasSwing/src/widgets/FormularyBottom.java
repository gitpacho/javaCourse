package widgets;
import javax.swing.*;
import java.awt.event.*;

public class FormularyBottom extends JFrame implements ActionListener{
    JButton boton1;
    public FormularyBottom() {
        setLayout(null);
        boton1 = new JButton("Finalizar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }    
    public static void main(String[] args) {
        FormularyBottom f = new FormularyBottom();
        f.setBounds(0,0,450,450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
