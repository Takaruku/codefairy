/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefairies;

import java.util.Random;

/**
 *
 * @author James
 */
public class cookie extends variables {
    
    private boolean inBag;

    public cookie(int x, int y, int team) {
        super(x, y, team);
    }
    
    public void cookieDistribution(int number) {//allows user to decide how many cookies to distribute
        cookie onGround[] = new cookie[number];
        int looping = 0;
        Random rand = new Random();

        while (looping < number) {
            int x = rand.nextInt(World.getXDim()) + 1;
            int y = rand.nextInt(World.getYDim()) + 1;
            onGround[looping].setxLocation(x);
            onGround[looping].setyLocation(y);
            onGround[looping].setInBag(false);
            looping++;
        }
    }

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
