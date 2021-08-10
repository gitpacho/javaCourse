package CB_RB;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        FormularioCB formulario = new FormularioCB();
        formulario.setBounds(0,0,500,500);
        formulario.setLocationRelativeTo(null);  //ventana emergente en el centro des escritorio
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
