/*
 * TelaPrincipal.java
 *
 * Created on 6 de Setembro de 2007, 19:26
 */

package ine5612testes.gui;

import ine5612testes.Calculadora;
import ine5612testes.ControlePrincipal;
import ine5612testes.Operacoes;

/**
 *
 * @author  brodock
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /** Creates new form TelaPrincipal */
    private Calculadora calculadora;
    private ControlePrincipal ctrPrincipal;

    public TelaPrincipal(ControlePrincipal ctr) {
        initComponents();
        this.ctrPrincipal = ctr;
        this.calculadora = this.ctrPrincipal.getCalculadora();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bBackspace = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bMC = new javax.swing.JButton();
        bMR = new javax.swing.JButton();
        bMS = new javax.swing.JButton();
        bMmais = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        bsqrt = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bmult = new javax.swing.JButton();
        bporcent = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        binversao_valor = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        binversao_sinal = new javax.swing.JButton();
        bvirgula = new javax.swing.JButton();
        bsoma = new javax.swing.JButton();
        bigual = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        textoDisplay = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jButton27.setText("jButton27");

        jButton28.setText("jButton28");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        bBackspace.setText("Backspace");
        bBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackspaceActionPerformed(evt);
            }
        });

        bCE.setText("CE");
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });

        bC.setText("C");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bBackspace)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bC, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBackspace)
                    .addComponent(bCE)
                    .addComponent(bC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridBagLayout());

        bMC.setText("MC");
        bMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(bMC, gridBagConstraints);

        bMR.setText("MR");
        bMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(bMR, gridBagConstraints);

        bMS.setText("MS");
        bMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMSActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(bMS, gridBagConstraints);

        bMmais.setText("M+");
        bMmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMmaisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(bMmais, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        b7.setText("7");
        b7.setMaximumSize(new java.awt.Dimension(30, 30));
        b7.setMinimumSize(new java.awt.Dimension(30, 30));
        b7.setPreferredSize(new java.awt.Dimension(35, 30));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b7, gridBagConstraints);

        b8.setText("8");
        b8.setPreferredSize(new java.awt.Dimension(35, 30));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b8, gridBagConstraints);

        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(35, 30));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b9, gridBagConstraints);

        bdiv.setText("/");
        bdiv.setMaximumSize(new java.awt.Dimension(30, 30));
        bdiv.setMinimumSize(new java.awt.Dimension(30, 30));
        bdiv.setPreferredSize(new java.awt.Dimension(35, 30));
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bdiv, gridBagConstraints);

        bsqrt.setText("sqrt");
        bsqrt.setPreferredSize(new java.awt.Dimension(50, 30));
        bsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsqrtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bsqrt, gridBagConstraints);

        b4.setText("4");
        b4.setPreferredSize(new java.awt.Dimension(35, 30));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b4, gridBagConstraints);

        b5.setText("5");
        b5.setPreferredSize(new java.awt.Dimension(35, 30));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b5, gridBagConstraints);

        b6.setText("6");
        b6.setPreferredSize(new java.awt.Dimension(35, 30));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b6, gridBagConstraints);

        bmult.setText("*");
        bmult.setPreferredSize(new java.awt.Dimension(35, 30));
        bmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bmult, gridBagConstraints);

        bporcent.setText("%");
        bporcent.setPreferredSize(new java.awt.Dimension(50, 30));
        bporcent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bporcentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bporcent, gridBagConstraints);

        b1.setText("1");
        b1.setPreferredSize(new java.awt.Dimension(35, 30));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b1, gridBagConstraints);

        b2.setText("2");
        b2.setPreferredSize(new java.awt.Dimension(35, 30));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b2, gridBagConstraints);

        b3.setText("3");
        b3.setPreferredSize(new java.awt.Dimension(35, 30));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b3, gridBagConstraints);

        bsub.setText("-");
        bsub.setPreferredSize(new java.awt.Dimension(35, 30));
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bsub, gridBagConstraints);

        binversao_valor.setText("1/x");
        binversao_valor.setPreferredSize(new java.awt.Dimension(50, 30));
        binversao_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binversao_valorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(binversao_valor, gridBagConstraints);

        b0.setText("0");
        b0.setPreferredSize(new java.awt.Dimension(35, 30));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(b0, gridBagConstraints);

        binversao_sinal.setText("+/-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(binversao_sinal, gridBagConstraints);

        bvirgula.setText(",");
        bvirgula.setPreferredSize(new java.awt.Dimension(35, 30));
        bvirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvirgulaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bvirgula, gridBagConstraints);

        bsoma.setText("+");
        bsoma.setPreferredSize(new java.awt.Dimension(35, 30));
        bsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsomaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bsoma, gridBagConstraints);

        bigual.setText("=");
        bigual.setPreferredSize(new java.awt.Dimension(50, 30));
        bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(bigual, gridBagConstraints);

        textoDisplay.setEditable(false);
        textoDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Editar");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exibir");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    this.calculadora.comando_numerico(1);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b1ActionPerformed

private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
    this.calculadora.comando_numerico(0);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b0ActionPerformed

private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    this.calculadora.comando_numerico(2);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b2ActionPerformed

private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    this.calculadora.comando_numerico(3);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b3ActionPerformed

private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    this.calculadora.comando_numerico(4);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b4ActionPerformed

private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
    this.calculadora.comando_numerico(5);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b5ActionPerformed

private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    this.calculadora.comando_numerico(6);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b6ActionPerformed

private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    this.calculadora.comando_numerico(7);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b7ActionPerformed

private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
    this.calculadora.comando_numerico(8);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b8ActionPerformed

private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
    this.calculadora.comando_numerico(9);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_b9ActionPerformed

private void bsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsomaActionPerformed
    this.calculadora.comando_operacao(Operacoes.SOMA);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bsomaActionPerformed

private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
    this.calculadora.comando_operacao(Operacoes.SUBTRACAO);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bsubActionPerformed

private void bmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultActionPerformed
    this.calculadora.comando_operacao(Operacoes.MULTIPLICACAO);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bmultActionPerformed

private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
    this.calculadora.comando_operacao(Operacoes.DIVISAO);
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bdivActionPerformed

private void bsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsqrtActionPerformed
    this.calculadora.comando_raiz();
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bsqrtActionPerformed

private void binversao_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binversao_valorActionPerformed
    this.calculadora.comando_inversao();
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_binversao_valorActionPerformed

private void bporcentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bporcentActionPerformed
    this.calculadora.comando_porcento();
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bporcentActionPerformed

private void bigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigualActionPerformed
    this.calculadora.comando_igual();
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bigualActionPerformed

private void bvirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvirgulaActionPerformed
    this.calculadora.comando_virgula();
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bvirgulaActionPerformed

private void bMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMCActionPerformed
    this.calculadora.comando_MC();
}//GEN-LAST:event_bMCActionPerformed

private void bMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMRActionPerformed
    this.calculadora.comando_MR();
    this.textoDisplay.setText(this.calculadora.getTextoDisplay());
}//GEN-LAST:event_bMRActionPerformed

private void bMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMSActionPerformed
    this.calculadora.comando_MS();
}//GEN-LAST:event_bMSActionPerformed

private void bMmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMmaisActionPerformed
    this.calculadora.comando_MP();
}//GEN-LAST:event_bMmaisActionPerformed

private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
    this.calculadora.comando_C();
}//GEN-LAST:event_bCActionPerformed

private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
    this.calculadora.comando_CE();
}//GEN-LAST:event_bCEActionPerformed

private void bBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackspaceActionPerformed
    this.calculadora.comando_Backspace();
}//GEN-LAST:event_bBackspaceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBackspace;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bMC;
    private javax.swing.JButton bMR;
    private javax.swing.JButton bMS;
    private javax.swing.JButton bMmais;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bigual;
    private javax.swing.JButton binversao_sinal;
    private javax.swing.JButton binversao_valor;
    private javax.swing.JButton bmult;
    private javax.swing.JButton bporcent;
    private javax.swing.JButton bsoma;
    private javax.swing.JButton bsqrt;
    private javax.swing.JButton bsub;
    private javax.swing.JButton bvirgula;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField textoDisplay;
    // End of variables declaration//GEN-END:variables
}