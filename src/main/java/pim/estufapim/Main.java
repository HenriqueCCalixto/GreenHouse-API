package pim.estufapim;

import dao.EstufaDAO;
import view.CadastroView;
import controller.ControllerCadastro;
import controller.ControllerCadastroUsuario;
import controller.ControllerLoginUsuario;
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
        ControllerLoginUsuario usuario = new ControllerLoginUsuario(new CadastroLoginUsuarioView(null, true));
    }
}
