package CB_RB;
import javax.swing.*;
import javax.swing.event.*;

public class FormularioCB  extends JFrame implements ChangeListener{
    private JCheckBox check1, check2, check3;

    public FormularioCB() {
        setLayout(null);
        check1 = new JCheckBox("Amarillo");
        check1.setBounds(10,10, 150, 30);
        add(check1);
        check1.addChangeListener(this);
        
        check2 = new JCheckBox("Azul");
        check2.setBounds(10, 40, 150, 30);
        add(check2);
        check2.addChangeListener(this);

        check3 = new JCheckBox("Rojo");
        check3.setBounds(10,70, 150, 30);
        add(check3);
        check3.addChangeListener(this);
        
    }

    public static void main(String[] args) {
        FormularioCB formulario = new FormularioCB();
        formulario.setBounds(0,0,500,500);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String acum = "";
        if (check1.isSelected() == true) {
            acum = acum + "Amarillo";
        }
        if (check2.isSelected() == true) {
            acum = acum + " Azul";
        }
        if (check3.isSelected() == true) {
            acum = acum + " Rojo";
        }
        setTitle(acum);
    }        

    
}
