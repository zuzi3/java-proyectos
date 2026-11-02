
public class InspectorModelo {
    //1 Calcular el largo de un texto
    public int calcularLargo(String texto) {
        if (texto == null) {
            return 0;
        }
        return texto.length();
    }

    //2 Convertir un texto a mayúsculas
    public String convertirAMayusculas(String texto) {
        if (texto == null) {
            return "";
        }
        return texto.toUpperCase();
    }

    //3 Calcular la raíz cuadrada de un número
    public double calcularRaizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    //4 Calcular la potencia de un número
    public double calcularPotencia(double numero) {
        return Math.pow(numero, 2);
    }

    //5 Juego de adivinanza
    public int generarNumeroSecreto() {
        return (int) (Math.random() * 10) + 1; 
    }
}