/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
import static tk.anonymous11100001.util.Print.*;
class Device {
    Device() {
        print("Device Constructor");
    }
}
class Smartphone extends Device{
    Smartphone(){
        print("Smartphone Constructor");
    }
}
class Iphone extends Smartphone {
    Iphone(){
        print("Iphone Constructor");
    }
}
class Iphone7 extends Iphone{
    Iphone7(){
        print("Iphone7 Constructor");
    }
    public Iphone7 makeIphone7(){
        return new Iphone7();
    }
    public static void main(String[] args){
        Iphone7 i7 = new Iphone7();
        Iphone7 makeMethod = i7.makeIphone7();
    }
}
public class Iphone8 extends Iphone7{
    Iphone8(){
        print("Iphone8 Constructor");
    }
    public static void main(String[] args){
        Iphone8 i8obj = new Iphone8();
        Iphone7.main(args);
    }
}
