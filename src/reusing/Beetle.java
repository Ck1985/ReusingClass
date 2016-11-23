/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
package reusing;

class Insect{
    private int i = 9;
    protected int j;

    Insect(){
        System.out.println("i = " + i + " j = " + j);
        j = 39;
    }
    private static int x1 = printInt("Insect.x1 hss initialized");
    static int printInt(String s){
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect{
    private int k = printInt("Beetle.k has initializied");
    Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInt("Beetle.x2 has initialized");
    public static void main(String[] args){
        System.out.println("Beetle Constructor");
        Beetle beetle = new Beetle();
    }
}
