/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProcessoController;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;

/**
 *
 * @author Kito Mahique
 */
public class RegistarProcesso extends javax.swing.JFrame {

    /**
     * Creates new form Processo1
     */
    
    Font f1= new Font("Calibre", Font.BOLD,18);
    ButtonGroup bggenero= new ButtonGroup();
    
    public RegistarProcesso() {
        initComponents();
        setLocationRelativeTo(null);
        jpAbas.setEnabledAt(1, false);
        jpAbas.setEnabledAt(2, false);
        
        jtId.setEnabled(false);
        jbProximoPessoais.setEnabled(false);
         getContentPane().setBackground(Color.DARK_GRAY);
        for(int i=1; i<=31; i++){
           String a=String.valueOf(i);
           jcDia.addItem(a);
       }
       jcMes.addItem("Janeiro"); jcMes.addItem("Fevereiro"); jcMes.addItem("Março"); 
        jcMes.addItem("Abril"); jcMes.addItem("Maio"); jcMes.addItem("junho"); 
        jcMes.addItem("Julho"); jcMes.addItem("Agosto"); jcMes.addItem("Setembro"); 
        jcMes.addItem("Outubro"); jcMes.addItem("Novembro"); jcMes.addItem("Dezembro"); 
       for(int i=2023; i>=1970; i--){
           String a=String.valueOf(i);
           jcAno.addItem(a);
       }
       
       bggenero.add(jrMasculino);
        bggenero.add(jrFeminino);
        jbProximoPessoais.setBackground(Color.white);
        jbVoltar.setBackground(Color.white);
        jbEditarDadosPessoais.setBackground(Color.white);
        
        jtId.setEnabled(false);
        
        jbProximoMedico.setEnabled(false);
        getContentPane().setBackground(Color.DARK_GRAY);
        jbProximoMedico.setBackground(Color.white);
        jbVoltar.setBackground(Color.white);
        jbEditarDadosPessoais.setBackground(Color.white);
        
        jtId.setEnabled(false);
        jtaCuidados.setEnabled(false);
        jtDoenca.setEnabled(false);
         ButtonGroup bgDoenca= new ButtonGroup();
         bgDoenca.add(jrDoencaSim);
         bgDoenca.add(jrDoencaNao);
         
         jbConcluirRegisto.setEnabled(false);
        getContentPane().setBackground(Color.DARK_GRAY);
        ButtonGroup bgCrime= new ButtonGroup();
        bgCrime.add(jrCrimeSim);
        bgCrime.add(jrNaoCrime);
        jtaCrimes.setVisible(false);
        jbConcluirRegisto.setBackground(Color.white);
        jbVoltarCrimes.setBackground(Color.white);
        jbEditarDadosPessoais.setBackground(Color.white);
        jtId.setEnabled(false);
        jbEditarMedico.setBackground(Color.white);
        jbEditarCrimes.setBackground(Color.white);
    }
    
    private void habilitarBotaoConcluirDadosPessoais(){
        if((jtNome.getText().length()>2) && (jtBi.getText().length()>11) && (jtContacto.getText().length()>2) &&
                (jtNaturalidade.getText().length()>2) && (jtNacionalidade.getText().length()>2) && 
                jtLocalDeResidencia.getText().length()>2 && jrMasculino.isSelected() || jrFeminino.isSelected()){
            jbProximoPessoais.setEnabled(true);
        }
        if((jtNome.getText().length()<3) || (jtBi.getText().length()<12) || (jtContacto.getText().length()<3) ||
                (jtNaturalidade.getText().length()<3) || (jtNacionalidade.getText().length()<3) || jtLocalDeResidencia.getText().length()<3){
            jbProximoPessoais.setEnabled(false);
        }
    }
    public void desabilitarCamposDadosPessoais(){
        jtNome.setEnabled(false);
        jtBi.setEnabled(false);
        jtContacto.setEnabled(false);
        jtNaturalidade.setEnabled(false);
        jtNacionalidade.setEnabled(false);
        jtLocalDeResidencia.setEnabled(false);
        jrMasculino.setEnabled(false);
        jrFeminino.setEnabled(false);
        jcDia.setEnabled(false);
        jcMes.setEnabled(false);
        jcAno.setEnabled(false);
    }
    public void habilitarCamposDadosPessoais(){
        jtNome.setEnabled(true);
        jtBi.setEnabled(true);
        jtContacto.setEnabled(true);
        jtNaturalidade.setEnabled(true);
        jtNacionalidade.setEnabled(true);
        jtLocalDeResidencia.setEnabled(true);
        jrMasculino.setEnabled(true);
        jrFeminino.setEnabled(true);
        jcDia.setEnabled(true);
        jcMes.setEnabled(true);
        jcAno.setEnabled(true);
    }
    
    private void habilitarBotaoConcluirDadosMedicos(){
         if((jtDoenca.getText().length()>3) && (jtaCuidados.getText().length()>3)){
            jbProximoMedico.setEnabled(true);
        }else{
            jbProximoMedico.setEnabled(false);
        }
    }
    public void desabilitarCamposDadosMedicos(){
        jrDoencaSim.setEnabled(false);
        jrDoencaNao.setEnabled(false);
        jtDoenca.setEnabled(false);
        jtaCuidados.setEnabled(false);
    }
    public void habilitarCamposDadosMedicos(){
        jrDoencaSim.setEnabled(true);
        jrDoencaNao.setEnabled(true);
        jtDoenca.setEnabled(true);
        jtaCuidados.setEnabled(true);
    }
    
    private void habilitarBotaoConcluirDadosCriminais(){
        if(jrCrimeSim.isSelected() && jtaCrimes.getText().length()>4){
            jbConcluirRegisto.setEnabled(true);
        }else{
            jbConcluirRegisto.setEnabled(false);
        }
    }
    public void desabilitarCamposDadosCriminais(){
        jrCrimeSim.setEnabled(false);
        jrNaoCrime.setEnabled(false);
        jtaCrimes.setEnabled(false);
    }
    public void habilitarCamposDadosCriminais(){
        jrCrimeSim.setEnabled(true);
        jrNaoCrime.setEnabled(true);
        jtaCrimes.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpAbas = new javax.swing.JTabbedPane();
        jpDadosPessoais = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlId = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jlimag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlContacto = new javax.swing.JLabel();
        jtContacto = new javax.swing.JTextField();
        jlNacionalidade = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jtNacionalidade = new javax.swing.JTextField();
        jcDia = new javax.swing.JComboBox<>();
        jcMes = new javax.swing.JComboBox<>();
        jcAno = new javax.swing.JComboBox<>();
        jlBi = new javax.swing.JLabel();
        jtBi = new javax.swing.JTextField();
        jlNaturalidade = new javax.swing.JLabel();
        jtNaturalidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtLocalDeResidencia = new javax.swing.JTextField();
        jlGenero = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jbProximoPessoais = new javax.swing.JButton();
        jbEditarDadosPessoais = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jpDadosMedicos = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlId1 = new javax.swing.JLabel();
        jtId1 = new javax.swing.JTextField();
        jlimag1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlSofre = new javax.swing.JLabel();
        jlnomed = new javax.swing.JLabel();
        jrDoencaSim = new javax.swing.JRadioButton();
        jrDoencaNao = new javax.swing.JRadioButton();
        jtDoenca = new javax.swing.JTextField();
        jlcudados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaCuidados = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jbProximoMedico = new javax.swing.JButton();
        jbEditarMedico = new javax.swing.JButton();
        jbVoltarMedico = new javax.swing.JButton();
        jpDadosCriminais = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlId2 = new javax.swing.JLabel();
        jtId2 = new javax.swing.JTextField();
        jlimag2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlPergunta = new javax.swing.JLabel();
        jrCrimeSim = new javax.swing.JRadioButton();
        jrNaoCrime = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaCrimes = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jbConcluirRegisto = new javax.swing.JButton();
        jbEditarCrimes = new javax.swing.JButton();
        jbVoltarCrimes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAbas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpAbas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jpDadosPessoais.setBackground(java.awt.Color.darkGray);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlId.setText("ID");

        jlimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prisoner.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlimag))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jlimag)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo");

        jtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNomeKeyReleased(evt);
            }
        });

        jlContacto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlContacto.setForeground(new java.awt.Color(255, 255, 255));
        jlContacto.setText("Contacto");

        jtContacto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtContactoKeyReleased(evt);
            }
        });

        jlNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jlNacionalidade.setText("Nacionalidade");

        jlData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("Data de Nascimento");

        jtNacionalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNacionalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtNacionalidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNacionalidadeKeyReleased(evt);
            }
        });

        jlBi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBi.setForeground(new java.awt.Color(255, 255, 255));
        jlBi.setText("Numero de BI");

        jtBi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtBi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtBi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBiKeyReleased(evt);
            }
        });

        jlNaturalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNaturalidade.setForeground(new java.awt.Color(255, 255, 255));
        jlNaturalidade.setText("Naturalidade");

        jtNaturalidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtNaturalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtNaturalidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNaturalidadeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Local de Residencia");

        jtLocalDeResidencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtLocalDeResidencia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtLocalDeResidencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtLocalDeResidenciaKeyReleased(evt);
            }
        });

        jlGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlGenero.setForeground(new java.awt.Color(255, 255, 255));
        jlGenero.setText("Genero");

        jrMasculino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrMasculino.setText("Masculino");
        jrMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMasculinoActionPerformed(evt);
            }
        });
        jrMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jrMasculinoKeyReleased(evt);
            }
        });

        jrFeminino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrFeminino.setText("Feminino");
        jrFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFemininoActionPerformed(evt);
            }
        });
        jrFeminino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jrFemininoKeyReleased(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(java.awt.Color.pink);

        jbProximoPessoais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbProximoPessoais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8703720_next_arrow_right_navigation_direction_icon.png"))); // NOI18N
        jbProximoPessoais.setText("Proximo");
        jbProximoPessoais.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jbProximoPessoais.setName("Processo"); // NOI18N
        jbProximoPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximoPessoaisActionPerformed(evt);
            }
        });

        jbEditarDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEditarDadosPessoais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/314251_edit_document_icon_1.png"))); // NOI18N
        jbEditarDadosPessoais.setText("Editar");
        jbEditarDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarDadosPessoaisActionPerformed(evt);
            }
        });

        jbVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2303135_arrow_back_left_refresh_renew_icon.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.setName("Processo"); // NOI18N
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbEditarDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbProximoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProximoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditarDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpDadosPessoaisLayout = new javax.swing.GroupLayout(jpDadosPessoais);
        jpDadosPessoais.setLayout(jpDadosPessoaisLayout);
        jpDadosPessoaisLayout.setHorizontalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jcAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtNacionalidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jlGenero))))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jlBi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jlContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtBi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNaturalidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtLocalDeResidencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jrMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jrFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpDadosPessoaisLayout.setVerticalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlBi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtBi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtLocalDeResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcMes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrMasculino)
                            .addComponent(jrFeminino))
                        .addGap(209, 209, 209))))
        );

        jpAbas.addTab("Dados Pessoais", jpDadosPessoais);

        jpDadosMedicos.setBackground(java.awt.Color.darkGray);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlId1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlId1.setText("ID");

        jlimag1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prisoner.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8726080_medical_square_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlimag1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jlimag1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlSofre.setBackground(new java.awt.Color(255, 255, 255));
        jlSofre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSofre.setForeground(new java.awt.Color(255, 255, 255));
        jlSofre.setText("Alguma doenca/deficiencia");

        jlnomed.setBackground(new java.awt.Color(255, 255, 255));
        jlnomed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlnomed.setForeground(new java.awt.Color(255, 255, 255));
        jlnomed.setText("Nome da doenca");

        jrDoencaSim.setBackground(new java.awt.Color(255, 255, 255));
        jrDoencaSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrDoencaSim.setText("Sim");
        jrDoencaSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDoencaSimActionPerformed(evt);
            }
        });

        jrDoencaNao.setBackground(new java.awt.Color(255, 255, 255));
        jrDoencaNao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrDoencaNao.setText("Nao");
        jrDoencaNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDoencaNaoActionPerformed(evt);
            }
        });

        jtDoenca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtDoenca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDoencaActionPerformed(evt);
            }
        });
        jtDoenca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDoencaKeyReleased(evt);
            }
        });

        jlcudados.setBackground(new java.awt.Color(255, 255, 255));
        jlcudados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlcudados.setForeground(new java.awt.Color(255, 255, 255));
        jlcudados.setText("Cuidados Basicos");

        jtaCuidados.setColumns(20);
        jtaCuidados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtaCuidados.setRows(5);
        jtaCuidados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaCuidadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaCuidados);

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setForeground(java.awt.Color.pink);

        jbProximoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbProximoMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8703720_next_arrow_right_navigation_direction_icon.png"))); // NOI18N
        jbProximoMedico.setText("Proximo");
        jbProximoMedico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jbProximoMedico.setName("Processo"); // NOI18N
        jbProximoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximoMedicoActionPerformed(evt);
            }
        });

        jbEditarMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/314251_edit_document_icon_1.png"))); // NOI18N
        jbEditarMedico.setText("Editar");
        jbEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarMedicoActionPerformed(evt);
            }
        });

        jbVoltarMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2303135_arrow_back_left_refresh_renew_icon.png"))); // NOI18N
        jbVoltarMedico.setText("Voltar");
        jbVoltarMedico.setName("Processo"); // NOI18N
        jbVoltarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbEditarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbProximoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProximoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpDadosMedicosLayout = new javax.swing.GroupLayout(jpDadosMedicos);
        jpDadosMedicos.setLayout(jpDadosMedicosLayout);
        jpDadosMedicosLayout.setHorizontalGroup(
            jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosMedicosLayout.createSequentialGroup()
                .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosMedicosLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlnomed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlSofre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlcudados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDoenca, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addGroup(jpDadosMedicosLayout.createSequentialGroup()
                                .addComponent(jrDoencaSim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrDoencaNao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(0, 268, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosMedicosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpDadosMedicosLayout.setVerticalGroup(
            jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosMedicosLayout.createSequentialGroup()
                .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDadosMedicosLayout.createSequentialGroup()
                        .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSofre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDadosMedicosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrDoencaSim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrDoencaNao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlnomed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jpDadosMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcudados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpAbas.addTab("Dados Medidcos", jpDadosMedicos);

        jpDadosCriminais.setBackground(java.awt.Color.darkGray);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlId2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlId2.setText("ID");

        jlimag2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4288577_auction_gavel_judge_law_verdict_icon.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2290855_check_document_done_list_paper_icon.png"))); // NOI18N
        jLabel4.setText("jLabel1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlimag2))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jlimag2)))
                .addGap(17, 17, 17))
        );

        jlPergunta.setBackground(java.awt.Color.darkGray);
        jlPergunta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPergunta.setForeground(new java.awt.Color(255, 255, 255));
        jlPergunta.setText("Possui Algum Registo Criminal");

        jrCrimeSim.setBackground(new java.awt.Color(255, 255, 255));
        jrCrimeSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrCrimeSim.setText("Sim");
        jrCrimeSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCrimeSimActionPerformed(evt);
            }
        });

        jrNaoCrime.setBackground(new java.awt.Color(255, 255, 255));
        jrNaoCrime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrNaoCrime.setText("Nao");
        jrNaoCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNaoCrimeActionPerformed(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.darkGray);
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Datas de Condenacao  -  crimes  -  sentenca");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("exemplo:   20/10/2023 - furto(subtracao) - quatro(4) anos + multa");

        jtaCrimes.setColumns(20);
        jtaCrimes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtaCrimes.setRows(5);
        jtaCrimes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtaCrimes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaCrimesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtaCrimes);

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setForeground(java.awt.Color.pink);

        jbConcluirRegisto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConcluirRegisto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8726195_save_floppy_icon.png"))); // NOI18N
        jbConcluirRegisto.setText("  Concluir");
        jbConcluirRegisto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jbConcluirRegisto.setName("Processo"); // NOI18N
        jbConcluirRegisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirRegistoActionPerformed(evt);
            }
        });

        jbEditarCrimes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEditarCrimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/314251_edit_document_icon_1.png"))); // NOI18N
        jbEditarCrimes.setText("Editar");
        jbEditarCrimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarCrimesActionPerformed(evt);
            }
        });

        jbVoltarCrimes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltarCrimes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2303135_arrow_back_left_refresh_renew_icon.png"))); // NOI18N
        jbVoltarCrimes.setText("Voltar");
        jbVoltarCrimes.setName("Processo"); // NOI18N
        jbVoltarCrimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarCrimesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltarCrimes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbEditarCrimes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbConcluirRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConcluirRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditarCrimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltarCrimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpDadosCriminaisLayout = new javax.swing.GroupLayout(jpDadosCriminais);
        jpDadosCriminais.setLayout(jpDadosCriminaisLayout);
        jpDadosCriminaisLayout.setHorizontalGroup(
            jpDadosCriminaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosCriminaisLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jpDadosCriminaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosCriminaisLayout.createSequentialGroup()
                        .addComponent(jlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                        .addComponent(jrCrimeSim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(jrNaoCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jpDadosCriminaisLayout.createSequentialGroup()
                        .addGroup(jpDadosCriminaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosCriminaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpDadosCriminaisLayout.setVerticalGroup(
            jpDadosCriminaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosCriminaisLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpDadosCriminaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosCriminaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrCrimeSim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrNaoCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpAbas.addTab("Dados Criminais", jpDadosCriminais);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpAbas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpAbas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jtNomeKeyReleased

    private void jtContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContactoKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jtContactoKeyReleased

    private void jtNacionalidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNacionalidadeKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jtNacionalidadeKeyReleased

    private void jtBiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBiKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jtBiKeyReleased

    private void jtNaturalidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNaturalidadeKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jtNaturalidadeKeyReleased

    private void jtLocalDeResidenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLocalDeResidenciaKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jtLocalDeResidenciaKeyReleased

    private void jrMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMasculinoActionPerformed
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jrMasculinoActionPerformed

    private void jrMasculinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrMasculinoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jrMasculinoKeyReleased

    private void jrFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFemininoActionPerformed
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosPessoais();
    }//GEN-LAST:event_jrFemininoActionPerformed

    private void jrFemininoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrFemininoKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_jrFemininoKeyReleased

    private void jbProximoPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximoPessoaisActionPerformed
        // TODO add your handling code here:
        jpAbas.setSelectedIndex(1);
        desabilitarCamposDadosPessoais();
        jpAbas.setEnabledAt(0, false);
        jpAbas.setEnabledAt(1, true);
        jpAbas.setEnabledAt(2, false);
    }//GEN-LAST:event_jbProximoPessoaisActionPerformed

    private void jbEditarDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarDadosPessoaisActionPerformed
        // TODO add your handling code here:
        habilitarCamposDadosPessoais();
    }//GEN-LAST:event_jbEditarDadosPessoaisActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jrDoencaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDoencaSimActionPerformed
        // TODO add your handling code here:
        jtaCuidados.setEnabled(true);
        jtDoenca.setEnabled(true);
        if(jtDoenca.getText().length()<4 || jtaCuidados.getText().length()<4){
            jbProximoMedico.setEnabled(false);
        }
    }//GEN-LAST:event_jrDoencaSimActionPerformed

    private void jrDoencaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDoencaNaoActionPerformed
        // TODO add your handling code here:
        jtaCuidados.setText("");
        jtDoenca.setText("");
        jtaCuidados.setEnabled(false);
        jtDoenca.setEnabled(false);
        jbProximoMedico.setEnabled(true);
    }//GEN-LAST:event_jrDoencaNaoActionPerformed

    private void jtDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDoencaActionPerformed

    private void jtDoencaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDoencaKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosMedicos();
    }//GEN-LAST:event_jtDoencaKeyReleased

    private void jtaCuidadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaCuidadosKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosMedicos();
    }//GEN-LAST:event_jtaCuidadosKeyReleased

    private void jrCrimeSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCrimeSimActionPerformed
        // TODO add your handling code here:
        jtaCrimes.setVisible(true);
        if(jtaCrimes.getText().length()<5){
            jbConcluirRegisto.setEnabled(false);
        }
    }//GEN-LAST:event_jrCrimeSimActionPerformed

    private void jrNaoCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNaoCrimeActionPerformed
        // TODO add your handling code here:
        jtaCrimes.setText("");
        jtaCrimes.setVisible(false);
        jbConcluirRegisto.setEnabled(true);
    }//GEN-LAST:event_jrNaoCrimeActionPerformed

    private void jtaCrimesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaCrimesKeyReleased
        // TODO add your handling code here:
        habilitarBotaoConcluirDadosCriminais();
    }//GEN-LAST:event_jtaCrimesKeyReleased

    private void jbProximoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximoMedicoActionPerformed
        // TODO add your handling code here:
        jpAbas.setSelectedIndex(2);
        jpAbas.setEnabledAt(0, false);
        jpAbas.setEnabledAt(1, false);
        jpAbas.setEnabledAt(2, true);
    }//GEN-LAST:event_jbProximoMedicoActionPerformed

    private void jbEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarMedicoActionPerformed

    private void jbVoltarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarMedicoActionPerformed
        // TODO add your handling code here:
        jpAbas.setSelectedIndex(0);
        jpAbas.setEnabledAt(0, true);
        jpAbas.setEnabledAt(1, false);
        jpAbas.setEnabledAt(2, false);
    }//GEN-LAST:event_jbVoltarMedicoActionPerformed

    private void jbConcluirRegistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirRegistoActionPerformed
        // TODO add your handling code here:
        ProcessoController p = new ProcessoController();
        String genero;
        String doenca="";
        String crime;
        if(jrMasculino.isSelected()){
            genero ="masculino";
        }else{
            genero= "feminino";
        }
        if(jrDoencaSim.isSelected()){
            doenca = "sim";
        }else{
            doenca= "nao";
        }
        if(jrCrimeSim.isSelected()){
            crime = "sim";
        }else{
            crime = "nao";
        }
        p.gravar(jtNome.getText(), jtBi.getText(), jtNaturalidade.getText(), 
                jtNacionalidade.getText(), jtLocalDeResidencia.getText(), 
                genero, String.valueOf(jcDia.getSelectedItem())+"/"+ 
                String.valueOf(jcMes.getSelectedItem())+"/"+ 
                String.valueOf(jcAno.getSelectedItem()), doenca, jtDoenca.getText(), 
                jtaCuidados.getText(), crime, jtaCrimes.getText());
        
        new Menu();
        this.dispose();
    }//GEN-LAST:event_jbConcluirRegistoActionPerformed

    private void jbEditarCrimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarCrimesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditarCrimesActionPerformed

    private void jbVoltarCrimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarCrimesActionPerformed
        // TODO add your handling code here:
        jpAbas.setSelectedIndex(1);
        jpAbas.setEnabledAt(0, false);
        jpAbas.setEnabledAt(1, true);
        jpAbas.setEnabledAt(2, false);
    }//GEN-LAST:event_jbVoltarCrimesActionPerformed

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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbConcluirProcesso1;
    private javax.swing.JButton jbConcluirRegisto;
    private javax.swing.JButton jbEditar3;
    private javax.swing.JButton jbEditarCrimes;
    private javax.swing.JButton jbEditarDadosPessoais;
    private javax.swing.JButton jbEditarMedico;
    private javax.swing.JButton jbProximoMedico;
    private javax.swing.JButton jbProximoPessoais;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JButton jbVoltar2;
    private javax.swing.JButton jbVoltarCrimes;
    private javax.swing.JButton jbVoltarMedico;
    private javax.swing.JComboBox<String> jcAno;
    private javax.swing.JComboBox<String> jcDia;
    private javax.swing.JComboBox<String> jcMes;
    private javax.swing.JLabel jlBi;
    private javax.swing.JLabel jlContacto;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId1;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlNacionalidade;
    private javax.swing.JLabel jlNaturalidade;
    private javax.swing.JLabel jlPergunta;
    private javax.swing.JLabel jlSofre;
    private javax.swing.JLabel jlcudados;
    private javax.swing.JLabel jlimag;
    private javax.swing.JLabel jlimag1;
    private javax.swing.JLabel jlimag2;
    private javax.swing.JLabel jlnomed;
    private javax.swing.JTabbedPane jpAbas;
    private javax.swing.JPanel jpDadosCriminais;
    private javax.swing.JPanel jpDadosMedicos;
    private javax.swing.JPanel jpDadosPessoais;
    private javax.swing.JRadioButton jrCrimeSim;
    private javax.swing.JRadioButton jrDoencaNao;
    private javax.swing.JRadioButton jrDoencaSim;
    private javax.swing.JRadioButton jrFeminino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JRadioButton jrNaoCrime;
    private javax.swing.JTextField jtBi;
    private javax.swing.JTextField jtContacto;
    private javax.swing.JTextField jtDoenca;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtId1;
    private javax.swing.JTextField jtId2;
    private javax.swing.JTextField jtLocalDeResidencia;
    private javax.swing.JTextField jtNacionalidade;
    private javax.swing.JTextField jtNaturalidade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextArea jtaCrimes;
    private javax.swing.JTextArea jtaCuidados;
    // End of variables declaration//GEN-END:variables
}
