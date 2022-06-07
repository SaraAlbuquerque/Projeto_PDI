/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;

import Manipulacao.Conversor;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Guilherme
 */
public class UI_Conversor extends javax.swing.JDialog {

    /**
     * Creates new form UI_Conversor
     */
    public UI_Conversor(java.awt.Frame parent, boolean modal) {
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

        labelR = new javax.swing.JLabel();
        labelG = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        labelH = new javax.swing.JLabel();
        labelS = new javax.swing.JLabel();
        labelL = new javax.swing.JLabel();
        inputR = new javax.swing.JTextField();
        inputG = new javax.swing.JTextField();
        inputB = new javax.swing.JTextField();
        inputH = new javax.swing.JTextField();
        inputS = new javax.swing.JTextField();
        inputL = new javax.swing.JTextField();
        saidaCor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor RGB/HSL");

        labelR.setText("R (0, 255):");

        labelG.setText("G (0, 255):");

        labelB.setText("B (0, 255):");

        labelH.setText("H (0, 239):");

        labelS.setText("S (0, 240):");

        labelL.setText("L (0, 240):");

        inputR.setText("0");
        inputR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRActionPerformed(evt);
            }
        });

        inputG.setText("0");
        inputG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGActionPerformed(evt);
            }
        });

        inputB.setText("0");
        inputB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBActionPerformed(evt);
            }
        });

        inputH.setText("0");
        inputH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHActionPerformed(evt);
            }
        });

        inputS.setText("0");
        inputS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSActionPerformed(evt);
            }
        });

        inputL.setText("0");
        inputL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLActionPerformed(evt);
            }
        });

        saidaCor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pressionne ENTER para converter.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelH, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(labelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputR, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(saidaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saidaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelR)
                            .addComponent(inputR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelG)
                            .addComponent(inputG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelB)
                            .addComponent(inputB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelH)
                            .addComponent(inputH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelS)
                            .addComponent(inputS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelL)
                            .addComponent(inputL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRActionPerformed
        int[] rgb =  this.getRGB();
        this.setRGB(rgb);
        
        int[] hsl = Conversor.rgbToHSL(rgb[0], rgb[1], rgb[2]);
        this.setHSL(hsl);
        
        this.pintaSaida(rgb);  
    }//GEN-LAST:event_inputRActionPerformed

    private void inputGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGActionPerformed
        int[] rgb =  this.getRGB();
        this.setRGB(rgb);
        
        int[] hsl = Conversor.rgbToHSL(rgb[0], rgb[1], rgb[2]);
        this.setHSL(hsl);
        
        this.pintaSaida(rgb);
    }//GEN-LAST:event_inputGActionPerformed

    private void inputBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBActionPerformed
        int[] rgb =  this.getRGB();
        this.setRGB(rgb);
        
        int[] hsl = Conversor.rgbToHSL(rgb[0], rgb[1], rgb[2]);
        this.setHSL(hsl);
        
        this.pintaSaida(rgb);
    }//GEN-LAST:event_inputBActionPerformed

    private void inputHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHActionPerformed
        int[] hsl = this.getHSL();
        this.setHSL(hsl);
        
        int[] rgb;
        rgb = Conversor.hslToRGB(hsl[0], hsl[1], hsl[2]);
        
        this.setRGB(rgb);
        
        this.pintaSaida(rgb);
    }//GEN-LAST:event_inputHActionPerformed

    private void inputSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSActionPerformed
        int[] hsl = this.getHSL();
        this.setHSL(hsl);
        
        int[] rgb;
        rgb = Conversor.hslToRGB(hsl[0], hsl[1], hsl[2]);
        
        this.setRGB(rgb);
        
        this.pintaSaida(rgb);
    }//GEN-LAST:event_inputSActionPerformed

    private void inputLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLActionPerformed
        int[] hsl = this.getHSL();
        this.setHSL(hsl);
        
        int[] rgb;
        rgb = Conversor.hslToRGB(hsl[0], hsl[1], hsl[2]);
        
        this.setRGB(rgb);
        
        this.pintaSaida(rgb);
    }//GEN-LAST:event_inputLActionPerformed
    
    private void pintaSaida(int[] rgb)
    {
        BufferedImage saida = new BufferedImage(this.saidaCor.getWidth(), this.saidaCor.getHeight(), BufferedImage.SCALE_DEFAULT);
        
        int cor = (rgb[0] << 16)  | (rgb[1] << 8)  | rgb[2] ;
        
        for (int i = 0; i < saida.getWidth(); i++)
        {
            for (int j = 0; j < saida.getHeight(); j++)
            {
                saida.setRGB(i, j, cor);
            }
        }
        
        this.saidaCor.setIcon(new ImageIcon(saida));
    }
    
    private int[] getRGB()
    {
        int[] rgb = new int[3];
        
        if (!"".equals(this.inputR.getText()))
        {
            if (Integer.valueOf(this.inputR.getText()) < 0)
                rgb[0] = 0;
            else if (Integer.valueOf(this.inputR.getText()) > 255)
                rgb[0] = 255;
            else
                rgb[0] = Integer.valueOf(this.inputR.getText());
        }
        if (!"".equals(this.inputG.getText()))
        {
            if (Integer.valueOf(this.inputG.getText()) < 0)
                rgb[1] = 0;
            else if (Integer.valueOf(this.inputG.getText()) > 255)
                rgb[1] = 255;
            else
                rgb[1] = Integer.valueOf(this.inputG.getText());
        }
        if (!"".equals(this.inputB.getText()))
        {
            if (Integer.valueOf(this.inputB.getText()) < 0)
                rgb[2] = 0;
            else if (Integer.valueOf(this.inputB.getText()) > 255)
                rgb[2] = 255;
            else
                rgb[2] = Integer.valueOf(this.inputB.getText());
        }
        
        return rgb;
    }
    
    private int[] getHSL()
    {
        int[] hsl = new int[3];
        
        if (!"".equals(this.inputH.getText()))
        {
            if (Integer.valueOf(this.inputH.getText()) < 0)
                hsl[0] = 0;
            else if (Integer.valueOf(this.inputH.getText()) > 239)
                hsl[0] = 239;
            else
                hsl[0] = Integer.valueOf(this.inputH.getText());
        }
        
        if (!"".equals(this.inputS.getText()))
        {
            if (Integer.valueOf(this.inputS.getText()) < 0)
                hsl[1] = 0;
            else if (Integer.valueOf(this.inputS.getText()) > 240)
                hsl[1] = 240;
            else
                hsl[1] = Integer.valueOf(this.inputS.getText());
        }
        
        if (!"".equals(this.inputL.getText()))
        {
            if (Integer.valueOf(this.inputL.getText()) < 0)
                hsl[2] = 0;
            else if (Integer.valueOf(this.inputL.getText()) > 240)
                hsl[2] = 0;
            else
                hsl[2] = Integer.valueOf(this.inputL.getText());
        }
        
        return hsl;
    }
    
    private void setRGB(int[] rgb)
    {
        this.inputR.setText(String.valueOf(rgb[0]));
        this.inputG.setText(String.valueOf(rgb[1]));
        this.inputB.setText(String.valueOf(rgb[2]));
    }
    
    private void setHSL(int[] hsl)
    {
        this.inputH.setText(String.valueOf(hsl[0]));
        this.inputS.setText(String.valueOf(hsl[1]));
        this.inputL.setText(String.valueOf(hsl[2]));
    }
    
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
            java.util.logging.Logger.getLogger(UI_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI_Conversor dialog = new UI_Conversor(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField inputB;
    private javax.swing.JTextField inputG;
    private javax.swing.JTextField inputH;
    private javax.swing.JTextField inputL;
    private javax.swing.JTextField inputR;
    private javax.swing.JTextField inputS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelG;
    private javax.swing.JLabel labelH;
    private javax.swing.JLabel labelL;
    private javax.swing.JLabel labelR;
    private javax.swing.JLabel labelS;
    private javax.swing.JLabel saidaCor;
    // End of variables declaration//GEN-END:variables
}
