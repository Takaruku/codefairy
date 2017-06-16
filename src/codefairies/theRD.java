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
public class theRD {
//create an array of all of the schools on the map
//run this code every 30 turns
//run destroy it code every once and a while to choose a victim
    

    

    public static void destroyIt() {
    school [] victim = null;//equals null for now so it doesnt cause errors
    Random rand = new Random();
    int whatOne = rand.nextInt(victim.length) + 1;
    victim[whatOne].setHealth(0);
    System.out.println("YOU FAIL");
    }
}
