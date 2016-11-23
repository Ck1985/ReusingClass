/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
import static tk.anonymous11100001.util.Print.*;
class Plate{
    Plate(int i){
        print("Plate() Constructor");
    }
}

class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        print("DinnerPlate() Constructor");
    }
}

class Utensil{
    Utensil(int i){
        print("Utensil Constructor");
    }
}

class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        print("Spoon() Constructor");
    }
}

class Fork extends Utensil{
    Fork(int i){
        super(i);
        print("Fork() Constructor");
    }
}

class Knife extends Utensil{
    Knife(int i){
        super(i);
        print("Knife() Constructor");
    }
}

class Custom{
    Custom(int i){
        print("Custom() Constructor");
    }
}

public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork fr;
    private Knife kn;
    private DinnerPlate din;
    public PlaceSetting(int i){
        super(i);
        sp = new Spoon(i + 6);
        fr = new Fork(i + 5);
        kn = new Knife(i + 3);
        din = new DinnerPlate(i + 10);
        print("PlaceSetting Constructor");
    }
    public static void main(String[] args){
        PlaceSetting place = new PlaceSetting(15);
    }
}
