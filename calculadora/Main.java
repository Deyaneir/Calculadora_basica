package calculadora;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora");
        JFrame frame = new JFrame("Aplicacion para operaciones basicas");
        frame.setContentPane(new Calculadora_basica().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setPreferredSize(new Dimension(1024, 768));
        frame.pack();
        frame.setVisible(true);
    }
}