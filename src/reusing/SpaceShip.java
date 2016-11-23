/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
package reusing;
public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args){
        SpaceShip newShip = new SpaceShip("NASA opportinity");
        newShip.foward(100);
    }
}
