/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author 070021183
 */
public class IntroPanel extends javax.swing.JPanel {

    JPanel parent = null;
    Image intro = Toolkit.getDefaultToolkit().getImage("space.jpg");

    /**
     * Creates new form GameJPanel
     *
     * @param jPanel1
     */
   public IntroPanel(JPanel jPanel1) {
        initComponents();
        parent = jPanel1;
    }

   
   

    

  //  public IntroPanel() {
    //    initComponents();

   // }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(intro, 0, 0, this);
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.ITALIC, 50));
        g.drawString("Welcome to Code Fairies!", 300, 200);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Startbutton = new javax.swing.JButton();

        Startbutton.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Startbutton.setText("Start");
        Startbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartbuttonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(275, 275, 275)
                .add(Startbutton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 261, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(572, Short.MAX_VALUE)
                .add(Startbutton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartbuttonActionPerformed
        CardLayout cl = (CardLayout) parent.getLayout();
        cl.show(parent, "game");
    }//GEN-LAST:event_StartbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Startbutton;
    // End of variables declaration//GEN-END:variables
}
