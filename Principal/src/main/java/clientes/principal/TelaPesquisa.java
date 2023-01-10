package clientes.principal;

import java.awt.Component;
import java.awt.Window;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class TelaPesquisa extends javax.swing.JFrame {

    public TelaPesquisa() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePesquisa = new javax.swing.JInternalFrame();
        textoPesquisar = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResult = new javax.swing.JTable();
        botaoApagar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        framePesquisa.setMaximizable(true);
        framePesquisa.setTitle("GERENCIADOR DE CLIENTES - PESQUISA");
        framePesquisa.setMaximumSize(getMaximumSize());
        framePesquisa.setVisible(true);

        textoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        botaoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        tabelaResult.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        tabelaResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód", "Nome", "Cpf", "Data de Nascimento", "Telefone", "Endereço", "Cidade", "Estado", "Cep", "Rg", "Data Expedição", "Banco", "Agência", "Conta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaResult.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaResult.setRowHeight(30);
        jScrollPane1.setViewportView(tabelaResult);
        if (tabelaResult.getColumnModel().getColumnCount() > 0) {
            tabelaResult.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaResult.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaResult.getColumnModel().getColumn(1).setMinWidth(280);
            tabelaResult.getColumnModel().getColumn(1).setMaxWidth(280);
            tabelaResult.getColumnModel().getColumn(2).setMinWidth(200);
            tabelaResult.getColumnModel().getColumn(2).setMaxWidth(200);
            tabelaResult.getColumnModel().getColumn(3).setMinWidth(130);
            tabelaResult.getColumnModel().getColumn(3).setMaxWidth(130);
            tabelaResult.getColumnModel().getColumn(4).setMinWidth(150);
            tabelaResult.getColumnModel().getColumn(4).setMaxWidth(150);
            tabelaResult.getColumnModel().getColumn(5).setMinWidth(280);
            tabelaResult.getColumnModel().getColumn(5).setMaxWidth(280);
            tabelaResult.getColumnModel().getColumn(6).setMinWidth(150);
            tabelaResult.getColumnModel().getColumn(6).setMaxWidth(150);
            tabelaResult.getColumnModel().getColumn(7).setMinWidth(100);
            tabelaResult.getColumnModel().getColumn(7).setMaxWidth(100);
            tabelaResult.getColumnModel().getColumn(8).setMinWidth(100);
            tabelaResult.getColumnModel().getColumn(8).setMaxWidth(100);
            tabelaResult.getColumnModel().getColumn(9).setMinWidth(140);
            tabelaResult.getColumnModel().getColumn(9).setMaxWidth(140);
            tabelaResult.getColumnModel().getColumn(10).setMinWidth(130);
            tabelaResult.getColumnModel().getColumn(10).setMaxWidth(130);
            tabelaResult.getColumnModel().getColumn(11).setMinWidth(150);
            tabelaResult.getColumnModel().getColumn(11).setMaxWidth(150);
            tabelaResult.getColumnModel().getColumn(12).setMinWidth(100);
            tabelaResult.getColumnModel().getColumn(12).setMaxWidth(100);
            tabelaResult.getColumnModel().getColumn(13).setMinWidth(100);
            tabelaResult.getColumnModel().getColumn(13).setMaxWidth(100);
        }

        javax.swing.GroupLayout framePesquisaLayout = new javax.swing.GroupLayout(framePesquisa.getContentPane());
        framePesquisa.getContentPane().setLayout(framePesquisaLayout);
        framePesquisaLayout.setHorizontalGroup(
            framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(framePesquisaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        framePesquisaLayout.setVerticalGroup(
            framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(framePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        botaoApagar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoApagar.setText("Apagar");
        botaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addComponent(framePesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(framePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        try {
            framePesquisa.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
       //PESQUISA REGISTROS
        DefaultTableModel model = ((DefaultTableModel) tabelaResult.getModel());
        model.setNumRows(0);
        DataBase dataBase=new DataBase();
        dataBase.conectarBanco();
        JTextField textoPesquisa= this.textoPesquisar; //REGISTRO À PESQUISAR
        //FORMAÇÃO DA QUERY PESQUISA
        String query=" SELECT CÓDIGO, NOME, CPF,`DATA_NASC`, "
                    + " TELEFONE, ENDEREÇO, CIDADE, `ESTADO`,CEP, `RG`,"
                    + " `DATA_EXP`, BANCO , AGÊNCIA , `CONTA`"
                    +"FROM CLIENTES WHERE NOME LIKE '"+textoPesquisa.getText()+"%' ORDER BY CÓDIGO;";
        try {
            SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy"); 
            Statement stmt=dataBase.stm();
            ResultSet result=stmt.executeQuery(query);
            result.last();
            int qtdRegistros=result.getRow();//SELECIONA QUANTIDADE DE REGISTROS DA PESQUISA
            result.setFetchSize(qtdRegistros);
            if(result.first()==false){
                JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum resultado");
                return;
            }
            for(int i=0; i<=result.getFetchSize();i++) {
                //POPULA A TABELA COM O RESULTADO DA PESQUISA
                model.addRow(new Object[]{});
                tabelaResult.setValueAt(result.getInt("Código"),i,0);
                tabelaResult.setValueAt(result.getString("Nome"),i,1);
                tabelaResult.setValueAt(result.getString("CPF"),i,2);
                if(result.getString("Data_Nasc")==null){
                    tabelaResult.setValueAt("<vazio>",i,3);
                } 
                else{
                    tabelaResult.setValueAt(dtFormat.format(result.getDate("Data_Nasc")),i,3);
                }
                tabelaResult.setValueAt(result.getString("Telefone"),i,4);
                tabelaResult.setValueAt(result.getString("Endereço"),i,5);
                tabelaResult.setValueAt(result.getString("Cidade"),i,6);
                tabelaResult.setValueAt(result.getString("Estado"),i,7);
                tabelaResult.setValueAt(result.getString("Cep"),i,8);
                tabelaResult.setValueAt(result.getString("Rg"),i,9);
                if(result.getString("Data_Exp")==null){
                    tabelaResult.setValueAt("<vazio>",i,10);
                } 
                else{
                    tabelaResult.setValueAt(dtFormat.format(result.getDate("Data_Exp")),i,10);
                }
                tabelaResult.setValueAt(result.getString("Banco"),i,11);
                tabelaResult.setValueAt(result.getString("Agência"),i,12);
                tabelaResult.setValueAt(result.getString("Conta"),i,13);
                if(result.isLast()){
                    break;
                }
                else{
                    result.next();
               }
            }
            result.close();
            stmt.close();
            dataBase.desconectarBanco();
        }
        catch (SQLException ex) {
            Logger.getLogger(TelaPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_botaoPesquisarActionPerformed
    public int linhaSelecionada (){
        //CAPTURA NÚMERO DA LINHA SELECIONADA NA TABELA DE RESULTADOS
       
        int rowSelected=tabelaResult.getSelectedRow();
        int idCliente= Integer.parseInt(String.valueOf(tabelaResult.getValueAt(rowSelected,0)));
        return idCliente;  
         
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //BOTAO EDITAR
        SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        
        try {
                     
            
            int idCliente=linhaSelecionada();
            TelaCadCliente telaCad=new TelaCadCliente();
            telaCad.setVisible(true);
            DataBase dataBase= new DataBase();
            dataBase.conectarBanco();
            //SELECIONA OS DADOS E PRENCHE OS CAMPOS
            String query="SELECT * FROM CLIENTES WHERE CÓDIGO='"+idCliente+"';";
            Statement stmt=dataBase.stm();
            ResultSet result=stmt.executeQuery(query);
            result.first();
            telaCad.getTxtCod().setText(result.getString("Código"));
            telaCad.getTxtNome().setText(String.valueOf(result.getString("Nome")));
            telaCad.getTxtCpf().setText(String.valueOf(result.getString("Cpf")));
            telaCad.getTxtRg().setText(String.valueOf(result.getString("Rg")));
            telaCad.getTxtDtExp().setText(String.valueOf(dtFormat.format(result.getDate("Data_Exp"))));
            telaCad.getTxtTelefone().setText(result.getString(("Telefone")));
            telaCad.getTxtDataNasc().setText(String.valueOf(dtFormat.format(result.getDate("Data_Nasc"))));
            telaCad.getTxtBanco().setText(String.valueOf(result.getString("Banco")));
            telaCad.getTxtAgencia().setText(String.valueOf(result.getString("Agência")));
            telaCad.getTxtConta().setText(String.valueOf(result.getString("Conta")));
            telaCad.getTxtEndereco().setText(String.valueOf(result.getString("Endereço")));
            telaCad.getTxtCidade().setText(String.valueOf(result.getString("Cidade")));
            telaCad.getTxtCep().setText(String.valueOf(result.getString("Cep")));
            telaCad.getComboEstado().setSelectedItem(result.getString("Estado"));
            dataBase.desconectarBanco();
            result.close();
            stmt.close();
            
        }
        catch (SQLException ex) {
            Logger.getLogger(TelaPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarActionPerformed
        //APAGAR O REGISTRO SELECIONADO
        
        String nomeExluir= tabelaResult.getValueAt(tabelaResult.getSelectedRow(),1).toString();
        JOptionPane.showMessageDialog(null, "Confirma a exclusão de: "+nomeExluir+" ?");
        
        if(JOptionPane.PLAIN_MESSAGE!=0){
        try {
            DataBase dataBase= new DataBase();
            dataBase.conectarBanco();
            Statement stmt=dataBase.stm();
            String queryDelete=" DELETE FROM CLIENTES WHERE CÓDIGO= "+linhaSelecionada()+";";
            int delete =stmt.executeUpdate(queryDelete);
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaPesquisa.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        }
        botaoPesquisarActionPerformed(evt);
        
        
        
        
    }//GEN-LAST:event_botaoApagarActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPesquisa telaPesquisa=new TelaPesquisa();
                telaPesquisa.setVisible(true);
            }
        });    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoApagar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JInternalFrame framePesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaResult;
    private javax.swing.JTextField textoPesquisar;
    // End of variables declaration//GEN-END:variables
}
