import  javax.swing.*;
import java.awt.*;

public class Ejemplo extends JFrame {
    public Ejemplo() {
        setTitle("Calculadora");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String numero1 = texField1.getText();
        String numero2 = texField2.getText();

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        int suma = num1 + num2;

        String resultadoString = String.valueOf(suma);

        resultadoLabel.setText(resultadoString);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorde(BorderFactory.createEmptyBorder(15,20,15,20));
        JLabel lblSumar = new JLabel("-", swingConstants.CENTER);
        lblSumar.setFont(new Font("Arial", Font.BOLD, 55));
        JButton btnSumar = new JButton("Sumar");
        panel.add(lblSumar, BorderLayout.CENTER);
        panel.add(btnSumar, BorderLayout.SOUTH);
        add(panel);

        public static void main(String[] args) {
            SwingUtilities.invokerLater(() -> new Ejemplo().setVisible(true));
        }
    }
}