
package Interface;

import java.awt.Color;

/**
 *
 * @author Felipe de Freitas
 */
public class Principal {
    public static void main(String[] args) {
        UIHome home = new UIHome();
        home.setVisible(true);
        home.setTitle("Sistema de cadastro UNESP");
        home.toFront();
        home.setResizable(false);
        home.getContentPane().setBackground(Color.white);
    }
}
