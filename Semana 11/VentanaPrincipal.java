import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
  //componentes de entrada y botones 
  public JTextField campoEntrada;
  public JButton btnAnalizarTexto;
  public JButton btnOperarNumero;
  public JButton btnJuegoAdivina;

  //Etiquetas para mostrar los resultados
  public JLabel labelLargo;
  public JLabel labelMayus;
  public JLabel labelRaiz;
  public JLabel labelPotencia;
  public JLabel labelJuego;
  public JLabel labelError;

    public VentanaPrincipal() {
    setTitle("Inspector de Texto y Juego de Adivinanza");
    setSize(400,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout(10,10));

    // 1. Panel superior Entrada
    JPanel panelEntrada = new JPanel();
    panelEntrada.add(new JLabel("Ingrese un dato(texto o número):"));
    campoEntrada = new JTextField();
    campoEntrada.setPreferredSize(new Dimension(200, 50));
    panelEntrada.add(campoEntrada);

    // 2. Panel central Botones
    JPanel panelBotones = new JPanel();
    panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
    btnAnalizarTexto = new JButton("Analizar Texto");
    btnOperarNumero = new JButton("Operar Número");
    btnJuegoAdivina = new JButton("Adivina el Número");

    //definir un tamaño uniforme para los botones
    Dimension tamanioBoton = new Dimension(320, 45);
    btnAnalizarTexto.setMaximumSize(tamanioBoton);
    btnAnalizarTexto.setPreferredSize(tamanioBoton);

    btnOperarNumero.setMaximumSize(tamanioBoton);
    btnOperarNumero.setPreferredSize(tamanioBoton);
    
    btnJuegoAdivina.setMaximumSize(tamanioBoton);
    btnJuegoAdivina.setPreferredSize(tamanioBoton);

    //centrar los botones en el panel
    btnAnalizarTexto.setAlignmentX(Component.CENTER_ALIGNMENT);
    btnOperarNumero.setAlignmentX(Component.CENTER_ALIGNMENT);
    btnJuegoAdivina.setAlignmentX(Component.CENTER_ALIGNMENT);

    //agregar los botones separacion vertical
    panelBotones.add(Box.createVerticalStrut(8));
    panelBotones.add(btnAnalizarTexto);
    panelBotones.add(Box.createVerticalStrut(8));

    panelBotones.add(btnOperarNumero);
    panelBotones.add(Box.createVerticalStrut(8));
    panelBotones.add(btnJuegoAdivina);

    // 3. Panel inferior Resultados
    JPanel panelResultados = new JPanel(new GridLayout(6,1,5,5));
    panelResultados.setBorder(BorderFactory.createEmptyBorder(10, 15, 15, 15));
    panelResultados.setBackground(new Color(248, 249, 250));

    labelLargo = new JLabel("Largo: ");
    labelLargo.setForeground(new Color(100,100,50));

    labelMayus = new JLabel("Mayúsculas: ");
    labelMayus.setForeground(new Color(0,102,204));

    labelRaiz = new JLabel("Raíz cuadrada: ");
    labelRaiz.setForeground(new Color(0,153,76));

    labelPotencia = new JLabel("Al Cuadrado: ");
    labelPotencia.setForeground(new Color(153,0,0));

    labelJuego = new JLabel("Resultado del Juego: ");
    labelJuego.setForeground(new Color(100,100,50));
    labelError = new JLabel("", SwingConstants.CENTER);
    labelError.setForeground(Color.RED);

    panelResultados.add(labelLargo);
    panelResultados.add(labelMayus);
    panelResultados.add(labelRaiz);
    panelResultados.add(labelPotencia);
    panelResultados.add(labelJuego);
    panelResultados.add(labelError);

    // Agregamos los paneles a la ventana principal
    add(panelEntrada, BorderLayout.NORTH);
    add(panelBotones, BorderLayout.CENTER);
    add(panelResultados, BorderLayout.SOUTH);

  }
}
