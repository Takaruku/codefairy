package codefairies;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author James
 */
public class combat {

    public void dealDamage(variables a, variables b) {
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
