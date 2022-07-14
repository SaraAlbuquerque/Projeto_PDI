/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;

import Manipulacao.AberturaImg;
import Manipulacao.Histograma;
import Manipulacao.FiltrosPrimeiroBim;
import Manipulacao.FiltrosSegundoBim;
import Manipulacao.MascarasPrimeiroBim;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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

        btnTransfere = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        labelCoordX = new javax.swing.JLabel();
        labelY = new javax.swing.JLabel();
        labelCoordY = new javax.swing.JLabel();
        labelPixel = new javax.swing.JLabel();
        labelCorPixel = new javax.swing.JLabel();
        painelEntrada = new javax.swing.JScrollPane();
        labelEntrada = new javax.swing.JLabel();
        painelSaida = new javax.swing.JScrollPane();
        labelSaida = new javax.swing.JLabel();
        labelRGB = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrirImg = new javax.swing.JMenuItem();
        btnSalvar = new javax.swing.JMenuItem();
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
        btnSaltPeper = new javax.swing.JMenuItem();
        menuSobel = new javax.swing.JMenu();
        btnBordasSobel = new javax.swing.JMenuItem();
        btnbordasH = new javax.swing.JMenuItem();
        btnBordasV = new javax.swing.JMenuItem();
        btnLaplace = new javax.swing.JMenuItem();
        btnCompressaoDinamica = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnPontoMinimo = new javax.swing.JMenuItem();
        filtroPontoMax = new javax.swing.JMenuItem();
        btnPontoMedio = new javax.swing.JMenuItem();
        btnDCT = new javax.swing.JMenuItem();
        btnIDCT = new javax.swing.JMenuItem();
        btnColorizacao = new javax.swing.JMenuItem();
        btnEqualizacaoHSI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto PDI");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 400));

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

        labelCoordX.setText("0");
        labelCoordX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelY.setText("Y =");

        labelCoordY.setText("0");
        labelCoordY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelPixel.setText("Pixel:");

        labelCorPixel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelCorPixel.setOpaque(true);

        labelEntrada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEntrada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelEntrada.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelEntradaMouseMoved(evt);
            }
        });
        painelEntrada.setViewportView(labelEntrada);

        labelSaida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSaida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        painelSaida.setViewportView(labelSaida);

        labelRGB.setText("(0,0,0)");

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

        btnSalvar.setText("Salvar (saida)");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalvar);

        btnConversor.setText("Conversor RGB/HSL");
        btnConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversorActionPerformed(evt);
            }
        });
        jMenu1.add(btnConversor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operações 1º Bim");

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

        btnSaltPeper.setText("Salt-Peper");
        btnSaltPeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaltPeperActionPerformed(evt);
            }
        });
        jMenu2.add(btnSaltPeper);

        menuSobel.setText("FiltroSobel");

        btnBordasSobel.setText("Bordas Filtro Sobel");
        btnBordasSobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBordasSobelActionPerformed(evt);
            }
        });
        menuSobel.add(btnBordasSobel);

        btnbordasH.setText("Bordas Horizontais");
        btnbordasH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbordasHActionPerformed(evt);
            }
        });
        menuSobel.add(btnbordasH);

        btnBordasV.setText("Bordas Verticais");
        btnBordasV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBordasVActionPerformed(evt);
            }
        });
        menuSobel.add(btnBordasV);

        jMenu2.add(menuSobel);

        btnLaplace.setText("Mascara de Laplace");
        btnLaplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaplaceActionPerformed(evt);
            }
        });
        jMenu2.add(btnLaplace);

        btnCompressaoDinamica.setText("Compressão de Escala Dinâmica");
        btnCompressaoDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompressaoDinamicaActionPerformed(evt);
            }
        });
        jMenu2.add(btnCompressaoDinamica);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operações 2º Bim");

        btnPontoMinimo.setText("Filtro Ponto Mínimo");
        btnPontoMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoMinimoActionPerformed(evt);
            }
        });
        jMenu3.add(btnPontoMinimo);

        filtroPontoMax.setText("Filtro Ponto Máximo");
        filtroPontoMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroPontoMaxActionPerformed(evt);
            }
        });
        jMenu3.add(filtroPontoMax);

        btnPontoMedio.setText("Filtro Ponto Médio");
        btnPontoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoMedioActionPerformed(evt);
            }
        });
        jMenu3.add(btnPontoMedio);

        btnDCT.setText("DCT");
        btnDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDCTActionPerformed(evt);
            }
        });
        jMenu3.add(btnDCT);

        btnIDCT.setText("IDCT");
        btnIDCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDCTActionPerformed(evt);
            }
        });
        jMenu3.add(btnIDCT);

        btnColorizacao.setText("Colorização");
        btnColorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorizacaoActionPerformed(evt);
            }
        });
        jMenu3.add(btnColorizacao);

        btnEqualizacaoHSI.setText("Equalização por HSI");
        btnEqualizacaoHSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualizacaoHSIActionPerformed(evt);
            }
        });
        jMenu3.add(btnEqualizacaoHSI);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransfere, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRGB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSaida)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnTransfere))
                    .addComponent(painelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelX)
                            .addComponent(labelCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelY)
                            .addComponent(labelCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelPixel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCorPixel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelRGB))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void abrirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirImgActionPerformed
        //Pega caminho relativo da imagem aberta e redneriza na entrada
        
        JFileChooser fileChooser = new JFileChooser();
        int resposta = fileChooser.showOpenDialog(null);
        AberturaImg abertura = AberturaImg.getInstance();
        if (resposta == JFileChooser.APPROVE_OPTION)
           abertura.abreImg(fileChooser.getSelectedFile().getAbsoluteFile());
        
        this.imgEntrada = abertura.getImg();
        this.renderImgEntrada();
    }//GEN-LAST:event_abrirImgActionPerformed

    private void btnTransfereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfereActionPerformed
        //Transfere a imagem da saída para a entrada e renderiza a imagem
        
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
            this.imgSaida = FiltrosPrimeiroBim.equalizacaoHistograma(this.imgEntrada);
            aux.setImg(imgSaida);
            this.renderImgSaida();
            this.uiHistograma.setVisible(true);
        }       
    }//GEN-LAST:event_btnHistogramaActionPerformed

    private void btnNegativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativaActionPerformed
        //performa o algoritmo de negativar a imagem e renderiza no label de saída
        
        this.imgSaida = FiltrosPrimeiroBim.negativa(this.imgEntrada);
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
        
        this.imgSaida = MascarasPrimeiroBim.convolucaoGenerica(this.imgEntrada, mascara);
        this.renderImgSaida();
    }//GEN-LAST:event_btnMascaraMediaActionPerformed

    private void btnMascaraMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascaraMedianaActionPerformed
        //perfoma o algoritmo da máscara da madiana e renderiza na saída
        this.imgSaida = MascarasPrimeiroBim.mascaraMediana(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnMascaraMedianaActionPerformed

    private void btnTonsCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTonsCinzaActionPerformed
        //transforma a imgem em tons de cinza, salva na classe AberturaImg e renderiza no label de saída
        this.imgSaida = FiltrosPrimeiroBim.tonsCinza(this.imgEntrada);
        AberturaImg abertura = AberturaImg.getInstance();
        this.renderImgSaida();
    }//GEN-LAST:event_btnTonsCinzaActionPerformed

    private void btnBinarizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarizacaoActionPerformed
        //binariza a imagem e renderiza a saída no label de saída
        this.imgSaida = FiltrosPrimeiroBim.binarizacao(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnBinarizacaoActionPerformed

    private void btnLimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimiarActionPerformed
        
        UI_Limiarizacao ui = new UI_Limiarizacao(new javax.swing.JFrame(), true);
        ui.setVisible(true);
        
        int valor = ui.getInput();
        
        this.imgSaida = FiltrosPrimeiroBim.limiarizacao(this.imgEntrada, valor);
        this.renderImgSaida();
    }//GEN-LAST:event_btnLimiarActionPerformed

    private void btnConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversorActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UI_Conversor dialog = new UI_Conversor(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnConversorActionPerformed

    private void labelEntradaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEntradaMouseMoved
       
        if(this.imgEntrada != null)
        {
            int x = evt.getX();
            int y = evt.getY();
            if(x > this.imgEntrada.getWidth() || y > this.imgEntrada.getHeight())
            {
                this.labelCoordX.setText(String.valueOf(this.imgEntrada.getWidth()));
                this.labelCoordY.setText(String.valueOf(this.imgEntrada.getHeight()));
                this.labelCorPixel.setBackground(Color.BLACK);                
                this.labelRGB.setText("(0, 0, 0)");
                
            }
            else
            {
                this.labelCoordX.setText(String.valueOf(x));
                this.labelCoordY.setText(String.valueOf(y));
                
                int cor = this.imgEntrada.getRGB(x, y);
                Color rgb = new Color(cor);
                this.labelCorPixel.setBackground(rgb);                
                this.labelRGB.setText("(" + rgb.getRed()+ ", " + rgb.getGreen() + ", " + rgb.getBlue() + ")");
            }
        }
    }//GEN-LAST:event_labelEntradaMouseMoved

    private void btnSaltPeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaltPeperActionPerformed
        this.imgSaida = FiltrosPrimeiroBim.saltPeper(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnSaltPeperActionPerformed

    private void btnLaplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaplaceActionPerformed
        this.imgSaida = MascarasPrimeiroBim.mascaraLaplace(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnLaplaceActionPerformed

    private void btnBordasSobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBordasSobelActionPerformed
        this.imgSaida = MascarasPrimeiroBim.bordasFiltroSobel(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnBordasSobelActionPerformed

    private void btnbordasHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbordasHActionPerformed
        this.imgSaida = MascarasPrimeiroBim.filtroSobelHorizontal(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnbordasHActionPerformed

    private void btnBordasVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBordasVActionPerformed
        this.imgSaida = MascarasPrimeiroBim.filtroSobelVertical(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnBordasVActionPerformed

    private void btnCompressaoDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompressaoDinamicaActionPerformed
        UI_CompressaoDinamica ui = new UI_CompressaoDinamica(new javax.swing.JFrame(), true);
        ui.setVisible(true);
        
        float c = ui.getValorC();
        float gama = ui.getValorGama();
        
        this.imgSaida = FiltrosPrimeiroBim.escalaCompressaoDinamica(this.imgEntrada, gama, c);
        this.renderImgSaida();
    }//GEN-LAST:event_btnCompressaoDinamicaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        AberturaImg abertura = AberturaImg.getInstance();
        abertura.salvarImg(this.imgSaida);
        JOptionPane.showMessageDialog(this, "Imagem salva.");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPontoMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoMinimoActionPerformed
        this.imgSaida = FiltrosSegundoBim.filtroMinimo(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnPontoMinimoActionPerformed

    private void filtroPontoMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroPontoMaxActionPerformed
        this.imgSaida = FiltrosSegundoBim.filtroMaximo(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_filtroPontoMaxActionPerformed

    private void btnPontoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoMedioActionPerformed
        this.imgSaida = FiltrosSegundoBim.filtroPontoMedio(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnPontoMedioActionPerformed

    private void btnDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDCTActionPerformed
        
        this.imgSaida = FiltrosSegundoBim.DCT(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnDCTActionPerformed

    private void btnIDCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDCTActionPerformed
        this.imgSaida = FiltrosSegundoBim.IDCT();
        this.renderImgSaida();
    }//GEN-LAST:event_btnIDCTActionPerformed

    private void btnColorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorizacaoActionPerformed
        this.imgSaida = FiltrosSegundoBim.colorizacao(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnColorizacaoActionPerformed

    private void btnEqualizacaoHSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualizacaoHSIActionPerformed
        this.imgSaida = FiltrosSegundoBim.equelizacaoHSI(this.imgEntrada);
        this.renderImgSaida();
    }//GEN-LAST:event_btnEqualizacaoHSIActionPerformed
    
    private void renderImgEntrada()
    {
        //faz a renderização da imagem no label de entrada
        this.labelEntrada.setSize(this.imgEntrada.getWidth(), this.imgEntrada.getHeight());
        this.labelEntrada.setIcon(new ImageIcon(this.imgEntrada));
    }
    
    private void renderImgSaida()
    {
        //faz a renderização da imagem no label de saída
        this.labelSaida.setSize(this.imgSaida.getWidth(), this.imgSaida.getHeight());
        this.labelSaida.setIcon(new ImageIcon(this.imgSaida));
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
    private javax.swing.JMenuItem btnBordasSobel;
    private javax.swing.JMenuItem btnBordasV;
    private javax.swing.JMenuItem btnColorizacao;
    private javax.swing.JMenuItem btnCompressaoDinamica;
    private javax.swing.JMenuItem btnConversor;
    private javax.swing.JMenuItem btnDCT;
    private javax.swing.JMenuItem btnEqualizacaoHSI;
    private javax.swing.JMenuItem btnHistograma;
    private javax.swing.JMenuItem btnIDCT;
    private javax.swing.JMenuItem btnLaplace;
    private javax.swing.JMenuItem btnLimiar;
    private javax.swing.JMenuItem btnMascaraMedia;
    private javax.swing.JMenuItem btnMascaraMediana;
    private javax.swing.JMenuItem btnNegativa;
    private javax.swing.JMenuItem btnPontoMedio;
    private javax.swing.JMenuItem btnPontoMinimo;
    private javax.swing.JMenuItem btnSaltPeper;
    private javax.swing.JMenuItem btnSalvar;
    private javax.swing.JMenuItem btnSepararCanais;
    private javax.swing.JMenuItem btnTonsCinza;
    private javax.swing.JButton btnTransfere;
    private javax.swing.JMenuItem btnbordasH;
    private javax.swing.JMenuItem filtroPontoMax;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelCoordX;
    private javax.swing.JLabel labelCoordY;
    private javax.swing.JLabel labelCorPixel;
    private javax.swing.JLabel labelEntrada;
    private javax.swing.JLabel labelPixel;
    private javax.swing.JLabel labelRGB;
    private javax.swing.JLabel labelSaida;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelY;
    private javax.swing.JMenu menuSobel;
    private javax.swing.JScrollPane painelEntrada;
    private javax.swing.JScrollPane painelSaida;
    // End of variables declaration//GEN-END:variables
}
