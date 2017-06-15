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
    
    //set this variable to false when picked up so it can't be picked up again
    //if the carrier dies it, the location changes to where the carrier died, and variable becomes true again

    //add methods for distributing used cookies (because they are used to buy schools)
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

}
