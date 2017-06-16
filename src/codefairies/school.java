/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

/**
 *
 * @author James
 */
public class school extends variables {

    public school(int x, int y, int team) {
        super(x, y, team);
        setHealth(10);
        //setIntact(true);we dont actually need this, once it is gone it is gone

    }

    //private boolean intact;
    //add methods for obtaining a new school
    public void underAttack(Object attacker) {
        //use this for the castle to take damage
    }

    /**
     * @return the intact
     */
    //public boolean isIntact() {
    //   return intact;
    //}
    /**
     * @param intact the intact to set
     */
    // public void setIntact(boolean intact) {
    //    this.intact = intact;
    //}
}
