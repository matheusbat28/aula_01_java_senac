/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import entidade.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus.batista1
 */
public class CadrastroAluno extends javax.swing.JFrame {

    /**
     * Creates new form CadrastroAluno
     */
    public CadrastroAluno() {
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

        principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        idade = new javax.swing.JLabel();
        varIdade = new javax.swing.JTextField();
        telefone = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        varTelefone = new javax.swing.JFormattedTextField();
        salario = new javax.swing.JLabel();
        logradouro = new javax.swing.JLabel();
        varlogradouro = new javax.swing.JTextField();
        varSalario = new javax.swing.JFormattedTextField();
        numero = new javax.swing.JLabel();
        varNumero = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        varBairro = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        varCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cadrastro cliente ");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("cadatro cliente");

        nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nome.setText("Nome:");

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        idade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idade.setText("Idade:");

        varIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varIdadeActionPerformed(evt);
            }
        });

        telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefone.setText("Telefone:");

        varNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNomeActionPerformed(evt);
            }
        });

        try {
            varTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        varTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTelefoneActionPerformed(evt);
            }
        });

        salario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salario.setText("Salario:");

        logradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logradouro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logradouro.setText("Logradouro:");

        varlogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varlogradouroActionPerformed(evt);
            }
        });

        varSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        numero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numero.setText("Numero:");

        varNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNumeroActionPerformed(evt);
            }
        });

        bairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bairro.setText("Bairro:");

        cpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cpf.setText("Cpf:");

        try {
            varCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(principalLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(principalLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varlogradouro))
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(principalLayout.createSequentialGroup()
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(varBairro)))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idade)
                    .addComponent(varIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouro)
                    .addComponent(varlogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero)
                    .addComponent(varNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro)
                    .addComponent(varBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(varCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Aluno aluno = new Aluno();

        if (validarAluno()) {
            JOptionPane.showMessageDialog(null, "carrgado no sistema");
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private boolean validarAluno() {
        if (!validaStr(varNome.getText())) {
            JOptionPane.showMessageDialog(null, "digite um nome correto!");
            return false;
        }

        if (!validaIdade()) {
            JOptionPane.showMessageDialog(null, "digite uma idade correta!");
            return false;
        }
        if (!validaTelefone()) {
            JOptionPane.showMessageDialog(null, "digite um telefone correto!");
            return false;

        }
        if (validaSalario()) {
            JOptionPane.showMessageDialog(null, "digite um salario correto!");
            return false;
        }

        if (!validaStr(varlogradouro.getText())) {
            JOptionPane.showMessageDialog(null, "digite um logradouro correto!");
            return false;
        }
        if (!validarNumero()) {
            JOptionPane.showMessageDialog(null, "digite um número correto!");
            return false;

        }
        if (!validaStr(varBairro.getText())) {
            JOptionPane.showMessageDialog(null, "digite um bairro correto!");
            return false;

        }
        if (!validarCpf()) {
            JOptionPane.showMessageDialog(null, "digite um Cpf correto!");
            return false;
        }
        return true;

    }

    private boolean validaStr(String texto) {
        return texto.trim().length() >= 3;

    }

    private boolean validaIdade() {
        if (varIdade.getText().trim().equals("")) {
            return true;
        } else {
            int valorIdade = Integer.parseInt(varIdade.getText().trim());
            return valorIdade <= 16 || valorIdade > 100;
        }
    }

    private boolean validaTelefone() {
        return varTelefone.getText().trim().length() == 14;
    }

    private boolean validaSalario() {
        return "0,00".equals(varSalario.getText().trim()) || varSalario.getText().trim().length() == 0;
    }

    private boolean validarCpf() {
        return varCpf.getText().trim().length() == 14;
    }

    private boolean validarNumero(){
        return varNumero.getText().trim().length() > 0 || "0".equals(varNumero.getText().trim());
    }
            
    private void varIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varIdadeActionPerformed

    private void varNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNomeActionPerformed

    private void varTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTelefoneActionPerformed

    private void varlogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varlogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varlogradouroActionPerformed

    private void varNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNumeroActionPerformed

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
            java.util.logging.Logger.getLogger(CadrastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadrastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadrastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadrastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadrastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel idade;
    private javax.swing.JLabel logradouro;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel salario;
    private javax.swing.JLabel telefone;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField varBairro;
    private javax.swing.JFormattedTextField varCpf;
    private javax.swing.JTextField varIdade;
    private javax.swing.JTextField varNome;
    private javax.swing.JTextField varNumero;
    private javax.swing.JFormattedTextField varSalario;
    private javax.swing.JFormattedTextField varTelefone;
    private javax.swing.JTextField varlogradouro;
    // End of variables declaration//GEN-END:variables
}
