/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author 070021183
 */
public class GamePanel extends javax.swing.JPanel {

    JPanel parent;
    Timer animTimer;
    Image space2 = Toolkit.getDefaultToolkit().getImage("src\\space2.jpg");
    Image teacher = Toolkit.getDefaultToolkit().getImage("src\\evilteacher.png");
    Image student = Toolkit.getDefaultToolkit().getImage("src\\student.png");
    Image fairies = Toolkit.getDefaultToolkit().getImage("src\\fairy.png");
    Image school = Toolkit.getDefaultToolkit().getImage("src\\school.png");
    Image rd = Toolkit.getDefaultToolkit().getImage("src\\rdhead.png");

    /**
     * Creates new form GamePanel
     */
    public GamePanel(JPanel jPanel1) {
        initComponents();
        this.setFocusable(true);
        parent = jPanel1;// tells panel that controls this one
        //create and start a Timer for animation
        animTimer = new Timer(50, new AnimTimerTick());
        animTimer.start();

        teacher = teacher.getScaledInstance(60, 60, 10);
        student = student.getScaledInstance(60, 60, 10);
        fairies = fairies.getScaledInstance(60, 60, 10);
        school = school.getScaledInstance(60, 60, 10);
        rd = rd.getScaledInstance(100, 100, 100);
        //check if school draws
        World.addToList(new school(5, 5, 0));
        World.addToList(new school(15,15, 0));
       
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(space2, 0, 0, this);
        g.drawImage(rd, 5, 10, this);
        variables temp[][] = World.getWorldSpace();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                //loops through array of images and draws
                if (temp[i][j] instanceof student) {
                    g.drawImage(student, 10 * i, 10 * j, this);
                } else if (temp[i][j] instanceof school) {
                    g.drawImage(school, 10 * i, 10 * j, this);
                } else if (temp[i][j] instanceof fairy) {
                    g.drawImage(fairies, 10 * i, 10 * j, this);
                } else if (temp[i][j] instanceof teacher) {
                    g.drawImage(teacher, 10 * i, 10 * j, this);
                }
            }
        }
    }

    private class AnimTimerTick implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            repaint();
        }
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
