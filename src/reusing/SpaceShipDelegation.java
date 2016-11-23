/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
package reusing;
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    public void up(int velocity){
        controls.up(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public void right(int velocity){
        controls.right(velocity);
    }
    public void forward(int velocity){
        controls.foward(velocity);
    }
    public void back(int velocity){
        controls.back(velocity);
    }
    public void turboBoost(int velocity){
        controls.turboBoosr(velocity);
    }
    public static void main(String[] args){
        SpaceShipDelegation delegation = new SpaceShipDelegation("Nasa helper");
        delegation.forward(2500);
    }
}
