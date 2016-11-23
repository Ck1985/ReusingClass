package com.anonymous.reusing;

/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
import static tk.anonymous11100001.util.Print.*;

public class Detergent extends Cleanser{
    public void scrub(){
        print("Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append("foam() ");
    }
    public static void main(String[] args){
        Detergent objDet = new Detergent();
        objDet.delute();
        objDet.apply();
        objDet.foam();
        objDet.scrub();
        print(objDet);
        print("Check base class");
        Cleanser.main(args);
    }
}
