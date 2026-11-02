import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador {
    private final VentanaPrincipal vista;
    private InspectorModelo modelo;

    public Controlador(InspectorModelo modelo, VentanaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.btnAnalizarTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                analisisTexto();
            }
        });

        this.vista.btnOperarNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operarNumero();
            }
        });
        
        this.vista.btnJuegoAdivina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juegarAdivina();
            }
        });
    }
    private void analisisTexto() {
    String texto = vista.campoEntrada.getText();

    int largo = modelo.calcularLargo(texto);
    String mayus = modelo.convertirAMayusculas(texto);

    vista.labelLargo.setText("Largo: " + largo);
    vista.labelMayus.setText("Mayúsculas: " + mayus);
}

private void operarNumero() {
    try {
        String texto = vista.campoEntrada.getText();
        double numero = Double.parseDouble(texto);

        double raiz = modelo.calcularRaizCuadrada(numero);
        double potencia = modelo.calcularPotencia(numero);

        vista.labelRaiz.setText("Raíz cuadrada: " + raiz);
        vista.labelPotencia.setText("Al Cuadrado: " + potencia);
    } catch (NumberFormatException ex) {
        vista.labelRaiz.setText("Raíz Cuadrada: Error (ingresa un número)");
        vista.labelPotencia.setText("Al Cuadrado: Error");
    }
}

private void juegarAdivina() {
    vista.labelError.setText("");
    try {
        String texto = vista.campoEntrada.getText();
        int intento = Integer.parseInt(texto);

        int secreto = modelo.generarNumeroSecreto();

        if (intento == secreto) {
            vista.labelJuego.setText("¡Ganaste! El número secreto era " + secreto);
        } else {
            vista.labelJuego.setText("Perdiste.  Era " + secreto + ", tú dijiste " +  intento);

        }
        
    } catch (NumberFormatException ex) {
        vista.labelError.setText("Error: Debes ingresar un número entero (1-10).");
    }
 }

}



