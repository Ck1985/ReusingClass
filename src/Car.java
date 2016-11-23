/**
 * Created by Anonymous11100001 on 5/13/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class Engine{
    public void start(){};
    public void rev(){};
    public void stop(){};
}

class Wheel{
    public void inflate(int psi){};
}

class Window{
    public void rollUp(){};
    public void rollDown(){};
}

class Door{
    public Window window = new Window();
    public void open(){};
    public void close(){};
}

public class Car {
    private Engine engine = new Engine();
    private Door doorLeft = new Door(),
                 doorRight = new Door();
    private Wheel[] wheels = new Wheel[4];
    public Car(){
        for(int i = 0; i < 4; i++){
            wheels[i] = new Wheel();
        }
    }
    public static void main(String[] args){
        Car car = new Car();
        car.doorLeft.close();
        car.doorRight.window.rollDown();
        car.wheels[1].inflate(172);
    }
}
