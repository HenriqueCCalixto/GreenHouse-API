package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.CadastroUsuarioView;

public class ControllerCadastroUsuario {
    
    private CadastroUsuarioView view;
    private Usuario usuario;
    private UsuarioDAO dao;
    
    public ControllerCadastroUsuario() {
        view = new CadastroUsuarioView(null, true);
        dao = new UsuarioDAO();
    }
    
    private void popularUsuario() {
        usuario.setNome(view.getTxtNome().getText());
        usuario.setUserName(view.getTxtUserName().getText());
        usuario.setSenha(new String(view.getTxtSenha().getPassword()));
    }
    
    private void salvar() {
        popularUsuario();
        dao.save(usuario);
    }
    
}
