package pim.estufapim;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import dao.EstufaDAO;
import controller.ControllerCadastro;
import controller.ControllerCadastroUsuario;
import controller.ControllerLoginUsuario;
import java.awt.Color;
import javax.swing.UIManager;
import view.CadastroLoginUsuarioView;
import view.CadastroUsuarioView;
import view.SplashScreen;

public class Main {

    public static void main(String[] args) {
        // Exibe a splash screen
        SplashScreen splash = new SplashScreen();
        splash.showSplash();

        // Simula o tempo de inicialização (substitua com sua lógica de inicialização)
        try {
            Thread.sleep(3000);  // Simulando uma carga de 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Inicializa a interface gráfica
        flat();
        ControllerLoginUsuario usuario = new ControllerLoginUsuario(new CadastroLoginUsuarioView(null, true));

        // Fecha a splash screen após a inicialização
        splash.hideSplash();
    }

    public static void flat() {
        try {
            UIManager.put("Button.arc", 0);
            UIManager.put("Component.arc", 999);
            UIManager.put("ProgressBar.arc", 999);
            UIManager.put("TextComponent.arc", 999);
            UIManager.put("Componente.focusWidth", 3);
            UIManager.put("Component.focusColor", new Color(94, 219, 18));
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    public static void flatInte() {
        try {
            UIManager.put("Button.arc", 0);
            UIManager.put("Component.arc", 999);
            UIManager.put("ProgressBar.arc", 999);
            UIManager.put("TextComponent.arc", 999);
            UIManager.put("Componente.focusWidth", 3);
            UIManager.put("Component.focusColor", new Color(94, 219, 18));
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }
}
