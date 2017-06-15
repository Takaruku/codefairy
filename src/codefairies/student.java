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
public class student extends variables {

    public void student(int x, int y, int team) {
        setHealth(1);
        int looping = 0;
        while (looping < 5){
            //add code to make sure bag is empty
            looping++;
        }
        variables(x, y, team);
    }
//IGNORE ALL OF THIS CODE FOR NOW--- GETTING MOVEMENT WORKING IS PRIORITY

    public void pickUpCookie(student j, cookie a, int x, int y) {//check to make sure location of cookie on ground
        //matches location of player
        boolean sameSpot = false;
        boolean success = false;
        if (j.getxLocation() == x && j.getyLocation() == y) {
            sameSpot = true;
        }//makes sure that they can actually get it
        if (a.isInBag() == false && sameSpot) {
            //then if the location matches
            a.setInBag(true);
            int looping = 0;
            while (success = false && looping < 4) {
                //code for checking whether or not slot in bag is full
                //then, once it finds a spot in the bag that isnt full
                //it adds the cookie to the bag
            }
            if (success = false) {
                System.out.println("Your bag is full");//other way of outputting it for the final product
            }
            //put it into the bag
        }
    }

}
