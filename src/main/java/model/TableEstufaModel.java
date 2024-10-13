package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableEstufaModel extends AbstractTableModel {

    private List<EstufaEntity> tabela;

    private String[] colunas = {"Nome da Estufa", "Nome da Planta", "Temperatura Máxima",
        "Temperatura Mínima", "Umidade Máxima", "Umidade Mínima", "Quantidade de Lumens"};

    Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class,
        java.lang.String.class, java.lang.String.class, java.lang.String.class};

    public TableEstufaModel(List<EstufaEntity> lista) {
        tabela = lista;
    }

    @Override
    public int getRowCount() {
        return tabela.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstufaEntity estufa = tabela.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return estufa.getNomeEstufa();
            case 1:
                return estufa.getNomeEstufa();
            case 2:
                return estufa.getTemperaturaMax();
            case 3:
                return estufa.getTemperaturaMin();
            case 4:
                return estufa.getUmidadeMax();
            case 5:
                return estufa.getUmidadeMin();
            case 6:
                return estufa.getQuantidadeLumens();
            default:
                return null;

        }
    }

}
