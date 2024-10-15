package model;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class EstufaTableRenderer extends DefaultTableCellRenderer implements TableCellRenderer {

    public EstufaTableRenderer() {
        setOpaque(true);
        setHorizontalAlignment(CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (isSelected) {
            setBackground(Color.decode("#5edb12"));
            setForeground(Color.WHITE);
        } else {
            setBackground(Color.decode("#205a42"));
            setForeground(Color.WHITE);
        }

        setHorizontalAlignment(CENTER);

        return this;
    }

    public static Component getHeaderRendererComponent(JTable table) {
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.decode("#172e08"));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setFont(headerRenderer.getFont().deriveFont(java.awt.Font.BOLD));
        headerRenderer.setHorizontalAlignment(CENTER);
        headerRenderer.setOpaque(true);
        return headerRenderer;
    }
}
