package interfaz;

import javax.swing.JFrame;
import gestion.Sistema;

public class FrmEmpleados extends JFrame {
    private Sistema sistema;

    public FrmEmpleados(Sistema sistema) {
        this.sistema = sistema;
        setTitle("Gestión de empleados");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        // Aquí se agregará el diseño de la ventana.
    }
}
