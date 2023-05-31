/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jar.infinity.solutions;

import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.teste.TesteApi;
import com.mycompany.exemplobanco.ConexaoMysql;
import com.mycompany.exemplobanco.VerificacaoCredenciais;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.util.Scanner;
import javax.swing.JLabel;
import log.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author vgfagundes
 */
public class TelaDeLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeLogin
     */
    public TelaDeLogin() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtLoginUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        lblInfinityMonitor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotem = new javax.swing.JTextField();
        txtLabelVerificacao = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jToolBar1.setRollover(true);

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel8.setText("Infinity Monitor");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel9.setText("Infinity Monitor");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 10));

        txtLoginUsuario.setText("Login");
        txtLoginUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoginUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginUsuarioFocusLost(evt);
            }
        });
        txtLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUsuarioActionPerformed(evt);
            }
        });

        txtSenhaUsuario.setText("Senha");
        txtSenhaUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaUsuarioFocusLost(evt);
            }
        });
        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 8)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/copyright-symbol.png"))); // NOI18N
        jLabel7.setText("Copyrigth Infinity Solutions");

        btnEntrar.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblInfinityMonitor.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblInfinityMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Monitoring_Solution__500___250_px_-removebg-preview_resized.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel11.setText("Infinity Monitor");

        txtTotem.setText("Numero De Identificação Do Totem");
        txtTotem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotemFocusLost(evt);
            }
        });
        txtTotem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblInfinityMonitor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLabelVerificacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTotem, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblInfinityMonitor)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtTotem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtLabelVerificacao)
                .addGap(10, 10, 10)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getTxtLabelVerificacao() {
        return txtLabelVerificacao;
    }

    public void setTxtLabelVerificacao(JLabel txtLabelVerificacao) {
        this.txtLabelVerificacao = txtLabelVerificacao;
    }

    public String getTxtLoginUsuario() {
        return txtLoginUsuario.getText();
    }

    public void setTxtLoginUsuario(javax.swing.JTextField txtLoginUsuario) {
        this.txtLoginUsuario = txtLoginUsuario;
    }

    public String getTxtSenhaUsuario() {
        return txtSenhaUsuario.getText();
    }

    public void setTxtSenhaUsuario(javax.swing.JTextField txtSenhaUsuario) {
        this.txtSenhaUsuario = txtSenhaUsuario;
    }

    private void txtLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUsuarioActionPerformed

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        String login = txtLoginUsuario.getText();
        String senha = txtSenhaUsuario.getText();
        String numeroDeIdentificacaoDoTotem = txtTotem.getText();
        ConexaoMysql conexaoLocal = new ConexaoMysql();

        VerificacaoCredenciais verCredencial = new VerificacaoCredenciais();

        Boolean validCredencial = verCredencial.verCre(login, senha, numeroDeIdentificacaoDoTotem);

        Boolean validTotem = verCredencial.verCreTotem(numeroDeIdentificacaoDoTotem, login);
        txtLabelVerificacao.setText("Autentificando Aguarde");

        if (validCredencial) {
            System.out.println("Iniciando dados");
            txtLabelVerificacao.setText("Usuario autenticado aguarde");
            txtLabelVerificacao.setForeground(Color.green);
            if (validTotem) {
                TesteApi.main(login, senha, numeroDeIdentificacaoDoTotem);
                Logado logado = new Logado(login, numeroDeIdentificacaoDoTotem);
                Logger log = new Logger();
                log.main(login, senha , numeroDeIdentificacaoDoTotem);
                logado.main(login, numeroDeIdentificacaoDoTotem);
            } else {
                txtLabelVerificacao.setText("Totem informado invalido, informe um Totem valido");
                txtLabelVerificacao.setForeground(Color.red);
            }
        } else {
            System.out.println("Erro de autenticação!");
            txtLabelVerificacao.setText("CNPJ ou Senha invalidos");
            txtLabelVerificacao.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtTotemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotemActionPerformed

    private void txtTotemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotemFocusGained
        // TODO add your handling code here:
        if (txtTotem.getText().equals("Numero De Identificação Do Totem")) {
            txtTotem.setText("");
        }
    }//GEN-LAST:event_txtTotemFocusGained

    private void txtLoginUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginUsuarioFocusGained
        // TODO add your handling code here:
        if (txtLoginUsuario.getText().equals("Login")) {
            txtLoginUsuario.setText("");
        }
    }//GEN-LAST:event_txtLoginUsuarioFocusGained

    private void txtLoginUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginUsuarioFocusLost
        // TODO add your handling code here:
        if (txtLoginUsuario.getText().isEmpty()) {
            txtLoginUsuario.setText("Login");
        }
    }//GEN-LAST:event_txtLoginUsuarioFocusLost

    private void txtSenhaUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioFocusGained
        // TODO add your handling code here:
        if (txtSenhaUsuario.getText().equals("Senha")) {
            txtSenhaUsuario.setText("");
        }
    }//GEN-LAST:event_txtSenhaUsuarioFocusGained

    private void txtSenhaUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioFocusLost
        // TODO add your handling code here:
        if (txtSenhaUsuario.getText().isEmpty()) {
            txtSenhaUsuario.setText("Senha");
        }
    }//GEN-LAST:event_txtSenhaUsuarioFocusLost

    private void txtTotemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotemFocusLost
        // TODO add your handling code here:
        if (txtTotem.getText().isEmpty()) {
            txtTotem.setText("Numero De Identificação Do Totem");
        }
    }//GEN-LAST:event_txtTotemFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (GraphicsEnvironment.isHeadless()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe seu CNPJ");
            String login = scanner.nextLine();

            System.out.println("Informe sua senha");
            String senha = scanner.nextLine();
            
            System.out.println("Informe o numero de Identificacao do totem");
            String numeroDeIdentificacaoDoTotem = scanner.nextLine(); // Preencha com o valor adequado

            ConexaoMysql conexaoLocal = new ConexaoMysql();
            VerificacaoCredenciais verCredencial = new VerificacaoCredenciais();
            Boolean validCredencial = verCredencial.verCre(login, senha, numeroDeIdentificacaoDoTotem);
            Boolean validTotem = verCredencial.verCreTotem(numeroDeIdentificacaoDoTotem, login);

            System.out.println("Autenticando. Aguarde...");

            if (validCredencial) {
                System.out.println("Iniciando dados");
                System.out.println("Usuário autenticado. Aguarde...");
                if (validTotem) {
                    TesteApi.main(login, senha, numeroDeIdentificacaoDoTotem);
                    Logado logado = new Logado(login, numeroDeIdentificacaoDoTotem);
                    Logger log = new Logger();
                    log.main(login, senha, numeroDeIdentificacaoDoTotem);
                    logado.main(login, numeroDeIdentificacaoDoTotem);
                } else {
                    System.out.println("Totem informado inválido. Informe um Totem válido.");
                }
            } else {
                System.out.println("Erro de autenticação!");
                System.out.println("CNPJ ou Senha inválidos.");
            }
        } 
        else {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new TelaDeLogin().setVisible(true);
                }
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblInfinityMonitor;
    private javax.swing.JLabel txtLabelVerificacao;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JTextField txtTotem;
    // End of variables declaration//GEN-END:variables
}