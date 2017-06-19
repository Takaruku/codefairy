package codefairies;

import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author James
 */
public class variables {

    private int xLocation;
    private int yLocation;
    private int health;
    private int alliegance; //each team gets assigned their own number
    private boolean alive;
    private boolean fighter;
     boolean didaction;

    public variables(int x, int y, int team) {

        setxLocation(x);
        setyLocation(y);
        setAlliegance(team);
        didaction = false;
    }

    /**
     * @return the xLocation
     */
    public int getxLocation() {
        return xLocation;
    }

    /**
     * @param xLocation the xLocation to set
     */
    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    /**
     * @return the yLocation
     */
    public int getyLocation() {
        return yLocation;
    }

    /**
     * @param yLocation the yLocation to set
     */
    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
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
        //run this code continually during battles
        if (health == 0) {
            setAlive(false);//starts the chain of code that leads to the death of the object
        }
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
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * kills objects if there health runs out
     */
    public void death() {
        World.deleteFromSpace(xLocation, yLocation, this);
        //removes it if it dies FOREVER
    }

    /**
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
        if (alive == false) {
            death();
        }//can i put this code in here
    }

    public void exhaust() {

        didaction = true;
    }

    public void refresh() {

        didaction = false;
    }

    public void moveDown() {
        if (!didaction) {
            if (World.checkSpace(xLocation, yLocation, 'u').equals("nothing")) {
                setyLocation(yLocation + 1);
                World.addToSpace(xLocation, yLocation, this);
                World.deleteFromSpace(xLocation, yLocation - 1, this);
            }
            didaction = true;
        }
    }

    public void moveUp() {
        if (!didaction) {
            if (World.checkSpace(xLocation, yLocation, 'd').equals("nothing")) {
                setyLocation(yLocation - 1);
                World.addToSpace(xLocation, yLocation, this);
                World.deleteFromSpace(xLocation, yLocation + 1, this);
            }
            didaction = true;
        }
    }

    public void moveRight() {
        if (!didaction) {

            if (World.checkSpace(xLocation, yLocation, 'r').equals("nothing")) {
                setxLocation(xLocation + 1);
                World.addToSpace(xLocation, yLocation, this);
                World.deleteFromSpace(xLocation - 1, yLocation, this);
            }
            didaction = true;
        }
    }

    public void moveLeft() {
        if (!didaction) {

            if (World.checkSpace(xLocation, yLocation, 'l').equals("nothing")) {
                setxLocation(xLocation - 1);
                World.addToSpace(xLocation, yLocation, this);
                World.deleteFromSpace(xLocation + 1, yLocation, this);
            }
            didaction = true;
        }
    }

    /**
     * @return the canFight
     */
    public boolean isFighter() {
        return fighter;
    }

    /**
     * @param canFight the canFight to set
     */
    public void setFighter(boolean canFight) {
        this.fighter = canFight;
    }

}
