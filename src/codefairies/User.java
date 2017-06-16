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
public class User {
   // <editor-fold defaultstate="collapsed" desc="Does this work?">
     String name;
    int idnum;
  // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ArrayList Variables">
    ArrayList<student> students = new ArrayList();
    ArrayList<teacher> teachers = new ArrayList();
    ArrayList<fairy> fairy = new ArrayList();
    ArrayList<cookie> cookies = new ArrayList();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="RD is GREAT">
    // make array lists for students, teacher, fairy, cookie
    public User() {

    }
    // spawn schools and other stuff by using add method in world
    //blarg
    //blargblarg
    //blargblargblarg
    //blargblargblargblarg
    //blargblargblargblargblarg
    public void  spawnSchool ( int x, int y){
        World.addToList(new school( x,  y,  idnum));
    }
    
     public void  spawnTeacher (int x, int y ){
        World.addToList(new teacher(x,  y));
    }
     
      public void  spawnFairy ( int x, int y){
         World.addToList(new fairy(x,  y,  idnum, "N/A"));
    }
      
         public void  spawnCookie ( int x, int y){
               World.addToList(new cookie(x,  y,  idnum));
         }
          // </editor-fold>
}
