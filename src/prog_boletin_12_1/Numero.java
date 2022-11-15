package prog_boletin_12_1;

import javax.swing.JOptionPane;

public class Numero {

    boolean sw = true;
    int numero;

    public void pedirNumero() {
        do {
            numero = pedirEntero();

            for (int i = 1; i < 6 ; i++) {
                numero = pedirEntero();
                if (numero <= 1) {
                    if (numero <= 50) {
                        if (sw != true) {
                            JOptionPane.showMessageDialog(null, "¡Adivinaste!");
                            sw = false;
                        } else {
                            JOptionPane.showMessageDialog(null, "Inténtalo otra vez");
                        }
                        sw = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduce un número menor que 50");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Introduce un número mayor que 1");
                }
            }
        } while (numero <= 0 || numero > 50);
    }

    public static int pedirEntero() {
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea número"));
    }

}
