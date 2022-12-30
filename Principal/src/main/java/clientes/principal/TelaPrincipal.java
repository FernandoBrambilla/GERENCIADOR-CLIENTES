/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clientes.principal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.IconUIResource;



public class TelaPrincipal extends javax.swing.JFrame {

    public JButton getBotaoNovoCli() {
        return botaoNovoCli;
    }

    public void setBotaoNovoCli(JButton botaoNovoCli) {
        this.botaoNovoCli = botaoNovoCli;
    }

    public JButton getBotaoPesquisar() {
        return botaoPesquisar;
    }

    public void setBotaoPesquisar(JButton botaoPesquisar) {
        this.botaoPesquisar = botaoPesquisar;
    }

    public JButton getBotaoSair() {
        return botaoSair;
    }

    public void setBotaoSair(JButton botaoSair) {
        this.botaoSair = botaoSair;
    }

   

    
    public TelaPrincipal() throws SQLException {
        initComponents();
        DataBase dataBase=new DataBase();
        dataBase.conectarBanco();
        String statusDb=dataBase.Status();
        SimpleDateFormat dtFotmat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        String dataAtual=dtFotmat.format(calendar.getTime());
        int anoAtual = LocalDate.now().getYear();
      
              
        this.statusDB.setText(statusDb+"      " +dataAtual+"  "
                + "    "+" GERENCIADOR DE CLIENTES v 1.0            "+anoAtual+"    @BRAMBILLA INFORMÁTICA");
        
       
        
               }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FramePesquisa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoPesquisar = new javax.swing.JButton();
        botaoNovoCli = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        statusDB = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Bem vindo ao Gerenciador de Clientes");

        botaoPesquisar.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPesquisarMouseClicked(evt);
            }
        });

        botaoNovoCli.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        botaoNovoCli.setText("Novo Cliente");
        botaoNovoCli.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoNovoCli.setPreferredSize(new java.awt.Dimension(100, 100));
        botaoNovoCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoNovoCliMouseClicked(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        statusDB.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        statusDB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout FramePesquisaLayout = new javax.swing.GroupLayout(FramePesquisa);
        FramePesquisa.setLayout(FramePesquisaLayout);
        FramePesquisaLayout.setHorizontalGroup(
            FramePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FramePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(FramePesquisaLayout.createSequentialGroup()
                        .addGroup(FramePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FramePesquisaLayout.createSequentialGroup()
                                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(FramePesquisaLayout.createSequentialGroup()
                        .addGroup(FramePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FramePesquisaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botaoNovoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        FramePesquisaLayout.setVerticalGroup(
            FramePesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePesquisaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoNovoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusDB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FramePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FramePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarMouseClicked
              
          TelaPesquisa telaPesquisa = new TelaPesquisa();
         telaPesquisa.setVisible(true);
         telaPesquisa.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
         
    }//GEN-LAST:event_botaoPesquisarMouseClicked

 
    
    private void botaoNovoCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoNovoCliMouseClicked
        TelaCadCliente telaCad=new TelaCadCliente();
        telaCad. setVisible(true); 
        try {
            int codigo=telaCad.ultimoCod()+1;
            telaCad.getTxtCod().setText(Integer.toString(codigo));
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
       
    }//GEN-LAST:event_botaoNovoCliMouseClicked

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
       JOptionPane.showMessageDialog(null, "Tem certeza que deseja sair?");
        if(JOptionPane.PLAIN_MESSAGE!=0){
           System.exit(0);
           DataBase dtBase = new DataBase();
           dtBase.desconectarBanco();
        }
            
            
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed
   
  
    
    
    public static void main(String args[]) {
        
        DataBase dataBase = new DataBase();
        dataBase.conectarBanco();
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaPrincipal telaInicial= new TelaPrincipal();
                    telaInicial.setVisible(true);
                    
                    telaInicial.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FramePesquisa;
    private javax.swing.JButton botaoNovoCli;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel statusDB;
    // End of variables declaration//GEN-END:variables
}
