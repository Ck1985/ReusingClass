/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
class Component2 extends Root {
    Component2(int i, int j){
        super(i);
        System.out.println("Component2");
    }
    void dispose(){
        System.out.println("Component2 dispose()");
        super.dispose();
    }
}
