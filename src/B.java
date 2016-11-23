/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
public class B extends A {
    B(int i){
        super(i);
        System.out.println("B(" + i + ") Constructor");
    }
   /* void showB(){
        System.out.println("This is method of B Class");
    }*/
    public B makeB(int i){
        return new B(i);
    }
}
