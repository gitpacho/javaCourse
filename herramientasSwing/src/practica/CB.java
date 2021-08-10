package practica;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.*;

public class CB extends JFrame implements ItemListener{
    private JComboBox<String> cmbColors;

    public CB() {
        setLayout(null);
        cmbColors = new JComboBox<>();
        cmbColors.setBounds(10,10,150,30);
        cmbColors.addItem("--Seleccione color--");
        cmbColors.addItem("Rojo");
        cmbColors.addItem("Verde");
        cmbColors.addItem("Azul");
        cmbColors.addItem("Amarillo");
        cmbColors.addItem("Negro");
        
        cmbColors.addItemListener(this);
        add(cmbColors);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cmbColors ){
            String seleccion = (String)cmbColors.getSelectedItem();
            setTitle(seleccion);
        }
        
    }

    public static void main(String[] args) {
        CB formulario = new CB();
        formulario.setBounds(0,0, 400, 160);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(3);
    }
    
}
