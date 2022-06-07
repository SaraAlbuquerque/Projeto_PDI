/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;

import Manipulacao.AberturaImg;
import Manipulacao.Histograma;
import Manipulacao.Manipulacoes;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Guilherme
 */
public class UI_Principal extends javax.swing.JFrame {

    /**
     * Creates new form UI_Principal
     */    
    public UI_Principal() {
        initComponents();
    }
    
    //imagens 
    private BufferedImage imgEntrada;
    private BufferedImage imgSaida;
    
    //UI'S
    private UI_Histograma uiHistograma;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSaida = new javax.swing.JLabel();
        labelEntrada = new javax.swing.JLabel();
        btnTransfere = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        labelCoordX = new javax.swing.JLabel();
        labelY = new javax.swing.JLabel();
        labelCoordY = new javax.swing.JLabel();
        labelPixel = new javax.swing.JLabel();
        labelCorPixel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirImg = new javax.swing.JMenuItem();
        btnConversor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnSepararCanais = new javax.swing.JMenuItem();
        btnTonsCinza = new javax.swing.JMenuItem();
        btnNegativa = new javax.swing.JMenuItem();
        btnHistograma = new javax.swing.JMenuItem();
        btnMascaraMedia = new javax.swing.JMenuItem();
        btnMascaraMediana = new javax.swing.JMenuItem();
        btnBinarizacao = new javax.swing.JMenuItem();
        btnLimiar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto PDI");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelSaida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelEntrada.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelEntradaMouseMoved(evt);
            }
        });

        btnTransfere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTransfere.setText("<=");
        btnTransfere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfereActionPerformed(evt);
            }
        });

        label1.setText("Imagem de entrada:");

        label2.setText("Imagem de saída:");

        labelX.setText("X =");

        labelCoordX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelY.setText("Y =");

        labelCoordY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelPixel.setText("Pixel:");

        labelCorPixel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("Arquivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        abrirImg.setText("Abrir");
        abrirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirImgActionPerformed(evt);
            }
        });
        jMenu1.add(abrirImg);

        btnConversor.setText("Conversor RGB/HSL");
        btnConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversorActionPerformed(evt);
            }
        });
        jMenu1.add(btnConversor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaçõesno Espaço");

        btnSepararCanais.setText("Separar Canais");
        btnSepararCanais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepararCanaisActionPerformed(evt);
            }
        });
        jMenu2.add(btnSepararCanais);

        btnTonsCinza.setText("Tons de Cinza");
        btnTonsCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTonsCinzaActionPerformed(evt);
            }
        });
        jMenu2.add(btnTonsCinza);

        btnNegativa.setText("Negativa");
        btnNegativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativaActionPerformed(evt);
            }
        });
        jMenu2.add(btnNegativa);

        btnHistograma.setText("Histograma");
        btnHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistogramaActionPerformed(evt);
            }
        });
        jMenu2.add(btnHistograma);

        btnMascaraMedia.setText("Mascara da média");
        btnMascaraMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascaraMediaActionPerformed(evt);
            }
        });
        jMenu2.add(btnMascaraMedia);

        btnMascaraMediana.setText("Mascara da Mediana");
        btnMascaraMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascaraMedianaActionPerformed(evt);
            }
        });
        jMenu2.add(btnMascaraMediana);

        btnBinarizacao.setText("Binarização");
        btnBinarizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarizacaoActionPerformed(evt);
            }
        });
        jMenu2.add(btnBinarizacao);

        btnLimiar.setText("Limiarização");
        btnLimiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimiarActionPerformed(evt);
            }
        });
        jMenu2.add(btnLimiar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPixel)
                        .addGap(3, 3, 3)
                        .addComponent(labelCorPixel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(btnTransfere, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnTransfere))
                    .addComponent(labelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelX)
                        .addComponent(labelCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelY)
                        .addComponent(labelCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPixel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCorPixel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void abrirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImgActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int resposta = fileChooser.showOpenDialog(null);
        AberturaImg abertura = AberturaImg.getInstance();
        if (resposta == JFileChooser.APPROVE_OPTION)
           abertura.abreImg(fileChooser.getSelectedFile().getAbsoluteFile());
        
        this.imgEntrada = abertura.getImg();
        this.renderImgEntrada();
    }//GEN-LAST:event_abrirImgActionPerformed

    private void btnTransfereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfereActionPerformed
        if (this.imgSaida == null)
            return;
        
        this.imgEntrada = this.imgSaida;
        this.renderImgEntrada();
    }//GEN-LAST:event_btnTransfereActionPerformed

    private void btnSepararCanaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepararCanaisActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UI_Canais dialog = new UI_Canais(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnSepararCanaisActionPerformed

    private void btnHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistogramaActionPerformed
        Histograma aux = new Histograma();
        aux.setImg(this.imgEntrada);
        
        this.uiHistograma = new UI_Histograma(new javax.swing.JFrame(), true);
        this.uiHistograma.setVisible(true);
        
        if (this.uiHistograma.getEqualizar())
        {
            this.imgSaida = Manipulacoes.equalizacaoHistograma(this.imgEntrada);
            aux.setImg(imgSaida);
            this.renderImgSaida();
            this.uiHistograma.setVisible(true);
        }       
    }//GEN-LAST:event_btnHistogramaActionPerformed

    private void btnNegativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativaActionPerformed
        //performa o algoritmo de negativar a imagem e renderiza no label de saída
        
        this.imgSaida = Manipulacoes.negativa(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnNegativaActionPerformed

    private void btnMascaraMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascaraMediaActionPerformed
        //performa a convolução na imagem a partir da máscara passada e renderiza no label de saída
        
        //montando a máscara
        float[][] mascara = new float[3][3];
        
        for (int i = 0; i < mascara.length; i++)
        {
            for (int j = 0; j < mascara[0].length; j++)
            {
                mascara[i][j] = 1.0f/9.0f;
            }
        }
        
        this.imgSaida = Manipulacoes.convolucaoGenerica(this.imgEntrada, mascara);
        this.renderImgSaida();
    }//GEN-LAST:event_btnMascaraMediaActionPerformed

    private void btnMascaraMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascaraMedianaActionPerformed
        //perfoma o algoritmo da máscara da madiana e renderiza na saída
        this.imgSaida = Manipulacoes.mascaraMediana(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnMascaraMedianaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btnTonsCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTonsCinzaActionPerformed
        //transforma a imgem em tons de cinza, salva na classe AberturaImg e renderiza no label de saída
        this.imgSaida = Manipulacoes.tonsCinza(this.imgEntrada);
        AberturaImg abertura = AberturaImg.getInstance();
        abertura.setImgCinza(imgSaida);
        this.renderImgSaida();
    }//GEN-LAST:event_btnTonsCinzaActionPerformed

    private void btnBinarizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarizacaoActionPerformed
        //binariza a imagem e renderiza a saída no label de saída
        this.imgSaida = Manipulacoes.binarizacao_limiarização(this.imgEntrada, 127);
        this.renderImgSaida();
    }//GEN-LAST:event_btnBinarizacaoActionPerformed

    private void btnLimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimiarActionPerformed
        UI_ValorLimiarizacao uiLimiarizacao = new UI_ValorLimiarizacao(new javax.swing.JFrame(), true);
        uiLimiarizacao.setVisible(true);
        
        int valor = Integer.valueOf(uiLimiarizacao.getValor());
        this.imgSaida = Manipulacoes.binarizacao_limiarização(this.imgEntrada, valor);
        this.renderImgSaida();
    }//GEN-LAST:event_btnLimiarActionPerformed

    private void labelEntradaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEntradaMouseMoved
        
    }//GEN-LAST:event_labelEntradaMouseMoved

    private void btnConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UI_Conversor dialog = new UI_Conversor(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnConversorActionPerformed
    
    private void renderImgEntrada()
    {
        //faz a renderização da imagem no label de entrada
        this.labelEntrada.setIcon(new ImageIcon(this.imgEntrada.getScaledInstance(this.labelEntrada.getWidth(), this.labelEntrada.getHeight(), Image.SCALE_DEFAULT)));
    }
    
    private void renderImgSaida()
    {
        //faz a renderização da imagem no label de saída
        this.labelSaida.setIcon(new ImageIcon(this.imgSaida.getScaledInstance(this.labelSaida.getWidth(), this.labelSaida.getHeight(), Image.SCALE_DEFAULT)));
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
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirImg;
    private javax.swing.JMenuItem btnBinarizacao;
    private javax.swing.JMenuItem btnConversor;
    private javax.swing.JMenuItem btnHistograma;
    private javax.swing.JMenuItem btnLimiar;
    private javax.swing.JMenuItem btnMascaraMedia;
    private javax.swing.JMenuItem btnMascaraMediana;
    private javax.swing.JMenuItem btnNegativa;
    private javax.swing.JMenuItem btnSepararCanais;
    private javax.swing.JMenuItem btnTonsCinza;
    private javax.swing.JButton btnTransfere;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelCoordX;
    private javax.swing.JLabel labelCoordY;
    private javax.swing.JLabel labelCorPixel;
    private javax.swing.JLabel labelEntrada;
    private javax.swing.JLabel labelPixel;
    private javax.swing.JLabel labelSaida;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelY;
    // End of variables declaration//GEN-END:variables
}
