package com.anonymous.reusing;

/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
import static tk.anonymous11100001.util.Print.*;

public class DetergentClo extends Detergent {
    public void scrub(){
        print("DetergentClo.scrup()");
        super.scrub();
    }
    public void stelizile(){
        append("stelizile() ");
    }
    public static void main(String[] args){
        DetergentClo objClo = new DetergentClo();
        objClo.delute();
        objClo.apply();
        objClo.scrub();
        print(objClo);
    }
}
