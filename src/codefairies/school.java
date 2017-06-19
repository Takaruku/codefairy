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
    //James made this class
    public school(int x, int y, int team) {
        super(x, y, team);
        setHealth(10);
        setFighter(false);
    }

//James and vinnie wrote the below code

//    public void schooltimerspawn() {
//        count++;
//        if (count == 3) {
//            fairy hold;
//            if (World.checkSpace(getxLocation(), getyLocation()+1, 'd').equals("nothing")) {
//                hold =  new fairy(getxLocation(), getyLocation(), getAlliegance(), "Spawn");
//                World.addToSpace(getxLocation(), getyLocation() + 1,hold);
//                World.addToList(hold);
//            } else if (World.checkSpace(getxLocation(), getyLocation(), 'l').equals("nothing")) {
//                hold =  new fairy(getxLocation()-1, getyLocation(), getAlliegance(), "Spawn");
//                World.addToSpace(getxLocation() - 1, getyLocation(),hold);
//                World.addToList(hold);
//            }
//        }
//    }

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
