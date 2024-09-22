package controller;

import dao.EstufaDAO;
import javax.swing.JOptionPane;
import model.EstufaEntity;
import view.CadastroView;

public class ControllerCadastro {

    private CadastroView cadastroView;
    private EstufaDAO estufaDAO;

    public ControllerCadastro(CadastroView cadastroView, EstufaDAO estufaDAO) {
        this.cadastroView = cadastroView;
        this.estufaDAO = estufaDAO;

        cadastroView.getSalvarButton().addActionListener(e -> salvarEstufa());
    }

    private void salvarEstufa() {
        try {
            String nomeEstufa = cadastroView.getNomeEstufaField().getText();
            String nomePlanta = cadastroView.getNomePlantaField().getText();
            Double temperaturaMax = Double.parseDouble(cadastroView.getTemperaturaMaxField().getText());
            Double temperaturaMin = Double.parseDouble(cadastroView.getTemperaturaMinField().getText());
            Double umidadeMax = Double.parseDouble(cadastroView.getUmidadeMaxField().getText());
            Double umidadeMin = Double.parseDouble(cadastroView.getUmidadeMinField().getText());
            Integer lumens = Integer.parseInt(cadastroView.getLumensField().getText());

            EstufaEntity estufa = new EstufaEntity();
            estufa.setNomeEstufa(nomeEstufa);
            estufa.setNomePlanta(nomePlanta);
            estufa.setTemperaturaMax(temperaturaMax);
            estufa.setTemperaturaMin(temperaturaMin);
            estufa.setUmidadeMax(umidadeMax);
            estufa.setUmidadeMin(umidadeMin);
            estufa.setQuantidadeLumens(lumens);

            estufaDAO.save(estufa);
            JOptionPane.showMessageDialog(null, "Estufa salva com sucesso!");
            clearFields(); // Limpa os campos após salvar
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(cadastroView, "Por favor, insira valores válidos para as temperaturas e luminosidade.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cadastroView, "Erro ao salvar a estufa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        cadastroView.getNomeEstufaField().setText("");
        cadastroView.getNomePlantaField().setText("");
        cadastroView.getTemperaturaMaxField().setText("");
        cadastroView.getTemperaturaMinField().setText("");
        cadastroView.getUmidadeMaxField().setText("");
        cadastroView.getUmidadeMinField().setText("");
        cadastroView.getLumensField().setText("");
    }
}
