/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
class Component3 extends Root {
    Component3(int i, int j){
        super(i);
        System.out.println("Component3");
    }
    void dispose(){
        System.out.println("Component3 dispose");
        super.dispose();
    }
}
