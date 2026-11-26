package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmProyectos extends JFrame {
    private Sistema sistema;

    public FrmProyectos(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Gestión de proyectos y unidades");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
