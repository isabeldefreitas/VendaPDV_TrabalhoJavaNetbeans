/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vendapdv;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author isabe
 */
public class JCadastroProduto extends javax.swing.JDialog {

    static boolean executar(JOperacaoCadastro jOperacaoCadastro, Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    /**
     * Creates new form JCadastroProduto
     */
    public JCadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        edQuantidadeprod = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        buOKprod = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        edPrecoprod = new java.awt.TextField();
        buCancelarprod = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edNomeprod = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        edQuantidadeprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edQuantidadeprodActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        buOKprod.setText("OK");
        buOKprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buOKprodActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade");

        edPrecoprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPrecoprodActionPerformed(evt);
            }
        });

        buCancelarprod.setText("Cancelar");
        buCancelarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCancelarprodActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        edNomeprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNomeprodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(buOKprod)
                        .addGap(18, 18, 18)
                        .addComponent(buCancelarprod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edQuantidadeprod, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edPrecoprod, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edNomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(edNomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(edPrecoprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edQuantidadeprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buOKprod)
                    .addComponent(buCancelarprod))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edQuantidadeprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edQuantidadeprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edQuantidadeprodActionPerformed

    private void buOKprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buOKprodActionPerformed
   // Obtém os dados do formulário
String nome = edNomeprod.getText();
String precoStr = edPrecoprod.getText();
String quantidadeStr = edQuantidadeprod.getText();

try {
    // Converte strings em números
    double preco = Double.parseDouble(precoStr);
    int quantidade = Integer.parseInt(quantidadeStr);

    // Crie uma instância de Produto e atualize seus atributos
    Produto produto = new Produto();
    produto.atualizarNomeProduto(nome);
    produto.atualizarPreco(preco);
    produto.atualizarQuantidadeEstoque(quantidade);

        // Certifique-se de ter uma conexão válida com o banco de dados
    Connection connection = DatabaseConnection.obterConexao();

    if (connection != null) {
        // Chame um método de salvar em sua classe Produto
        produto.salvar(connection);
        // Feche a conexão com o banco de dados após o uso
        connection.close();
        System.out.println("Produto salvo com sucesso!");
    } else {
        System.err.println("Falha ao obter conexão com o banco de dados.");
    }

    // Limpe os campos de entrada após salvar
        edNomeprod.setText("");
        edPrecoprod.setText("");
        edQuantidadeprod.setText("");
    } catch (NumberFormatException e) {
        System.err.println("Erro ao converter preço ou quantidade para números.");
    } catch (SQLException e) {
        System.err.println("Erro ao salvar dados do produto: " + e.getMessage());
    }
     dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_buOKprodActionPerformed

    private void edPrecoprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPrecoprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edPrecoprodActionPerformed

    private void buCancelarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCancelarprodActionPerformed
        dispose();
    }//GEN-LAST:event_buCancelarprodActionPerformed

    private void edNomeprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNomeprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNomeprodActionPerformed

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
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JCadastroProduto dialog = new JCadastroProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buCancelarprod;
    private javax.swing.JButton buOKprod;
    private java.awt.TextField edNomeprod;
    private java.awt.TextField edPrecoprod;
    private java.awt.TextField edQuantidadeprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
