package controller;

import controller.ControllerCadastro;
import dao.EstufaDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;
import model.EstufaEntity;
import model.EstufaEntity;
import model.EstufaTableRenderer;
import model.TableEstufaModel;
import model.TableEstufaModel;
import model.Usuario;
import model.Usuario;
import view.CadastroEstufaView;
import view.ConsultaEstufaView;

public class ControllerHome {

    private ConsultaEstufaView view;
    private EstufaDAO estufaImple = new EstufaDAO();
    private List<EstufaEntity> lista = estufaImple.findAll();
    private Usuario usuario;
    private EstufaEntity estufa = new EstufaEntity();

    public ControllerHome(ConsultaEstufaView view, Usuario usuario) {
        this.view = view;
        popularTb();
        adicionarEventos();
        this.usuario = usuario;
        this.view.setVisible(true);
    }

    private void adicionarEventos() {
        view.getBtnNovo().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                adicionarEstufa();
            }
        });

        view.getBtnExcluir().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                excluirEstufa();
            }
        });

        view.getTbEstufas().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = view.getTbEstufas().getSelectedRow();
                    if (row != -1) {
                        EstufaEntity estufa = lista.get(row);
                        ControllerCadastro controllerCadastro = new ControllerCadastro(new CadastroEstufaView(null, true), estufa);
                        popularTb();
                    }
                }
            }
        });

        view.getTbEstufas().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = view.getTbEstufas().getSelectedRow();
                    definirEstufaArduino(row);
                }
            }
        });

    }

    private void popularTb() {
        lista = estufaImple.findAll();
        TableEstufaModel model = new TableEstufaModel(lista);
        view.getTbEstufas().setModel(model);
        view.getTbEstufas().setFont(new Font("Arial", Font.PLAIN, 16));
        view.getTbEstufas().setRowHeight(50);

        view.getJsPaneTabelaEstufa().setBackground(Color.decode("#205a42"));
        view.getJsPaneTabelaEstufa().setOpaque(true);
        view.getJsPaneTabelaEstufa().getViewport().setOpaque(false);

        view.getTbEstufas().setShowGrid(true);
        view.getTbEstufas().setGridColor(Color.decode("#5edb12"));
        view.getTbEstufas().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < view.getTbEstufas().getColumnCount(); i++) {
            view.getTbEstufas().getColumnModel().getColumn(i).setPreferredWidth(180);
            view.getTbEstufas().getColumnModel().getColumn(i).setCellRenderer(new EstufaTableRenderer());
        }

        EstufaTableRenderer renderer = new EstufaTableRenderer();
        for (int i = 0; i < view.getTbEstufas().getColumnCount(); i++) {
            view.getTbEstufas().getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        for (int i = 0; i < view.getTbEstufas().getColumnCount(); i++) {
            view.getTbEstufas().getTableHeader().getColumnModel().getColumn(i)
                    .setHeaderRenderer((TableCellRenderer) renderer.getHeaderRendererComponent(view.getTbEstufas()));
        }
    }

    private void excluirEstufa() {
        int selectedEstufa = view.getTbEstufas().getSelectedRow();
        if (selectedEstufa == -1 || selectedEstufa >= lista.size()) {
            JOptionPane.showMessageDialog(null, "Selecione uma estufa válida para excluir.");
            return;
        }

        try {
            estufaImple.delete(lista.get(selectedEstufa));
            popularTb();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a estufa: " + e.getMessage());
        }
    }

    private void adicionarEstufa() {
        ControllerCadastro controllerCadastro = new ControllerCadastro(new CadastroEstufaView(null, true));
        popularTb();
    }

    private void definirEstufaArduino(int row) {
        if (row >= 0 && row < lista.size()) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja definir a estufa?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
            );

            if (resposta == JOptionPane.YES_OPTION) {
                estufa = lista.get(row);
                JOptionPane.showMessageDialog(null, "Estufa definida com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha inválida!");
        }
    }

}
