import reusing.Drone;

/**
 * Created by Anonymous11100001 on 5/13/2016.
 */
public class FlyCam extends Drone {
    public static void main(String[] args){
        Drone drone = new Drone("Drone1", 273.9f, 10000);
        // drone.fly(); as fly(...) method is protected and Flycam is not inherated from Drone so we can not acces fly()here
        // So wr must declare FlyCam inheritance from Drone to use Fly()
        FlyCam cam = new FlyCam();
        cam.fly(89.4f, 5000, 300);
    }
}
