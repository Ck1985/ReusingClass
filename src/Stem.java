/**
 * Created by Anonymous11100001 on 5/8/2016.
 */
public class Stem extends Root {
    private Component1 com1;
    private Component2 com2;
    private Component3 com3;

    public Stem(int i, int j){
        super(i);
        com1 = new Component1(10, 11);
        com2 = new Component2(12, 13);
        com3 = new Component3(14, 15);
        System.out.println("Stem(" + i + ',' + j + ")");
    }

    void dispose(){
        com3.dispose();
        com2.dispose();
        com1.dispose();
        super.dispose();
    }

    public static void main(String[] args){
        Stem s = new Stem(17, 18);
        s.dispose();
    }
}
