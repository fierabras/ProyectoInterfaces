package fabricaVentanas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

public class VistaProveedor extends javax.swing.JFrame implements IVista {

    
    public VistaProveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        txbClaveProveedor = new javax.swing.JTextField();
        txbNombre = new javax.swing.JTextField();
        txbfolioId = new javax.swing.JTextField();
        comboTipoId = new javax.swing.JComboBox<>();
        botonGuardarCambio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setText("Clave");

        jLabel3.setText("Nombre");

        jLabel4.setText("TipoId");

        jLabel5.setText("Numero de Id");

        botonGuardar.setText("Guardar");
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarMouseClicked(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        txbClaveProveedor.setEditable(false);

        comboTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IFE", "LICENCIA", "PASAPORTE" }));

        botonGuardarCambio.setText("Guardar Cambio");
        botonGuardarCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarCambioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbfolioId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(botonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardarCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txbfolioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar)
                    .addComponent(botonGuardarCambio))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked

        ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "INSERT INTO PROVEEDORES (NOMBRE,TIPOID,FOLIOID) VALUES ('" + txbNombre.getText()
                + "','" + comboTipoId.getSelectedItem() + "','" + txbfolioId.getText() + "')";
        System.out.println(cmd);
        conn.insert(cmd);
        super.dispose();
    }//GEN-LAST:event_botonGuardarMouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        super.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonGuardarCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarCambioMouseClicked
        ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "UPDATE PROVEEDORES SET NOMBRE='" + txbNombre.getText() + "',TIPOID='"
                + comboTipoId.getSelectedItem() + "', FOLIOID='" + txbfolioId.getText()
                + "' WHERE CLAVEPROVEEDOR=" + txbClaveProveedor.getText();
        System.out.println(cmd);
        conn.update(cmd);
        super.dispose();
    }//GEN-LAST:event_botonGuardarCambioMouseClicked

    @Override
    public void iniciar() {
        VistaProveedor vistaProveedor = new VistaProveedor();
        vistaProveedor.setVisible(true);
        System.out.println("Ha iniciado la pantalla VistaProveedor");
        vistaProveedor.botonGuardarCambio.setVisible(false);
    }

    @Override
    public void modificar(IConsulta consultaProveedores, IVista vProveedor, int row) {
                
        VistaProveedor vistaProveedor = (VistaProveedor)vProveedor;    
        
        ConsultaProveedores consultaP = (ConsultaProveedores) consultaProveedores;
        
        if (consultaP.jTable1.getSelectedRow()<0){
            JFrame frame=null;
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un proveedor de la lista para modificarlo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);            
            vistaProveedor.dispose();
            return;            
        }
        
        vistaProveedor.setVisible(true);

        System.out.println("La linea Seleccionada es " + row);
        String claveProveedor = consultaP.jTable1.getValueAt(row, 0).toString();
        String nombre = consultaP.jTable1.getValueAt(row, 1).toString();
        String tipoId = consultaP.jTable1.getValueAt(row, 2).toString();
        String folioId = consultaP.jTable1.getValueAt(row, 3).toString();

        vistaProveedor.txbClaveProveedor.setText(claveProveedor);
        vistaProveedor.txbNombre.setText(nombre);
        vistaProveedor.comboTipoId.setSelectedItem(tipoId);
        vistaProveedor.txbfolioId.setText(folioId);
        vistaProveedor.botonGuardar.setVisible(false);
        
        
        consultaP.jTable1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonGuardarCambio;
    public javax.swing.JComboBox<String> comboTipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txbClaveProveedor;
    public javax.swing.JTextField txbNombre;
    public javax.swing.JTextField txbfolioId;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProveedor().setVisible(true);
            }
        });
    }
}
