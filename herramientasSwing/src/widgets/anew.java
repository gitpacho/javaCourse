package widgets;
import javax.swing.*;
import java.awt.*;

/**
 * anew
 */
public class anew {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Archivo");
        JMenu m2 = new JMenu("Vista");
        JMenu m3 = new JMenu("Herramientas");
        JMenu m4 = new JMenu("Ayuda");

        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m12 = new JMenuItem("Nuevo");
        JMenuItem m21 = new JMenuItem("Horizontal");
        JMenuItem m22 = new JMenuItem("Vertical");
        JMenuItem m31 = new JMenuItem("Personalizar");
        JMenuItem m32 = new JMenuItem("Ampliar");
        JMenuItem m41 = new JMenuItem("Administrador");
        JMenuItem m42 = new JMenuItem("Seleccione si es imbécil");

        m1.add(m11);
        m1.add(m12);
        m2.add(m21);
        m2.add(m22);
        m3.add(m31);
        m3.add(m32);
        m4.add(m41);
        m4.add(m42);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        JLabel label = new JLabel("Ingrese mensaje: ");
        JTextField tf = new JTextField(10);
        JButton buton = new JButton("Enviar");
        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(tf);
        panel.add(buton);

        JTextArea ta = new JTextArea();


        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setTitle("User Pachis");
        frame.add(BorderLayout.NORTH, mb);
        frame.add(BorderLayout.SOUTH, panel);
        frame.setSize(500,200);
        frame.add(BorderLayout.LINE_START, ta);

        
    }
}