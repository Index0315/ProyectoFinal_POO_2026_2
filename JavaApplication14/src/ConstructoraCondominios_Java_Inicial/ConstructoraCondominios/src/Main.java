import gestion.Sistema;
import interfaz.FrmLogin;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Sistema sistema = new Sistema();
            FrmLogin login = new FrmLogin(sistema);
            login.setVisible(true);
        });
    }
}
