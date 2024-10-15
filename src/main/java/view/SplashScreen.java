package view;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JWindow {

    private JProgressBar progressBar;

    public SplashScreen() {
        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.white);
        content.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("imagens/carregandoTela.png"));
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setPreferredSize(new Dimension(400, 225));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        content.add(imageLabel, BorderLayout.CENTER);

        progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        progressBar.setForeground(Color.decode("#5edb12"));
        content.add(progressBar, BorderLayout.SOUTH);

        setSize(400, 235);
        setLocationRelativeTo(null);
    }

    public void showSplash() {
        setVisible(true);
    }

    public void hideSplash() {
        setVisible(false);
        dispose();
    }
}
