package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmObra extends JFrame {
    private Sistema sistema;

    public FrmObra(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Avance de obra y postventa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
