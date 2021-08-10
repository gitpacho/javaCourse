package widgets;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class FormularyMB extends JFrame implements ActionListener{
    private JButton boton1, boton2, boton3;

    
    public FormularyMB() {
        setLayout(null);
        boton1 =  new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);

        boton2 =  new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);

        boton3 =  new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            setTitle("boton 1");
        }
        if (e.getSource() == boton2) {
            setTitle("boton 2");
        }
        if (e.getSource() == boton3) {
            setTitle("boton 3");
        }
    }
    
    public static void main(String[] args) {
        FormularyMB f = new FormularyMB();
        f.setBounds(0,0,350,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
