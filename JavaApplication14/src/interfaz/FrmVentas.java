package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmVentas extends JFrame {
    private Sistema sistema;

    public FrmVentas(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Separación y ventas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
