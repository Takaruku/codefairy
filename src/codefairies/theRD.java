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
public class theRD {
//create an array of all of the schools on the map
//run this code every 30 turns
//run destroy it code every once and a while to choose a victim
    
//USE THIS IF IT WONT TAKE TOO MUCH TIME TO IMPLEMENT
    

    public void destroyIt(variables victim, int x, int y) {
        //generate random x and y location when calling it
        boolean nothing = false;
        if (victim == null){
         nothing = true;
        }
        if (nothing == false){
    victim.setHealth(0);
    System.out.println("YOU FAIL");
    System.out.println("EXTERMINATE. I SHOT FIRST");
        }
    }
}
