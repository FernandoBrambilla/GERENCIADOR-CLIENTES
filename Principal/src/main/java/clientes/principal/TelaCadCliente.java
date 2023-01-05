package clientes.principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Window;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class TelaCadCliente extends javax.swing.JFrame {

    public TelaCadCliente() {
        initComponents();
      
     
    }
    //GETTERS E SETTERS

    public JComboBox<String> getComboEstado() {
        return comboEstado;
    }

    public void setComboEstado(JComboBox<String> comboEstado) {
        this.comboEstado = comboEstado;
    }

    public JTextField getTxtAgencia() {
        return txtAgencia;
    }

    public void setTxtAgencia(JTextField txtAgencia) {
        this.txtAgencia = txtAgencia;
    }

    public JTextField getTxtBanco() {
        return txtBanco;
    }

    public void setTxtBanco(JTextField txtBanco) {
        this.txtBanco = txtBanco;
    }

    public JFormattedTextField getTxtCep() {
        return txtCep;
    }

    public void setTxtCep(JFormattedTextField txtCep) {
        this.txtCep = txtCep;
    }

    public JTextField getTxtCidade() {
        return txtCidade;
    }

    public void setTxtCidade(JTextField txtCidade) {
        this.txtCidade = txtCidade;
    }

    public JTextField getTxtCod() {
        return txtCod;
    }

    public void setTxtCod(JTextField txtCod) {
        this.txtCod = txtCod;
    }

    public JTextField getTxtConta() {
        return txtConta;
    }

    public void setTxtConta(JTextField txtConta) {
        this.txtConta = txtConta;
    }

    public JFormattedTextField getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(JFormattedTextField txtCpf) {
        this.txtCpf = txtCpf;
    }

    public JFormattedTextField getTxtDataNasc() {
        return txtDataNasc;
    }

    public void setTxtDataNasc(JFormattedTextField txtDataNasc) {
        this.txtDataNasc = txtDataNasc;
    }

    public JFormattedTextField getTxtDtExp() {
        return txtDtExp;
    }

    public void setTxtDtExp(JFormattedTextField txtDtExp) {
        this.txtDtExp = txtDtExp;
    }

    public JTextField getTxtEndereco() {
        return txtEndereco;
    }

    public void setTxtEndereco(JTextField txtEndereco) {
        this.txtEndereco = txtEndereco;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtRg() {
        return txtRg;
    }

    public void setTxtRg(JTextField txtRg) {
        this.txtRg = txtRg;
    }

    public JFormattedTextField getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(JFormattedTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtConta = new javax.swing.JTextField();
        txtDtExp = new javax.swing.JFormattedTextField();
        botaoSair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        botaoSalvar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setText("Código:");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome *");
        jLabel1.setFocusCycleRoot(true);

        txtNome.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CPF *");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fone");
        jLabel4.setFocusCycleRoot(true);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("RG *");

        txtRg.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Endereço *");
        jLabel6.setFocusCycleRoot(true);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Data de Nascimento *");
        jLabel7.setFocusCycleRoot(true);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Data de Expedição *");

        txtEndereco.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cidade *");
        jLabel9.setAutoscrolls(true);
        jLabel9.setFocusCycleRoot(true);

        txtCidade.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        labelEstado.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        labelEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEstado.setText("Estado *");

        comboEstado.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia ", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais ", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("CEP");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Banco");
        jLabel12.setFocusCycleRoot(true);

        txtBanco.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Agência");
        jLabel13.setFocusCycleRoot(true);

        txtAgencia.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Conta");

        txtConta.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        try {
            txtDtExp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtExp.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        botaoSair.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        txtCod.setEditable(false);
        txtCod.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtCod.setForeground(new java.awt.Color(102, 102, 102));
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setBorder(null);
        txtCod.setCaretColor(javax.swing.UIManager.getDefaults().getColor("Button.disabledBackground"));
        txtCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCod.setDisabledTextColor(new java.awt.Color(255, 51, 153));
        txtCod.setDragEnabled(true);
        txtCod.setFocusable(false);

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNasc.setToolTipText("");
        txtDataNasc.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConta, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(labelEstado)
                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        txtRg.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

  public int ultimoCod() throws SQLException{
      
        //CAPTURA O ÚLTIMO CÓDIGO DA TABELA NO BANCO DE DADOS
        DataBase dataBase= new DataBase();
        dataBase.conectarBanco();
        Statement stmt= dataBase.stm();
        String query="SELECT CÓDIGO FROM CLIENTES ORDER BY CÓDIGO DESC LIMIT 1";
        ResultSet result=stmt.executeQuery(query);
        result.first();
        int ultimoID= result.getInt("CÓDIGO");
        return ultimoID;
    }
  
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        //BOTÃO SALVAR
         
        try {
            //CAPTURA OS DADOS DOS CAMPOS
            int cod= Integer.parseInt(this.getTxtCod().getText());
            String nome=this.getTxtNome().getText();
            String rg=this.getTxtRg().getText();
            String cpf=this.getTxtCpf().getText();
            String telefone=this.getTxtTelefone().getText();
            String endereco=this.getTxtEndereco().getText();
            String cidade=this.getTxtCidade().getText();
            String cep=this.getTxtCep().getText();
            String estado=this.getComboEstado().getSelectedItem().toString();
            String banco=this.getTxtBanco().getText();
            String agencia=this.getTxtAgencia().getText();
            String conta=this.getTxtConta().getText();
            
            
            //VERIFICA CAMPOS OBRIGATÓRIOS
            int verfExp=this.getTxtDtExp().getText().indexOf(" ");
            if(verfExp >= 0){
                JOptionPane.showMessageDialog(null, "* DATA DE EXPEDIÇÃO OBRIGATÓRIO");
                return;
            }
            int verifNasc= this.getTxtDataNasc().getText().indexOf(" ");
            if(verifNasc >= 0){
                JOptionPane.showMessageDialog(null, "* DATA DE NASCIMENTO OBRIGATÓRIO");
                return;
            }
            if(this.getTxtNome().getText().isEmpty()||
                this.getTxtRg().getText().isEmpty() ||
                this.getTxtCpf().getText().isEmpty() ||
                this.getTxtEndereco().getText().isEmpty() ||
                this.getTxtCidade().getText().isEmpty() ||
                this.getComboEstado().getSelectedItem()==null) {
                JOptionPane.showMessageDialog(null, "* CAMPOS OBRIGATÓRIOS");
                return;
             }
           
            //CONVERTE DATA PARA EXIBIÇÃO PADRÃO DD/MM/AAAA
            DateTimeFormatter dtFormatBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataExp = LocalDate.parse(this.getTxtDtExp().getText());
            LocalDate dataNasc = LocalDate.parse(this.getTxtDataNasc().getText());
            String dataExpedicao= dtFormatBr.format(dataExp);
            String dataNascimento=dtFormatBr.format(dataNasc);
           
                      
            //VERIFICA DATA DE EXPEDIÇÃO
            int diaExp= Integer.parseInt(dataExpedicao.substring(0,2));
            int mesExp=Integer.parseInt(dataExpedicao.substring(3,5));
            LocalDate dataAtual= LocalDate.now();
            if(dataExp.isAfter(dataAtual)){
                JOptionPane.showMessageDialog(null,"Data de Expedição não pode ser maior do que"
                + " "+dataAtual.format(dtFormatBr));
                return;
            }
            int verifExp=dataExpedicao.indexOf(" ");
             if( diaExp>31 || mesExp>12 ) {
                JOptionPane.showMessageDialog(null, "Data de Expedição Inválida");
                return;
            }
            
            //VERIFICA DATA DE NASCIMENTO
            int diaNasc= Integer.parseInt(dataNascimento.substring(0,2));
            int mesNasc=Integer.parseInt(dataNascimento.substring(3,5));
            if(dataNasc.isAfter(dataAtual)){
                JOptionPane.showMessageDialog(null,"Data de Nascimento não pode ser maior do que"
                + " "+dataAtual.format(dtFormatBr));
                return;
            }
            
             if(diaNasc>31 || mesNasc>12 ) {
                JOptionPane.showMessageDialog(null, "Data de Nascimento Inválida");
                return;
            }
             
              //FORMATA DATAS PARA O PADRÃO DO BANCO DE DADO
            DateTimeFormatter dtFormatUs = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String dataNascFormated = dtFormatUs.format(dataNasc);
            String dataExpFormated=dtFormatBr.format(dataExp);
           
             
           
            
            //COMANDOS PARA INSERIR NOVOS DADOS
            if(cod>ultimoCod()){ 
                try{
                DataBase dataBase= new DataBase();
                dataBase.conectarBanco();
                Statement stm=dataBase.stm();
                int codigo1=cod+1;
                
                //FORMAÇÃO DA QUERY INSERT
                String queryInsert= " INSERT INTO CLIENTES "
                    + "(CÓDIGO, NOME, RG, `DATA_EXP`, CPF, `DATA_NASC`, TELEFONE,"
                    + " ENDEREÇO, CIDADE, CEP, ESTADO, BANCO, AGÊNCIA, CONTA) VALUES "
                    + "('"+codigo1+"', "
                    + " '"+nome+"', "
                    + " '"+rg+"', "
                    + " '"+dataExpFormated+"', "
                    + " '"+cpf+"', "
                    + " '"+dataNascFormated+"', "
                    + " '"+telefone+"', "
                    + " '"+endereco+"', "
                    + " '"+cidade+"', "
                    + " '"+cep+"', "
                    + " '"+estado+"', "
                    + " '"+banco+"', "
                    + " '"+agencia+"', "
                    + " '"+conta+"');";
                    int insert=stm.executeUpdate(queryInsert);
                    
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                }   
                catch (SQLException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                
                //COMANDOS PARA ATUALIZAR DADOS
                try{
                    DataBase dataBase= new DataBase();
                    dataBase.conectarBanco();
                    Statement stm=dataBase.stm();
                 
                    //FORMAÇÃO DA QUERY DE UPDATE
                    String idCliente= this.getTxtCod().getText();
                    String queyUpdate=("UPDATE CLIENTES SET "
                        + " NOME= '" +nome+ "',"
                        + " CIDADE= '"+cidade+"', "
                        + " RG= '"+rg+"', "
                        + " `DATA_NASC`= '"+dataNascFormated+"', "
                        + " `DATA_EXP`= '"+dataExpFormated+"' ,"
                        + " CPF= '"+cpf+"', "
                        + " TELEFONE= '"+telefone+"', "
                        + " ENDEREÇO= '"+endereco+"', "
                        + " CEP= '"+cep+"', "
                        + " ESTADO= '"+estado+"', "
                        + " BANCO= '"+banco+"', "
                        + " `AGÊNCIA`= '"+agencia+"', "
                        + " CONTA= '"+conta+"' "
                        + " WHERE CÓDIGO= "+idCliente+";");
                        int edit=stm.executeUpdate(queyUpdate);
                        
                        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                }
                catch (SQLException ex) {
                    Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(TelaCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtConta;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JFormattedTextField txtDtExp;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
