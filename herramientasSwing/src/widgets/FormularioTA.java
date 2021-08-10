package widgets;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FormularioTA extends JFrame {
    private JTextField campoEmail;
    private JTextArea campoArea;
    private JScrollPane scrollpanel;
    
    public FormularioTA() {
        setLayout(null);
        campoEmail = new JTextField();
        campoEmail.setBounds(10, 10, 200, 30);
        add(campoEmail);

        campoArea = new JTextArea();
        //campoArea.setBounds(10, 50, 400, 300);
        //add(campoArea);

        scrollpanel = new JScrollPane(campoArea);
        scrollpanel.setBounds(10, 50, 400, 300);
        add(scrollpanel);
    }


    public static void main(String[] args) {
        FormularioTA formulario = new FormularioTA();
        formulario.setBounds(0, 0, 350, 450);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
