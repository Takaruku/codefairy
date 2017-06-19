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
import java.util.Random;

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
    public User[] users = new User[5];
    int count = 0;
    int imageSize = 60;
    int rdTimer = 0;
    theRD destroyer = new theRD();
    variables vinnieMadeMeMakeThis;
    /**
     * Creates new form GamePanel
     */
    public GamePanel(JPanel jPanel1) {
        initComponents();
        this.setFocusable(true);
        parent = jPanel1;// tells panel that controls this one
        //create and start a Timer for animation
        animTimer = new Timer(1000, new AnimTimerTick());
        animTimer.start();

        teacher = teacher.getScaledInstance(imageSize, imageSize, 10);
        student = student.getScaledInstance(imageSize, imageSize, 10);
        fairies = fairies.getScaledInstance(imageSize, imageSize, 10);
        school = school.getScaledInstance(imageSize, imageSize, 10);
        rd = rd.getScaledInstance(imageSize * 2, imageSize * 2, 10);
        //check if school draws
        World.setNumPlayers(4);
        for (int i = 1; i < 5; i++) {
            users[i] = new User(i);
        }
        World.setup(users);

//        World.addToList(new student(5, 3, 1));
        World.addToList(new school(5, 6, 1));

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(space2, 0, 0, this);
        if (rdTimer == 10) {
            Random rand = new Random();
            int x = rand.nextInt(World.getXDim()) + 1;
            int y = rand.nextInt(World.getYDim()) + 1;
            if (!World.checkSpace(x, y + 1, 'u').equals("nothing")) {
            World.deleteFromSpace(x, y);
            g.drawImage(rd, x, y, this);//to show rd claiming his victims
            }
            rdTimer = 0;
        }
        //   g.drawImage(rd, 5, 10, this);
        variables temp[][] = World.getWorldSpace();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                //loops through array of images and draws
                if (temp[i][j] instanceof student) {
                    g.drawImage(student, imageSize * i, imageSize * j, this);
                } else if (temp[i][j] instanceof school) {
                    g.drawImage(school, imageSize * i, imageSize * j, this);
                } else if (temp[i][j] instanceof fairy) {
                    g.drawImage(fairies, imageSize * i, imageSize * j, this);
                } else if (temp[i][j] instanceof teacher) {
                    g.drawImage(teacher, imageSize * i, imageSize * j, this);
                } else {
//                    g.drawImage(teacher, imageSize * i, imageSize * j, this);
                }
            }
        }
    }

    public void turn() {

        if (count == World.getNumPlayers()) {
            count = 1;
            for (variables var : World.getStudentList(-1)) {
                var.refresh();
//                System.out.println("Student found");
            }
            for (variables var : World.getTeacherList(-1)) {
                var.refresh();
            }
            for (variables var : World.getSchoolList(-1)) {
                var.schooltimerspawn();
            }

            for (variables var : World.getFairyList(-1)) {
                var.refresh();
            }
            for (variables var : World.getCookieList(-1)) {
                var.refresh();
            }
        } else {
            count++;
        }
//        System.out.println(count);
        users[count].ai();
        rdTimer++;
        // add exit condition when only one user remains
     
        if (){
        World.setgameend(true);
    }
        
    }

    private class AnimTimerTick implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            if (World.getgamestart()) {
                turn();
            }
            repaint();
        }
    }

    public User[] getUsers() {
        return users;
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
