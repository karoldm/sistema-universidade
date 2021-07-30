
package Interface;

import java.awt.Color;
import java.io.IOException;

/**
 *
 * @author Felipe de Freitas
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        UIHome home = new UIHome();
        home.setVisible(true);
        home.setTitle("Sistema de cadastro UNESP");
        home.toFront();
        home.setResizable(false);
        home.getContentPane().setBackground(Color.white);
        home.setLocationRelativeTo(null);
    }
}
