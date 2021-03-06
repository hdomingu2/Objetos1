/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.Fraccionario;
import javax.swing.JOptionPane;
/**
 *
 * @author hdomingu2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        txtEntero = new javax.swing.JTextField();
        cmdFraccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Ejercicio Uno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, -1));
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, 10));
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division", " " }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, -1));
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, 10));
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 60, -1));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 60, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, 10));
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 60, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        txtEntero.setEditable(false);
        jPanel1.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 30, 30));

        cmdFraccion.setText("Fraccion");
        cmdFraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFraccionActionPerformed(evt);
            }
        });
        jPanel1.add(cmdFraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
           txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtNumerador1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
int op,n1,n2,d1,d2;
        Fraccionario f1,f2,f3=null;
        
        op = cmbOperacion.getSelectedIndex();
        n1 = Integer.parseInt(txtNumerador1.getText());
        d1 = Integer.parseInt(txtDenominador1.getText());
        n2 = Integer.parseInt(txtNumerador2.getText());
        d2 = Integer.parseInt(txtDenominador2.getText());
        try{
        f1 = new Fraccionario(n1,d1);
        f2 = new Fraccionario(n2,d2);
        
        switch(op){
            case 0:
                f3= f1.sumar(f2);
                break;
            case 1:
            f3= f1.restar(f2);
            break;
            case 2:
            f3 = f1.multiplicar(f2);
             break;
            case 3:
             f3 = f1.dividir(f2);
             break;
                    
                
        }
        txtNumerador3.setText(""+f3.getNumerador());
            txtDenominador3.setText(""+f3.getDenominador());
        }catch(DenominadorCeroException e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdFraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFraccionActionPerformed
          int aux,aux2,num, den,ent;
        aux2= Integer.parseInt(txtNumerador3.getText());
        aux = Integer.parseInt(txtDenominador3.getText());
        ent = aux / aux;
        num = aux % aux;
        den = aux;
        txtEntero.setText("" + ent);
        txtNumerador3.setText("" + num);
        txtDenominador3.setText("" + den);    
    }//GEN-LAST:event_cmdFraccionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdFraccion;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    // End of variables declaration//GEN-END:variables
}
