package com.anonymous.reusing;

/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
public class DetergentDelegation {
    private String name;
    private Cleanser clean = new Cleanser();

    public DetergentDelegation(String name){
        this.name = name;
    }

    public String apply(){
        return clean.apply();
    }
    public void scrub(){
        clean.scrub();
    }
    public String delute(){
        return clean.delute();
    }

    public static void main(String[] args){
        DetergentDelegation delegation = new DetergentDelegation("Toshiba2016");
        System.out.print(delegation.apply());
    }
}
