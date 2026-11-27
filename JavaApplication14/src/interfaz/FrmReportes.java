package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmReportes extends JFrame {
    private Sistema sistema;

    public FrmReportes(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Reportes gerenciales");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
