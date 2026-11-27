package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmMenuPrincipal extends JFrame {
    private Sistema sistema;

    public FrmMenuPrincipal(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Menú principal");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
