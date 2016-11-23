/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
public class C extends A {
    public C(int i, int j){
        super(25);
        System.out.println("C(" + i + ',' + j + ") Constructor");
    }
    public static void main(String[] args){
        /*B objB = new B();
        objB.makeB();
        C objC = new C();*/

        C objC = new C(14, 27);
        B objB = new B(16);
        B methodB = objB.makeB(17);
    }
}
