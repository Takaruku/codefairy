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
public class cookie extends variables{

    //create an array of them when starting the game
    //scatter them to random positions    
    private boolean inBag;
    private boolean onGround;
    //set this variable to false when picked up so it can't be picked up again
    //if the carrier dies it, the location changes to where the carrier died, and variable becomes true again



    /**
     * @return the inBag
     */
    public boolean isInBag() {
        return inBag;
    }

    /**
     * @param inBag the inBag to set
     */
    public void setInBag(boolean inBag) {
        this.inBag = inBag;
    }

    /**
     * @return the onGround
     */
    public boolean isOnGround() {
        return onGround;
    }

    /**
     * @param onGround the onGround to set
     */
    public void setOnGround(boolean onGround) {
        this.onGround = onGround;
    }
}
