/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author 070021183
 */
public class GamePanel extends javax.swing.JPanel {
 JPanel myParent;
 
 
    Image teacher = Toolkit.getDefaultToolkit().getImage("game-background-p7-4-x.jpg");
    Image student = Toolkit.getDefaultToolkit().getImage("Monster-free-to-use-clip-art.png");
    Image fairies = Toolkit.getDefaultToolkit().getImage("165-Ninja-Avatar-Character-With-Ninja-Stars-And-A-Sword-Free-Vector-Clipart-Illustration.png");
    Image m = Toolkit.getDefaultToolkit().getImage("150-Free-Vector-Clipart-Illustration-Of-Green-Alien-Avatar-Character.png");
    Image weapon = Toolkit.getDefaultToolkit().getImage("ninja-shirken-star-clip-art-at-clker-com-vector-clip-art-online-teIGX6-clipart.png");
    /**
     * Creates new form GamePanel
     */
    public GamePanel(JPanel p) {
        initComponents();
          myParent = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
