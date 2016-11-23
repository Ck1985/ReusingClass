/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
class Component1 extends Root {
    Component1(int i, int j){
        super(i);
        System.out.println("Component1");
    }
    void dispose(){
        System.out.println("Component1 dispose()");
        super.dispose();
    }
}
