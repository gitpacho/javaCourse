package widgets;
import javax.swing.*;
public class Formulary extends JFrame{
    private JLabel label1, label2;  //etiquetas para mostrar en la ventana
    
    public Formulary(){
        setLayout(null); //desactuivar el layout
        label1 = new JLabel("MISION TIC 2022");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("prog JAVA");
        label2.setBounds(10, 100, 100, 30);
        add(label2);
    }

    public static void main(String[] args) {
        Formulary formulario1 = new Formulary();
        formulario1.setBounds(100, 0, 300, 300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario1.setResizable(false);
    }
}
