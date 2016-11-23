/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
package com.anonymous.reusing;
import static tk.anonymous11100001.util.Print.*;

class Cleanser {
    private String name = "Cleanser ";
    /*public Cleanser(){
        System.out.println("Cleanser Constructor");
    }*/
    public String append(String s){
        return this.name += s;
    }
    public String delute(){
        return append("delute() ");
    }
    public String apply(){
        return append("apply() ");
    }
    public void scrub(){
        append("scrub() ");
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args){
        Cleanser objCl = new Cleanser();
        objCl.delute();
        objCl.apply();
        objCl.scrub();
        print(objCl);
    }
}
