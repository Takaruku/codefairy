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
public class fairy extends variables {
    private String name;
    public fairy(int x, int y, int team, String name) {
        super(x, y, team);
        setName(name);//because code fairies are special, and I wanted to make things a wee bit more complicated
        setFighter(true);
    }

    public void blackMagic() {
        //to do extra damage when fighting an enemy
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
