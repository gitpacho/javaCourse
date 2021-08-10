package layout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.*;
import static java.awt.Font.PLAIN;

public class FormularioGridLayout extends JFrame{
    private FlowLayout miFlowLayout;
    private JLabel lblDisplay;
    private JPanel panelBotones;
    private GridLayout mGridLayout;
    private JButton boton[];

    public FormularioGridLayout(){
        pantalla();
        Display();
        Botones();
    }

    private void pantalla() {
        miFlowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
        setLayout(miFlowLayout);
        setTitle("Calculadora");
        setMinimumSize(new Dimension(255, 405));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void Display(){
        lblDisplay = new JLabel("0");
        lblDisplay.setPreferredSize(new Dimension(200, 60));
        lblDisplay.setBackground(Color.BLACK);
        lblDisplay.setForeground(Color.green);
        lblDisplay.setBorder(new LineBorder(Color.GRAY));
        lblDisplay.setFont(new Font("MONOSPACED", PLAIN, 24));
        lblDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblDisplay);
    }

    private void Botones(){
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.BLACK);
        mGridLayout = new GridLayout(4,4,3,3);
        panelBotones.setLayout(mGridLayout);
        add(panelBotones);

        String[] texto_boton = new String[] {"0",".","c","+","1","2","3","-","4","5","6","*","7","8","9","/"};
        boton = new JButton[16];
        for (int i = 0; i < 16; i++) {
            boton[i] = new JButton(texto_boton[i]);
            boton[i].setPreferredSize(new Dimension(40,50));
            boton[i].setFont(new Font("MONOSPACED", PLAIN, 16));
            boton[i].setBackground(Color.RED);
            boton[i].setBorder(new LineBorder(Color.WHITE));
            boton[i].setForeground(Color.white);
            panelBotones.add(boton[i]);
        }
    }

    public static void main(String[] args) {
        FormularioGridLayout formulario =  new FormularioGridLayout();
        formulario.setVisible(true);
    }
}