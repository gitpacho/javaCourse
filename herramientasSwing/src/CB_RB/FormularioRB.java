package CB_RB;
import javax.swing.*;
import javax.swing.event.*;

public class FormularioRB extends JFrame implements ChangeListener{
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup bg;
    private JLabel labelNom;

    public FormularioRB (){
        setLayout(null);
        bg = new ButtonGroup();
        
        rb1 = new JRadioButton("Colombia");
        rb1.setBounds(10,20,100,10);
        add(rb1);
        bg.add(rb1);
        rb1.addChangeListener(this);

        rb2 = new JRadioButton("Perú");
        rb2.setBounds(10,60,100,10);
        add(rb2);
        bg.add(rb2);
        rb2.addChangeListener(this);

        rb3 = new JRadioButton("Ecuador");
        rb3.setBounds(10,100,100,10);
        add(rb3);
        bg.add(rb3);
        rb3.addChangeListener(this);

        labelNom = new JLabel();
        labelNom.setBounds(10, 150, 200, 30);
        add(labelNom);
    }

    public static void main(String[] args) {
        FormularioRB formulario = new FormularioRB();
        formulario.setBounds(0,0,500,500);
        formulario.setLocationRelativeTo(null);  //ventana emergente en el centro des escritorio
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (rb1.isSelected()) {
            labelNom.setText("Colombia");
        }
        if (rb2.isSelected()) {
            labelNom.setText("Perú");
        }
        if (rb3.isSelected()) {
            labelNom.setText("Ecuador");
        }
        
    }
}