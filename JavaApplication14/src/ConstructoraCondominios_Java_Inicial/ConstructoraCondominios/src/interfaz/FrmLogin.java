package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmLogin extends JFrame {
    private Sistema sistema;

    public FrmLogin(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Inicio de sesión");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
