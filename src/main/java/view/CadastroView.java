/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author xialas
 */
public class CadastroView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroView
     */
    public CadastroView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sliderUmiMinima = new javax.swing.JSlider();
        lblTempMax = new javax.swing.JLabel();
        sliderQuantLumens = new javax.swing.JSlider();
        nomeEstufaField = new javax.swing.JTextField();
        lblUmiMax = new javax.swing.JLabel();
        nomePlantaField = new javax.swing.JTextField();
        lumensField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        lblQtdLumens = new javax.swing.JLabel();
        lblNameEstufa = new javax.swing.JLabel();
        lblNamePlanta = new javax.swing.JLabel();
        umidadeMaxField = new javax.swing.JTextField();
        umidadeMinField = new javax.swing.JTextField();
        sliderTempMinima = new javax.swing.JSlider();
        temperaturaMinField = new javax.swing.JTextField();
        lblUmiMin = new javax.swing.JLabel();
        temperaturaMaxField = new javax.swing.JTextField();
        sliderTempMaxima = new javax.swing.JSlider();
        lblTempMin = new javax.swing.JLabel();
        sliderUmiMaxima = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Estufas");
        setMaximumSize(new java.awt.Dimension(914, 514));
        setMinimumSize(new java.awt.Dimension(914, 514));
        setPreferredSize(new java.awt.Dimension(914, 514));
        setSize(new java.awt.Dimension(914, 514));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sliderUmiMinima.setForeground(new java.awt.Color(94, 219, 18));
        getContentPane().add(sliderUmiMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        lblTempMax.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTempMax.setForeground(new java.awt.Color(255, 255, 255));
        lblTempMax.setText("Temperatura Máxima:");
        getContentPane().add(lblTempMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        sliderQuantLumens.setForeground(new java.awt.Color(94, 219, 18));
        getContentPane().add(sliderQuantLumens, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        nomeEstufaField.setBackground(new java.awt.Color(204, 204, 204));
        nomeEstufaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEstufaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeEstufaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, -1));

        lblUmiMax.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblUmiMax.setForeground(new java.awt.Color(255, 255, 255));
        lblUmiMax.setText("Umidade Máxima:");
        getContentPane().add(lblUmiMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        nomePlantaField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(nomePlantaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 97, 250, -1));

        lumensField.setBackground(new java.awt.Color(204, 204, 204));
        lumensField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumensFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lumensField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 40, -1));

        salvarButton.setBackground(new java.awt.Color(94, 219, 18));
        salvarButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        salvarButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarButton.setText("SALVAR");
        salvarButton.setMaximumSize(new java.awt.Dimension(900, 500));
        salvarButton.setMinimumSize(new java.awt.Dimension(900, 500));
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 90, 30));

        lblQtdLumens.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblQtdLumens.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdLumens.setText("Quantidade Lumens:");
        getContentPane().add(lblQtdLumens, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lblNameEstufa.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNameEstufa.setForeground(new java.awt.Color(255, 255, 255));
        lblNameEstufa.setText("Nome da Estufa:");
        getContentPane().add(lblNameEstufa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblNamePlanta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNamePlanta.setForeground(new java.awt.Color(255, 255, 255));
        lblNamePlanta.setText("Nome da Planta:");
        getContentPane().add(lblNamePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        umidadeMaxField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(umidadeMaxField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 40, -1));

        umidadeMinField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(umidadeMinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 40, -1));

        sliderTempMinima.setForeground(new java.awt.Color(94, 219, 18));
        getContentPane().add(sliderTempMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        temperaturaMinField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(temperaturaMinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 40, -1));

        lblUmiMin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblUmiMin.setForeground(new java.awt.Color(255, 255, 255));
        lblUmiMin.setText("Umidade Mínima:");
        getContentPane().add(lblUmiMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        temperaturaMaxField.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(temperaturaMaxField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 40, -1));

        sliderTempMaxima.setForeground(new java.awt.Color(94, 219, 18));
        getContentPane().add(sliderTempMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        lblTempMin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTempMin.setForeground(new java.awt.Color(255, 255, 255));
        lblTempMin.setText("Temperatura Mínima:");
        getContentPane().add(lblTempMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        sliderUmiMaxima.setForeground(new java.awt.Color(94, 219, 18));
        getContentPane().add(sliderUmiMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaCadastroEstufa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 914, 514));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeEstufaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEstufaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEstufaFieldActionPerformed

    private void lumensFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumensFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lumensFieldActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNameEstufa;
    private javax.swing.JLabel lblNamePlanta;
    private javax.swing.JLabel lblQtdLumens;
    private javax.swing.JLabel lblTempMax;
    private javax.swing.JLabel lblTempMin;
    private javax.swing.JLabel lblUmiMax;
    private javax.swing.JLabel lblUmiMin;
    private javax.swing.JTextField lumensField;
    private javax.swing.JTextField nomeEstufaField;
    private javax.swing.JTextField nomePlantaField;
    private javax.swing.JButton salvarButton;
    private javax.swing.JSlider sliderQuantLumens;
    private javax.swing.JSlider sliderTempMaxima;
    private javax.swing.JSlider sliderTempMinima;
    private javax.swing.JSlider sliderUmiMaxima;
    private javax.swing.JSlider sliderUmiMinima;
    private javax.swing.JTextField temperaturaMaxField;
    private javax.swing.JTextField temperaturaMinField;
    private javax.swing.JTextField umidadeMaxField;
    private javax.swing.JTextField umidadeMinField;
    // End of variables declaration//GEN-END:variables

    public JTextField getLumensField() {
        return lumensField;
    }

    public void setLumensField(JTextField lumensField) {
        this.lumensField = lumensField;
    }

    public JTextField getNomeEstufaField() {
        return nomeEstufaField;
    }

    public void setNomeEstufaField(JTextField nomeEstufaField) {
        this.nomeEstufaField = nomeEstufaField;
    }

    public JTextField getNomePlantaField() {
        return nomePlantaField;
    }

    public void setNomePlantaField(JTextField nomePlantaField) {
        this.nomePlantaField = nomePlantaField;
    }

    public JTextField getTemperaturaMaxField() {
        return temperaturaMaxField;
    }

    public void setTemperaturaMaxField(JTextField temperaturaMaxField) {
        this.temperaturaMaxField = temperaturaMaxField;
    }

    public JTextField getTemperaturaMinField() {
        return temperaturaMinField;
    }

    public void setTemperaturaMinField(JTextField temperaturaMinField) {
        this.temperaturaMinField = temperaturaMinField;
    }

    public JTextField getUmidadeMaxField() {
        return umidadeMaxField;
    }

    public void setUmidadeMaxField(JTextField umidadeMaxField) {
        this.umidadeMaxField = umidadeMaxField;
    }

    public JTextField getUmidadeMinField() {
        return umidadeMinField;
    }

    public void setUmidadeMinField(JTextField umidadeMinField) {
        this.umidadeMinField = umidadeMinField;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(JButton salvarButton) {
        this.salvarButton = salvarButton;
    }

    public JSlider getSliderTempMaxima() {
        return sliderTempMaxima;
    }

    public void setSliderTempMaxima(JSlider sliderTempMaxima) {
        this.sliderTempMaxima = sliderTempMaxima;
    }

    public JSlider getSliderQuantLumens() {
        return sliderQuantLumens;
    }

    public void setSliderQuantLumens(JSlider sliderQuantLumens) {
        this.sliderQuantLumens = sliderQuantLumens;
    }

    public JSlider getSliderTempMinima() {
        return sliderTempMinima;
    }

    public void setSliderTempMinima(JSlider sliderTempMinima) {
        this.sliderTempMinima = sliderTempMinima;
    }

    public JSlider getSliderUmiMaxima() {
        return sliderUmiMaxima;
    }

    public void setSliderUmiMaxima(JSlider sliderUmiMaxima) {
        this.sliderUmiMaxima = sliderUmiMaxima;
    }

    public JSlider getSliderUmiMinima() {
        return sliderUmiMinima;
    }

    public void setSliderUmiMinima(JSlider sliderUmiMinima) {
        this.sliderUmiMinima = sliderUmiMinima;
    }
    
}
