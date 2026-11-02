
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        // 1. Creamos el modelo (la lógica de datos y cálculos)
        InspectorModelo modelo = new InspectorModelo();
        
        // 2. Creamos la vista (la ventana con los botones y campos)
        VentanaPrincipal vista = new VentanaPrincipal();
        
        // 3. Creamos el controlador y le pasamos ambos para que los conecte
        Controlador controlador = new Controlador(modelo, vista);
        
        // 4. Hacemos visible la ventana
        vista.setVisible(true);
    }
}
