/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author mathe
 */
public class JPanelFacil extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;

    PecaTabuleiro ptSel1;
    PecaTabuleiro ptSel2;
    int pecasSelecionadas = 0;

    public void mostrarTabuleiro(boolean inicioJogo) {
        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;

        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"));

        if (inicioJogo || pctb[0][0].isVirado()) {
            idImg = pctb[0][0].getIdImagem();
            ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg00()).setIcon(img00);
        } else {
            (getLblImg00()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][1].isVirado()) {
            idImg = pctb[0][1].getIdImagem();
            ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg01()).setIcon(img01);
        } else {
            (getLblImg01()).setIcon(imgDuvida);
        }
        if (!inicioJogo || pctb[0][2].isVirado()) {
            idImg = pctb[0][2].getIdImagem();
            ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg02()).setIcon(img02);
        } else {
            (getLblImg02()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[0][3].isVirado()) {
            idImg = pctb[0][3].getIdImagem();
            ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg03()).setIcon(img03);
        } else {
            (getLblImg03()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[1][0].isVirado()) {
            idImg = pctb[1][0].getIdImagem();
            ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg10()).setIcon(img10);
        } else {
            (getLblImg10()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[1][1].isVirado()) {
            idImg = pctb[1][1].getIdImagem();
            ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg11()).setIcon(img11);
        } else {
            (getLblImg11()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[1][2].isVirado()) {
            idImg = pctb[1][2].getIdImagem();
            ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg12()).setIcon(img12);
        } else {
            (getLblImg12()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[1][3].isVirado()) {
            idImg = pctb[1][3].getIdImagem();
            ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg13()).setIcon(img13);
        } else {
            (getLblImg13()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[2][0].isVirado()) {
            idImg = pctb[2][0].getIdImagem();
            ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg20()).setIcon(img20);
        } else {
            (getLblImg20()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[2][1].isVirado()) {
            idImg = pctb[2][1].getIdImagem();
            ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg21()).setIcon(img21);
        } else {
            (getLblImg21()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[2][2].isVirado()) {
            idImg = pctb[2][2].getIdImagem();
            ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg22()).setIcon(img22);
        } else {
            (getLblImg22()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[2][3].isVirado()) {
            idImg = pctb[2][3].getIdImagem();
            ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg23()).setIcon(img23);
        } else {
            (getLblImg23()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[3][0].isVirado()) {
            idImg = pctb[3][0].getIdImagem();
            ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg30()).setIcon(img30);
        } else {
            (getLblImg30()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[3][1].isVirado()) {
            idImg = pctb[3][1].getIdImagem();
            ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg31()).setIcon(img31);
        } else {
            (getLblImg31()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[3][2].isVirado()) {
            idImg = pctb[3][2].getIdImagem();
            ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg32()).setIcon(img32);
        } else {
            (getLblImg32()).setIcon(imgDuvida);
        }

        if (!inicioJogo || pctb[3][3].isVirado()) {
            idImg = pctb[3][3].getIdImagem();
            ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLblImg33()).setIcon(img33);
        } else {
            (getLblImg33()).setIcon(imgDuvida);
        }
    }

    private void tentarJogada(int linha, int coluna, JLabel rotuloImagem) {
        PecaTabuleiro pt[][] = controle.getTabuleiro();

        int idImg = pt[linha][coluna].getIdImagem();
        ImageIcon img = new ImageIcon(getClass().getResource("/jogomemoria/gui/imagens/jm" + idImg + ".jpg"));
        rotuloImagem.setIcon(img);

        if (pecasSelecionadas == 0) {
            ptSel1 = pt[linha][coluna];
            pecasSelecionadas++;
        } else if (pecasSelecionadas == 1) {
            ptSel2 = pt[linha][coluna];
            int result = controle.realizarJogada(ptSel1, ptSel2);
            if (result == controle.JOGADA_CERTA) {
        
                JOptionPane.showMessageDialog(this, "Muito Bem!!!", "Resultado da Jogada", JOptionPane.INFORMATION_MESSAGE);
                
            } else if (result == controle.JOGADA_ERRADA) {
     
                JOptionPane.showMessageDialog(this, "Isso não vale!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
                
            } else if (result == controle.JOGADA_INVALIDA) {

                JOptionPane.showMessageDialog(this, "Voce errou. Tente novamente", "Resultado da jogada", JOptionPane.ERROR_MESSAGE);
            }
            pecasSelecionadas = 0;
            mostrarTabuleiro(false);
        }
    }

    public javax.swing.JLabel getLblImg00() {
        return lblImg00;
    }

    /**
     * @param lblImg00 the lblImg00 to set
     */
    public void setLblImg00(javax.swing.JLabel lblImg00) {
        this.lblImg00 = lblImg00;
    }

    /**
     * @return the lblImg01
     */
    public javax.swing.JLabel getLblImg01() {
        return lblImg01;
    }

    /**
     * @param lblImg01 the lblImg01 to set
     */
    public void setLblImg01(javax.swing.JLabel lblImg01) {
        this.lblImg01 = lblImg01;
    }

    /**
     * @return the lblImg02
     */
    public javax.swing.JLabel getLblImg02() {
        return lblImg02;
    }

    /**
     * @param lblImg02 the lblImg02 to set
     */
    public void setLblImg02(javax.swing.JLabel lblImg02) {
        this.lblImg02 = lblImg02;
    }

    /**
     * @return the lblImg03
     */
    public javax.swing.JLabel getLblImg03() {
        return lblImg03;
    }

    /**
     * @param lblImg03 the lblImg03 to set
     */
    public void setLblImg03(javax.swing.JLabel lblImg03) {
        this.lblImg03 = lblImg03;
    }

    /**
     * @return the lblImg10
     */
    public javax.swing.JLabel getLblImg10() {
        return lblImg10;
    }

    /**
     * @param lblImg10 the lblImg10 to set
     */
    public void setLblImg10(javax.swing.JLabel lblImg10) {
        this.lblImg10 = lblImg10;
    }

    /**
     * @return the lblImg11
     */
    public javax.swing.JLabel getLblImg11() {
        return lblImg11;
    }

    /**
     * @param lblImg11 the lblImg11 to set
     */
    public void setLblImg11(javax.swing.JLabel lblImg11) {
        this.lblImg11 = lblImg11;
    }

    /**
     * @return the lblImg12
     */
    public javax.swing.JLabel getLblImg12() {
        return lblImg12;
    }

    /**
     * @param lblImg12 the lblImg12 to set
     */
    public void setLblImg12(javax.swing.JLabel lblImg12) {
        this.lblImg12 = lblImg12;
    }

    /**
     * @return the lblImg13
     */
    public javax.swing.JLabel getLblImg13() {
        return lblImg13;
    }

    /**
     * @param lblImg13 the lblImg13 to set
     */
    public void setLblImg13(javax.swing.JLabel lblImg13) {
        this.lblImg13 = lblImg13;
    }

    /**
     * @return the lblImg20
     */
    public javax.swing.JLabel getLblImg20() {
        return lblImg20;
    }

    /**
     * @param lblImg20 the lblImg20 to set
     */
    public void setLblImg20(javax.swing.JLabel lblImg20) {
        this.lblImg20 = lblImg20;
    }

    /**
     * @return the lblImg21
     */
    public javax.swing.JLabel getLblImg21() {
        return lblImg21;
    }

    /**
     * @param lblImg21 the lblImg21 to set
     */
    public void setLblImg21(javax.swing.JLabel lblImg21) {
        this.lblImg21 = lblImg21;
    }

    /**
     * @return the lblImg22
     */
    public javax.swing.JLabel getLblImg22() {
        return lblImg22;
    }

    /**
     * @param lblImg22 the lblImg22 to set
     */
    public void setLblImg22(javax.swing.JLabel lblImg22) {
        this.lblImg22 = lblImg22;
    }

    /**
     * @return the lblImg23
     */
    public javax.swing.JLabel getLblImg23() {
        return lblImg23;
    }

    /**
     * @param lblImg23 the lblImg23 to set
     */
    public void setLblImg23(javax.swing.JLabel lblImg23) {
        this.lblImg23 = lblImg23;
    }

    /**
     * @return the lblImg30
     */
    public javax.swing.JLabel getLblImg30() {
        return lblImg30;
    }

    /**
     * @param lblImg30 the lblImg30 to set
     */
    public void setLblImg30(javax.swing.JLabel lblImg30) {
        this.lblImg30 = lblImg30;
    }

    /**
     * @return the lblImg31
     */
    public javax.swing.JLabel getLblImg31() {
        return lblImg31;
    }

    /**
     * @param lblImg31 the lblImg31 to set
     */
    public void setLblImg31(javax.swing.JLabel lblImg31) {
        this.lblImg31 = lblImg31;
    }

    /**
     * @return the lblImg32
     */
    public javax.swing.JLabel getLblImg32() {
        return lblImg32;
    }

    /**
     * @param lblImg32 the lblImg32 to set
     */
    public void setLblImg32(javax.swing.JLabel lblImg32) {
        this.lblImg32 = lblImg32;
    }

    /**
     * @return the lblImg33
     */
    public javax.swing.JLabel getLblImg33() {
        return lblImg33;
    }

    /**
     * @param lblImg33 the lblImg33 to set
     */
    public void setLblImg33(javax.swing.JLabel lblImg33) {
        this.lblImg33 = lblImg33;
    }

    /**
     * Creates new form JPanelIniciante
     */
    public JPanelFacil(JogoMemoriaCtrl ctrl) {

        initComponents();
        controle = ctrl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImg00 = new javax.swing.JLabel();
        lblImg01 = new javax.swing.JLabel();
        lblImg02 = new javax.swing.JLabel();
        lblImg03 = new javax.swing.JLabel();
        lblImg10 = new javax.swing.JLabel();
        lblImg11 = new javax.swing.JLabel();
        lblImg12 = new javax.swing.JLabel();
        lblImg13 = new javax.swing.JLabel();
        lblImg20 = new javax.swing.JLabel();
        lblImg21 = new javax.swing.JLabel();
        lblImg22 = new javax.swing.JLabel();
        lblImg23 = new javax.swing.JLabel();
        lblImg30 = new javax.swing.JLabel();
        lblImg31 = new javax.swing.JLabel();
        lblImg32 = new javax.swing.JLabel();
        lblImg33 = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(4, 4));

        lblImg00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg00MouseClicked(evt);
            }
        });
        add(lblImg00);

        lblImg01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg01MouseClicked(evt);
            }
        });
        add(lblImg01);

        lblImg02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg02MouseClicked(evt);
            }
        });
        add(lblImg02);

        lblImg03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg03MouseClicked(evt);
            }
        });
        add(lblImg03);

        lblImg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg10MouseClicked(evt);
            }
        });
        add(lblImg10);

        lblImg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg11MouseClicked(evt);
            }
        });
        add(lblImg11);

        lblImg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg12MouseClicked(evt);
            }
        });
        add(lblImg12);

        lblImg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg13MouseClicked(evt);
            }
        });
        add(lblImg13);

        lblImg20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg20MouseClicked(evt);
            }
        });
        add(lblImg20);

        lblImg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg21MouseClicked(evt);
            }
        });
        add(lblImg21);

        lblImg22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg22MouseClicked(evt);
            }
        });
        add(lblImg22);

        lblImg23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg23MouseClicked(evt);
            }
        });
        add(lblImg23);

        lblImg30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg30MouseClicked(evt);
            }
        });
        add(lblImg30);

        lblImg31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg31.setToolTipText("");
        lblImg31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg31MouseClicked(evt);
            }
        });
        add(lblImg31);

        lblImg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg32MouseClicked(evt);
            }
        });
        add(lblImg32);

        lblImg33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/Virada.jpg"))); // NOI18N
        lblImg33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg33MouseClicked(evt);
            }
        });
        add(lblImg33);
    }// </editor-fold>//GEN-END:initComponents

    private void lblImg32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg32MouseClicked
        tentarJogada(3, 2, lblImg32);
    }//GEN-LAST:event_lblImg32MouseClicked

    private void lblImg00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg00MouseClicked
        tentarJogada(0, 0, lblImg00);        // TODO add your handling code here:
    }//GEN-LAST:event_lblImg00MouseClicked

    private void lblImg01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg01MouseClicked
        tentarJogada(0, 1, lblImg01);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg01MouseClicked

    private void lblImg21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg21MouseClicked
        tentarJogada(2, 1, lblImg21);     // TODO add your handling code here:
    }//GEN-LAST:event_lblImg21MouseClicked

    private void lblImg12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg12MouseClicked
        tentarJogada(1, 2, lblImg12);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg12MouseClicked

    private void lblImg02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg02MouseClicked
        tentarJogada(0, 2, lblImg02);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg02MouseClicked

    private void lblImg13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg13MouseClicked
        tentarJogada(1, 3, lblImg13);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg13MouseClicked

    private void lblImg23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg23MouseClicked
        tentarJogada(2, 3, lblImg23);   // TODO add your handling code here:
    }//GEN-LAST:event_lblImg23MouseClicked

    private void lblImg03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg03MouseClicked
        tentarJogada(0, 3, lblImg03);   // TODO add your handling code here:
    }//GEN-LAST:event_lblImg03MouseClicked

    private void lblImg10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg10MouseClicked
        tentarJogada(1, 0, lblImg10);   // TODO add your handling code here:
    }//GEN-LAST:event_lblImg10MouseClicked

    private void lblImg33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg33MouseClicked
        tentarJogada(3, 3, lblImg33);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg33MouseClicked

    private void lblImg22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg22MouseClicked
        tentarJogada(2, 2, lblImg22);   // TODO add your handling code here:
    }//GEN-LAST:event_lblImg22MouseClicked

    private void lblImg11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg11MouseClicked
        tentarJogada(1, 1, lblImg11);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg11MouseClicked

    private void lblImg20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg20MouseClicked
        tentarJogada(2, 0, lblImg20);    // TODO add your handling code here:
    }//GEN-LAST:event_lblImg20MouseClicked

    private void lblImg30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg30MouseClicked
        tentarJogada(3, 0, lblImg30);   // TODO add your handling code here:
    }//GEN-LAST:event_lblImg30MouseClicked

    private void lblImg31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg31MouseClicked
        tentarJogada(3, 1, lblImg31);  // TODO add your handling code here:
    }//GEN-LAST:event_lblImg31MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg00;
    private javax.swing.JLabel lblImg01;
    private javax.swing.JLabel lblImg02;
    private javax.swing.JLabel lblImg03;
    private javax.swing.JLabel lblImg10;
    private javax.swing.JLabel lblImg11;
    private javax.swing.JLabel lblImg12;
    private javax.swing.JLabel lblImg13;
    private javax.swing.JLabel lblImg20;
    private javax.swing.JLabel lblImg21;
    private javax.swing.JLabel lblImg22;
    private javax.swing.JLabel lblImg23;
    private javax.swing.JLabel lblImg30;
    private javax.swing.JLabel lblImg31;
    private javax.swing.JLabel lblImg32;
    private javax.swing.JLabel lblImg33;
    // End of variables declaration//GEN-END:variables
}
