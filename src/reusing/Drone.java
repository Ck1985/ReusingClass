package reusing;

/**
 * Created by Anonymous11100001 on 5/13/2016.
 */
public class Drone {
    private String name;
    private float speedFly;
    private int highTop;
    public Drone(){

    }
    public Drone(String name, float speedFly, int highTop){
        this.name = name;
        this.speedFly = speedFly;
        this.highTop = highTop;
    }
    protected void fly(float speedFly, int highTop, double terrant){
        System.out.print("Drone has just impory " + terrant + "kallon " + "It will fly "
        + " at speed = " + speedFly + " at Top = " + highTop);
    }
}
