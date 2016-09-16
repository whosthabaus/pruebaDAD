package ejercicio1dad;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Antonio Domínguez García - 2º DAM
 */
public class Ejercicio1DAD {

   public static void main(String[] args) {
        JFrame ventana = new JFrame();//Ventana principal
        JTextField texto = new JTextField("Campo uno");//campos de texto
        JTextField texto2 = new JTextField("Campo 2");
        JButton boton = new JButton("Botón");
        //Añadimos todos los elementos que queramos a la ventana principal
            ventana.getContentPane().add(texto);
            ventana.getContentPane().add(boton);//Botón
            ventana.getContentPane().add(new JLabel("Invernalia"));
            ventana.getContentPane().add(texto2);
            ventana.getContentPane().setLayout(new FlowLayout());
            ventana.getContentPane().add(new JLabel("(Etiqueta 2)"));
            ventana.setVisible(true);//Lo hacemos visible
            ventana.setSize(250,250);//Predefinimos un tamaño
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Finalizar programa al cerrar la ventana
            ventana.setTitle("Ejercicio 1 DAD.");//Título de la ventana
    }
    
}
