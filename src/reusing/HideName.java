/**
 * Created by Anonymous11100001 on 5/12/2016.
 */
package reusing;
import static tk.anonymous11100001.util.Print.*;

class Home{
    char doh(char c){
        print("doh(char)");
        return 'd';
    }
    float doh(float f){
        print("doh(float)");
        return 1.9f;
    }
}

class Bar extends Home{
    void doh(MilHouse h){
        print("doh(MilHouse)");
    }
}

class Bar2 extends Home{
    @Override float doh(float f){
        print("Override method doh(float) in base class");
        return 12.9f;
    }
    //@Override void doh(MilHouse h){

    //}
    // Complier error beacause @Override is used to override methid but
    //at here you aoverloded method.
}

class MilHouse{

}

public class HideName {
    public static void main(String[] args){
        Bar b = new Bar();
        Bar2 b2 = new Bar2();
        b.doh('h');
        b.doh(7.9f);
        b.doh(new MilHouse());
        b2.doh(9.8f);
    }
}
