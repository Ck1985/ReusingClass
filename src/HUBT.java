/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class University{
    University(int rate){
        print("University(" + rate + ") Constructor");
    }
}

public class HUBT extends University{
    public HUBT(int rate, String feed){
        super(9);
        print("HUBT(" + rate + ',' + feed + ") Constructor");
    }
    public static void main(String[] args) {
        HUBT objHUBT = new HUBT(10, "Good University");
    }
}
