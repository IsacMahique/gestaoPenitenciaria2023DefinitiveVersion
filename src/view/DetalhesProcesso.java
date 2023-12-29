/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Kito Mahique
 */
public class DetalhesProcesso extends javax.swing.JFrame {

    /**
     * Creates new form DetalhesProcesso
     */
    int nivel;
    
    public DetalhesProcesso(String nome, String bi, String naturalidade, String nacionalidade, 
            String residencia, String genero, String nascimento, String doente, String doenca,
            String cuidados, String antecedentes, String crimes, String data) {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.DARK_GRAY);
        jbImprimir.setBackground(Color.white);
        jbVoltar.setBackground(Color.white);
        
        jlNome.setText(nome);
        jlNacionalidade.setText(nacionalidade);
        jlDataDeNascimento.setText(nascimento);
        jlNumeroBi.setText(bi);
        jlNaturalidade.setText(naturalidade);
        jlResidencia.setText(residencia);
        jlGenero.setText(genero);
        jlDoenca.setText(doente);
        jlNomeDaDoenca.setText(doenca);
        jlCuidados.setText(cuidados);
        jlCrime.setText(antecedentes);
        jlCrimes.setText(crimes);
        jlDataImpressao.setText(data);
      
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbImprimir = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlNacionalidadesdsd = new javax.swing.JLabel();
        jlNacionalidade = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jlDataDeNascimento = new javax.swing.JLabel();
        jlBi = new javax.swing.JLabel();
        jlNaturalidadeafsd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlNumeroBi = new javax.swing.JLabel();
        jlNaturalidade = new javax.swing.JLabel();
        jlResidencia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlSofre = new javax.swing.JLabel();
        jlnomed = new javax.swing.JLabel();
        jlDoenca = new javax.swing.JLabel();
        jlNomeDaDoenca = new javax.swing.JLabel();
        jlcudados = new javax.swing.JLabel();
        jlCuidados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlCrime = new javax.swing.JLabel();
        jlCrimes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlDataImpressao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbImprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/473627_device_hardware_office_output_paper_icon.png"))); // NOI18N
        jbImprimir.setText("Imprimir");
        jbImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 2));
        jbImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbImprimirMouseEntered(evt);
            }
        });
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });

        jbVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2303135_arrow_back_left_refresh_renew_icon.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 2));
        jbVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbVoltarMouseEntered(evt);
            }
        });
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo:");

        jlNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNome.setForeground(new java.awt.Color(255, 255, 255));
        jlNome.setText("Nome");

        jlNacionalidadesdsd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNacionalidadesdsd.setForeground(new java.awt.Color(255, 255, 255));
        jlNacionalidadesdsd.setText("Nacionalidade:");

        jlNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jlNacionalidade.setText("Nacionalidade");

        jlData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("Data de Nascimento:");

        jlDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDataDeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jlDataDeNascimento.setText("Data de Nascimento");

        jlBi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBi.setForeground(new java.awt.Color(255, 255, 255));
        jlBi.setText("Numero de BI:");

        jlNaturalidadeafsd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNaturalidadeafsd.setForeground(new java.awt.Color(255, 255, 255));
        jlNaturalidadeafsd.setText("Naturalidade:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Local de Residencia:");

        jlNumeroBi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNumeroBi.setForeground(new java.awt.Color(255, 255, 255));
        jlNumeroBi.setText("Bi");

        jlNaturalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNaturalidade.setForeground(new java.awt.Color(255, 255, 255));
        jlNaturalidade.setText("Naturalidade");

        jlResidencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlResidencia.setForeground(new java.awt.Color(255, 255, 255));
        jlResidencia.setText("Residencia");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genero: ");

        jlGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlGenero.setForeground(new java.awt.Color(255, 255, 255));
        jlGenero.setText("Genero");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("***************************************************************************************************************************************************************************************************************");

        jlSofre.setBackground(new java.awt.Color(255, 255, 255));
        jlSofre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSofre.setForeground(new java.awt.Color(255, 255, 255));
        jlSofre.setText("Alguma doenca/deficiencia:");

        jlnomed.setBackground(new java.awt.Color(255, 255, 255));
        jlnomed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlnomed.setForeground(new java.awt.Color(255, 255, 255));
        jlnomed.setText("Nome da doenca:");

        jlDoenca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDoenca.setForeground(new java.awt.Color(255, 255, 255));
        jlDoenca.setText("Doenca");

        jlNomeDaDoenca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNomeDaDoenca.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeDaDoenca.setText("Nome Doenca");

        jlcudados.setBackground(new java.awt.Color(255, 255, 255));
        jlcudados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlcudados.setForeground(new java.awt.Color(255, 255, 255));
        jlcudados.setText("Cuidados Basicos:");

        jlCuidados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCuidados.setForeground(new java.awt.Color(255, 255, 255));
        jlCuidados.setText("Cuidados");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Possui Algum Registo Criminal:");

        jlCrime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCrime.setForeground(new java.awt.Color(255, 255, 255));
        jlCrime.setText("Registo Criminal");

        jlCrimes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCrimes.setForeground(new java.awt.Color(255, 255, 255));
        jlCrimes.setText("Nenhum");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("***************************************************************************************************************************************************************************************************************");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("data da impressao: ");

        jlDataImpressao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlDataImpressao.setForeground(new java.awt.Color(255, 255, 255));
        jlDataImpressao.setText("data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlNacionalidadesdsd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNome)
                    .addComponent(jlNacionalidade)
                    .addComponent(jlDataDeNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNaturalidadeafsd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlResidencia)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNumeroBi)
                            .addComponent(jlNaturalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jlGenero)
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSofre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlnomed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNomeDaDoenca)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlDoenca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                                .addComponent(jlcudados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jlCuidados))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(11, 11, 11)
                                .addComponent(jlDataImpressao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42)
                                .addComponent(jlCrime)
                                .addGap(218, 218, 218)
                                .addComponent(jlCrimes)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jlGenero))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlResidencia)
                                    .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDataDeNascimento)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlNumeroBi)
                                    .addComponent(jlBi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlNaturalidadeafsd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNaturalidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNome))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlNacionalidadesdsd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNacionalidade))))
                        .addGap(18, 58, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlcudados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCuidados))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlSofre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDoenca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlnomed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNomeDaDoenca))
                                .addGap(26, 26, 26)))
                        .addComponent(jLabel8)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jlCrime)
                            .addComponent(jlCrimes))
                        .addGap(118, 118, 118)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jlDataImpressao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbImprimirMouseEntered
        // TODO add your handling code here:
        jbImprimir.setToolTipText("Clique para voltar no menu");
    }//GEN-LAST:event_jbImprimirMouseEntered

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Funcionalidade em andamento");
    }//GEN-LAST:event_jbImprimirActionPerformed

    private void jbVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVoltarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVoltarMouseEntered

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlBi;
    private javax.swing.JLabel jlCrime;
    private javax.swing.JLabel jlCrimes;
    private javax.swing.JLabel jlCuidados;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDataDeNascimento;
    private javax.swing.JLabel jlDataImpressao;
    private javax.swing.JLabel jlDoenca;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlNacionalidade;
    private javax.swing.JLabel jlNacionalidadesdsd;
    private javax.swing.JLabel jlNaturalidade;
    private javax.swing.JLabel jlNaturalidadeafsd;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeDaDoenca;
    private javax.swing.JLabel jlNumeroBi;
    private javax.swing.JLabel jlResidencia;
    private javax.swing.JLabel jlSofre;
    private javax.swing.JLabel jlcudados;
    private javax.swing.JLabel jlnomed;
    // End of variables declaration//GEN-END:variables
}
