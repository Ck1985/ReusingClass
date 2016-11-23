/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
class Root {
    Root(int i){
        System.out.println("Root(" + i + ")");
    }
    /*public static void main(String[] args){
        Component1 com1 = new Component1(2,9);
        Component2 com2 = new Component2(18,65);
        Component3 com3 = new Component3(45,63);
    }*/
    void dispose(){
        System.out.println("Root dispose()");
    }
}
