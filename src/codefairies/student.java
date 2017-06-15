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
public class student extends variables{
    private bag sachel [] ;
    //ensures that all bags start with a default of being empty

  
    public void pickUpCookie (student j, cookie  a, int x, int y){//check to make sure location of cookie on ground
        //matches location of player
        boolean sameSpot = false;
        boolean success = false;
        if (j.getxLocation()==x && j.getyLocation()==y){
            sameSpot = true;
        }
        if (a.isInBag()&& sameSpot){
            //then if the location matches
            a.setInBag(true);
            int looping = 0;
            while (success = false && looping < (sachel.length - 1)){
                
                //code for checking whether or not slot in bag is full
                //then, once it finds a spot in the bag that isnt full
                //it adds the cookie to the bag
            }
            if (success = false){
                System.out.println("Your bag is full");//other way of outputting it for the final product
            }
           //put it into the bag
        }
    }

    /**
     * @return the sachel
     */
    public bag[] getSachel() {
        return sachel;
    }

    /**
     * @param sachel the sachel to set
     */
    public void setSachel(bag[] sachel) {
        this.sachel = sachel;
    }
}
