/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
import static tk.anonymous11100001.util.Print.*;
class WithFinal{
    private final void f(){
        print("WithFinal.f()");
    }
    private void g(){
        print("WithFinal.g()");
    }
    private final void m(){

    }
}
class Overriding extends WithFinal{
    private final void f() {
        print("Overriding.f()");
    }
    private void g(){
        print("Overriding.g()");
    }
    //@Override private final void f(){

    //}
    //@Override private void g(){

    //}
}
class Overriding2 extends Overriding{
    public final void f(){
        print("Overriding2.f()");
    }
    public void g(){
        print("Overriding2.g()");
    }
    //@Override public final void f(){

    //}
}
public class FinalPrivateFinal {
    public static void main(String[] args){
        Overriding2 over2 = new Overriding2();
        over2.f();
        over2.g();
        Overriding over = over2;
        // over.f();Error
        // over.g(); Error
        WithFinal with = over;
        // with.f();
        // with.g();
    }
}
