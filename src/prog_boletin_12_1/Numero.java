package prog_boletin_12_1;

import javax.swing.JOptionPane;

public class Numero {

    int numeroSecreto;
    int cantidadIntentos;
    int intento;

    public void pedirNumero() {
        do {
            numeroSecreto = pedirEntero("Jugador 1: Teclea el número secreto");
            cantidadIntentos = pedirEntero("Jugador 1: Asigna el número de intentos que va a tener el Jugador 2");
        } while (numeroSecreto <= 0 || numeroSecreto > 50);
        for (int i = 1; i <= cantidadIntentos; i++) {
            intento = pedirEntero("Juagador 2: Teclea y adivina el número del Jugador 1");
            if (intento == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "¡Adivinaste!");
                break;
            } else if (i<cantidadIntentos && intento>numeroSecreto){
                JOptionPane.showMessageDialog(null, "El número es menor\nInténtalo otra vez");
            }else if (intento<numeroSecreto){
                JOptionPane.showMessageDialog(null, "El número es mayor\nInténtalo otra vez");
            }else
                JOptionPane.showMessageDialog(null, "Fin del Juego\nSe te acabaron los intentos");

        }
    }

    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

}
