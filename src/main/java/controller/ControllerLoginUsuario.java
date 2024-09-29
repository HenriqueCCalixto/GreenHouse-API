package controller;

import dao.EstufaDAO;
import dao.UsuarioDAO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import model.Usuario;
import org.mindrot.jbcrypt.BCrypt;
import view.CadastroLoginUsuarioView;
import view.CadastroUsuarioView;
import view.CadastroView;

public class ControllerLoginUsuario {

    private CadastroLoginUsuarioView view;
    private Usuario usuario = new Usuario();
    private UsuarioDAO dao = new UsuarioDAO();

    public ControllerLoginUsuario(CadastroLoginUsuarioView view) {
        this.view = view;
        addEvents();
        this.view.setVisible(true);
    }

    private void addEvents() {
        view.getBtnEntrar().addActionListener(e -> entrar());
        view.getCadastrarUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cadastrarUsuario();
            }
        });
    }

    private boolean verificarLogin() {
    String userName = view.getTxtUserName().getText();
    String senha = new String(view.getTxtSenha().getPassword());

    usuario = dao.findByUserName(userName);

    if (usuario == null) {
        JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        return false;
    }

    if (BCrypt.checkpw(senha, usuario.getSenha())) {
        JOptionPane.showMessageDialog(null, "Login com sucesso");
        return true;
    }  else {
        JOptionPane.showMessageDialog(null, "Senha incorreta");
        return false;
    }
}


    private void entrar() {
        if (verificarLogin()) {
            view.dispose();
            CadastroView cadastroView = new CadastroView();
            EstufaDAO estufaDAO = new EstufaDAO();
            ControllerCadastro controllerCadastro = new ControllerCadastro(cadastroView, estufaDAO);
            cadastroView.setVisible(true);
        }

    }

    private void cadastrarUsuario() {
        ControllerCadastroUsuario usuario = new ControllerCadastroUsuario(new CadastroUsuarioView(null, true));
    }

}
