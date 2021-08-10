package widgets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class FormularioTF extends JFrame implements ActionListener{
    private JTextField campoUsuario;
    private JLabel labelUsuario;
    private JButton btnAceptar;

    public FormularioTF() {
        setLayout(null);
        
        labelUsuario = new JLabel();
        labelUsuario.setText("Usuario");
        labelUsuario.setBounds(10,10, 100, 30);
        add(labelUsuario);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(120, 10, 150, 30);
        add(campoUsuario);

        btnAceptar = new JButton();
        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(10, 50,100,20);
        add(btnAceptar);
        btnAceptar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String cad = campoUsuario.getText();
            setTitle(cad);
            //labelUsuario.setText(cad);
            //campoUsuario.setText("valor establecido");
        }        
    }

    public static void main(String[] args) {
        FormularioTF formulario = new FormularioTF();
        formulario.setBounds(0,0, 350, 200);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}