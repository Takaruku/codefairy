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
    public void school (int x, int y, int team){
        setHealth(10);
        setIntact(true);
        variables (x, y, team);
    }
    private boolean intact;
   //add methods for obtaining a new school
    /**
     * @return the intact
     */
    public boolean isIntact() {
        return intact;
    }

    /**
     * @param intact the intact to set
     */
    public void setIntact(boolean intact) {
        this.intact = intact;
    }
}
