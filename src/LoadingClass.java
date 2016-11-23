/**
 * Created by Anonymous11100001 on 5/16/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class A1{
    static int j = printInt("A1.j has initialized");
    static int printInt(String s){
        print(s);
        return 1;
    }
    A1(){
        print("A1() Constructor");
    }
}

class B1 extends A1{
    static int k = printInt("B1.k has initialized");
    B1(){
        print("B1() Constructor");
    }
}

class C1{
    static int n = printIntC("C1.n has initialized");
    static A1 a1 = new A1();
    C1(){
        print("C1() Constructor");
    }
    static int printIntC(String s){
        print("s");
        return 1;
    }
}

class D1{
    D1(){
        print("D1() Constructor");
    }
}

public class LoadingClass extends B1{
    static int i = printInt("LoadingClass.i has initialized");
    LoadingClass(){
        print("LoadingClass() Constructor");
    }
    public static void main(String[] args){
        print("Hi");
        LoadingClass lc = new LoadingClass();
        print(C1.a1);
        D1 d1 = new D1();
    }
}
