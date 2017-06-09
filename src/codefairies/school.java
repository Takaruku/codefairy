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
public class school {
    private int location;
    //this variable should never change
    private int alliegance; //each time is assigned a certain number
    private int health;
    private boolean intact;

    /**
     * @return the location
     */
    public int getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(int location) {
        this.location = location;
    }

    /**
     * @return the alliegance
     */
    public int getAlliegance() {
        return alliegance;
    }

    /**
     * @param alliegance the alliegance to set
     */
    public void setAlliegance(int alliegance) {
        this.alliegance = alliegance;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

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
