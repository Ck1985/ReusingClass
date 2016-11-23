/**
 * Created by Anonymous11100001 on 5/13/2016.
 */
class Amphabian{
    void run(){
        System.out.println("Amphabian can run on the land");
    }
    void swim(){
        System.out.println("Amphabian can swim in the water");
    }
    void kill(){
        System.out.println("I want to die");
    }
    static void killedbyItSelf(Amphabian amphabian){
        amphabian.kill();
    }
}
public class Frog extends Amphabian {
    public void say(){
        System.out.println("Forg can say oap oap");
    }
    @Override void swim(){
        System.out.println("Look at me. I can Swim hehehe");
    }
    public static void main(String[] args){
        Frog frog = new Frog();
        killedbyItSelf(frog);
        frog.swim();
    }
}
