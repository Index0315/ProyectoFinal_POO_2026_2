package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmAdicionales extends JFrame {
    private Sistema sistema;

    public FrmAdicionales(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Gestión de adicionales y paquetes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
