package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_basica {
    public JPanel Calculadora;
    private JTextField n1;
    private JTextField n2;
    private JButton suma;
    private JLabel Respuesta;
    private JButton resta;
    private JButton Multiplicar;
    private JButton Dividir;
    private JLabel TOTAL;
    private String x;

    public Calculadora_basica() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double nu1=Double.parseDouble(n1.getText());
                Double nu2=Double.parseDouble(n2.getText());
                TOTAL.setText(String.valueOf(nu1+nu2));

            }
        });
        Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double nu1=Double.parseDouble(n1.getText());
                Double nu2=Double.parseDouble(n2.getText());
                if(nu2!=0){
                    TOTAL.setText(String.valueOf(nu1/nu2));
                }
                else {
                    x="Error";
                    TOTAL.setText(String.valueOf(x));
                }
            }

            });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double nu1=Double.parseDouble(n1.getText());
                Double nu2=Double.parseDouble(n2.getText());
                TOTAL.setText(String.valueOf(nu1-nu2));
            }
        });
        Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double nu1=Double.parseDouble(n1.getText());
                Double nu2=Double.parseDouble(n2.getText());
                TOTAL.setText(String.valueOf(nu1*nu2));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
