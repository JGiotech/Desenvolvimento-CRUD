/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.ecommerce;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import static poo.ecommerce.ClienteADO.verifyClientes;

/**
 *
 * @author isack
 */
public class ReadClientes extends javax.swing.JFrame {

    /**
     * Creates new form ReadClientes
     */
    public ReadClientes() {
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

        jLabel2 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblDataCadastro = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jlabeel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnOkRead = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setText("Pesquisar Cliente");

        lblTelefone.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblTelefone.setText("...");

        jLabel11.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel11.setText("Telefone:");

        jLabel13.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel13.setText("Email:");

        lblEmail.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblEmail.setText("...");

        jLabel14.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel14.setText("Data do cadastro:");

        lblDataCadastro.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblDataCadastro.setText("...");

        lblCPF.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblCPF.setText("...");

        jlabeel.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jlabeel.setText("CPF:");

        jLabel10.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel10.setText("Nome:");

        lblNome.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblNome.setText("...");

        txtID.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Busca por ID:");

        btnOkRead.setLabel("Ok");
        btnOkRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlabeel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(23, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addComponent(btnOkRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(lblNome))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlabeel)
                        .addComponent(lblCPF))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(lblDataCadastro))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblEmail))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lblTelefone))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkReadActionPerformed
        // TODO add your handling code here:
        int idCliente = Integer.parseInt(txtID.getText());
    
    // Verifica se o cliente existe
    if (verifyClientes(idCliente)) {
        String selectSql = "SELECT nome, email, telefone, cpf, data_cadastro FROM clientes WHERE idCliente = ?";
        
        try (Connection conexao = ConexaoBanco.obterConexao();
             PreparedStatement selectStmt = conexao.prepareStatement(selectSql)) {
             
            selectStmt.setInt(1, idCliente);
            ResultSet rs = selectStmt.executeQuery();
            
            if (rs.next()) {  // Verifica se há resultados
                // Exibe as informações do cliente
                lblNome.setText(rs.getString("nome"));
                lblEmail.setText(rs.getString("email"));
                lblCPF.setText(rs.getString("cpf"));
                lblTelefone.setText(rs.getString("telefone"));
                
                // Obtém e formata a data de cadastro
                Date dataCadastro = rs.getDate("data_cadastro");
                if (dataCadastro != null) {
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    lblDataCadastro.setText(formato.format(dataCadastro));
                } else {
                    lblDataCadastro.setText("");
                }
            } else {
                System.out.println("Cliente não encontrado.");
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o banco de dados: " + ex.getMessage());
        }
    } else {
        System.out.println("Cliente não encontrado.");
    }
    }//GEN-LAST:event_btnOkReadActionPerformed

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
            java.util.logging.Logger.getLogger(ReadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnOkRead;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlabeel;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}