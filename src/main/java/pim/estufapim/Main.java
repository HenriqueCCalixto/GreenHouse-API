package pim.estufapim;

import com.formdev.flatlaf.FlatLightLaf;
import dao.EstufaDAO;
import view.CadastroView;
import controller.ControllerCadastro;
import controller.ControllerCadastroUsuario;
import controller.ControllerLoginUsuario;
import javax.swing.UIManager;
import view.CadastroLoginUsuarioView;
import view.CadastroUsuarioView;

public class Main {

    public static void main(String[] args) {
        /*
CadastroView cadastroView = new CadastroView();
EstufaDAO estufaDAO = new EstufaDAO();
ControllerCadastro controllerCadastro = new ControllerCadastro(cadastroView, estufaDAO);
cadastroView.setVisible(true);
         */
        flat();
        ControllerLoginUsuario usuario = new ControllerLoginUsuario(new CadastroLoginUsuarioView(null, true));
    }

    public static void flat() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }
}
