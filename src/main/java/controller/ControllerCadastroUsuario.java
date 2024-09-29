package controller;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import model.Usuario;
import org.mindrot.jbcrypt.BCrypt;
import view.CadastroUsuarioView;

public class ControllerCadastroUsuario {

    private CadastroUsuarioView view;
    private Usuario usuario = new Usuario();
    private UsuarioDAO dao = new UsuarioDAO();

    public ControllerCadastroUsuario(CadastroUsuarioView view) {
        this.view = view;
        addEvents();
        this.view.setVisible(true);
    }

    private void addEvents() {
        view.getBtnSalvar().addActionListener(e -> salvar());
    }

    private void popularUsuario() {
        usuario.setNome(view.getTxtNome().getText());
        usuario.setUserName(view.getTxtUserName().getText());
        String senha = BCrypt.hashpw(new String(view.getTxtSenha().getPassword()), BCrypt.gensalt());
        usuario.setSenha(senha);
    }

    private void salvar() {
        try {
            popularUsuario();
            dao.save(usuario);
            JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso!");
            view.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Erro ao salvar a estufa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

}
