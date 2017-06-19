/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class User { // Vincenzo wrote this method, it's moderately buggy?

    // <editor-fold defaultstate="collapsed" desc="Does this work?">
    String name;
    int idnum;
    // </editor-fold>

    public User(int idnum) {

        this.idnum = idnum;
    }

    // <editor-fold defaultstate="collapsed" desc="ArrayList Variables">
    ArrayList<student> students = new ArrayList();
    ArrayList<teacher> teachers = new ArrayList();
    ArrayList<fairy> fairies = new ArrayList();
    ArrayList<cookie> cookies = new ArrayList();
    // </editor-fold>

    public User() {

    }

    public void ai() {
        if (idnum == 1) {
            ai1();
        } else if (idnum == 2) {
            ai2();
        } else if (idnum == 3) {
            ai3();
        } else if (idnum == 4) {
            ai4();
        }
    }

    public void addstudent(student hold) {
        students.add(hold);
    }

    public void addfairy(fairy hold) {
        fairies.add(hold);
    }

    public void addcookie(cookie hold) {
        cookies.add(hold);
    }

    public void ai1() {
//        System.out.println("ai1");
        for (student student1 : students) {
            student1.moveUp();
            System.out.println();
        }
        for (fairy blarg : fairies) {
            blarg.moveUp();
         
        }
    }

    public void ai2() {
//        System.out.println("ai2");

    }

    public void ai3() {
//        System.out.println("ai3");
    }

    public void ai4() {
//        System.out.println("ai4");
    }

}
