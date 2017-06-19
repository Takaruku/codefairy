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

    private int count;
    private int xLocation;
    private int yLocation;
    private int health;
    private int alliegance; //each team gets assigned their own number
    private boolean alive;
    private boolean fighter;
    private boolean didaction;

    public variables(int x, int y, int team) {

        setxLocation(x);
        setyLocation(y);
        setAlliegance(team);
        didaction = false;
        count = 0;
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

    public boolean didaction() {
        return didaction;
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
        World.deleteFromSpace(xLocation, yLocation);
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

    public void moveUp() {
        if (didaction == false) {
            if (World.checkSpace(xLocation, yLocation, 'u').equals("nothing")) {
                setyLocation(yLocation - 1);
                if (World.addToSpace(xLocation, yLocation, this)) {
                    World.deleteFromSpace(xLocation, yLocation + 1);
                    didaction = true;
                }

            }

        }
    }

    public void moveDown() {
        try {
            if (didaction == false) {
//                System.out.println(World.checkSpace(xLocation, yLocation, 'd'));
                if (World.checkSpace(xLocation, yLocation, 'd').equals("nothing")) {
                    setyLocation(yLocation + 1);
                    if (World.addToSpace(xLocation, yLocation, this)) {
                        World.deleteFromSpace(xLocation, yLocation - 1);
                        didaction = true;
                    }

                } else {
//                    System.out.println("There is something here");
                }

            }
        } catch (Exception e) {
        }

    }

    public void moveRight() {
        try {
            if (didaction == false) {

                if (World.checkSpace(xLocation, yLocation, 'r').equals("nothing")) {
                    setxLocation(xLocation + 1);
                    if (World.addToSpace(xLocation, yLocation, this)) {
                        World.deleteFromSpace(xLocation - 1, yLocation);
                        didaction = true;
                    }

                }

            }
        } catch (Exception e) {
        }

    }

    public void moveLeft() {
        try {
            if (didaction == false) {

                if (World.checkSpace(xLocation, yLocation, 'l').equals("nothing")) {
                    setxLocation(xLocation - 1);

                    if (World.addToSpace(xLocation, yLocation, this)) {
                        World.deleteFromSpace(xLocation + 1, yLocation);
                        didaction = true;
                    }
                }

            }
        } catch (Exception e) {
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

    public void schooltimerspawn() {
        if (this instanceof school) {
            count++;
            System.out.println(count);
            if (count == 5) {
                fairy hold;
                if (World.checkSpace(getxLocation(), getyLocation(), 'u').equals("nothing")) {
                    hold = new fairy(getxLocation(), getyLocation() - 1, getAlliegance(), "Spawn");
                    World.addToList(hold);
                }
                count = 0;
            }

        }
    }

    public boolean hasNeighbour() {
        boolean hold = false;
        if (!World.checkSpace(getxLocation(), getyLocation(), 'u').equals("nothing")) {
            hold = true;
        } else if (!World.checkSpace(getxLocation(), getyLocation(), 'd').equals("nothing")) {
            hold = true;
        } else if (!World.checkSpace(getxLocation(), getyLocation(), 'l').equals("nothing")) {
            hold = true;
        } else if (!World.checkSpace(getxLocation(), getyLocation(), 'r').equals("nothing")) {
            hold = true;
        }

        return hold;
    }

    public char whereNeighbour() {
        char hold = ' ';
        if (!World.checkSpace(getxLocation(), getyLocation(), 'u').equals("nothing")) {
            hold = 'u';
        } else if (!World.checkSpace(getxLocation(), getyLocation(), 'd').equals("nothing")) {
            hold = 'd';
        } else if (!World.checkSpace(getxLocation(), getyLocation(), 'l').equals("nothing")) {
            hold = 'l';
        } else if (!World.checkSpace(getxLocation(), getyLocation(), 'r').equals("nothing")) {
            hold = 'r';
        }
        return hold;
    }

    public void dealDamage(variables a, variables b) {
        if (fighter) {

            boolean beside = findNeighbour(a, b);
            boolean sameTeam = false;
            if (a.getAlliegance() == b.getAlliegance()) {
                sameTeam = true;
            }
            if (beside && sameTeam == false) {
                int damage = -1;
                if (a.isFighter() == true) {
                    if (b.isFighter() == true) {
                        a.setHealth(a.getHealth() + damage);
                        b.setHealth(b.getHealth() + damage);
                    } else {
                        b.setHealth(b.getHealth() + damage);
                    }
                } else if (b.isFighter() == true) {
                    a.setHealth(a.getHealth() + damage);
                }
            }
            a.exhaust();
        }

    }

    public boolean findNeighbour(variables a, variables b) {//each object that moves should run this code every round
        //if it is a fighter, then it can run the above code
        if (a.getxLocation() == b.getxLocation() - 1 || a.getxLocation() == b.getxLocation() + 1) {
            return true;
        } else if (a.getyLocation() == b.getyLocation() - 1 || a.getyLocation() == b.getyLocation() + 1) {
            return true;
        } else {
            return false;
        }

    }
}
