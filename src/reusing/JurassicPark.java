/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
package reusing;

class SmallBrain{

}
final class Dinosour{
    int height = 9;
    float weight = 120.5f;
    SmallBrain br = new SmallBrain();

    String say(){
        return "Gru gru";
    }
}
public class JurassicPark {
    public static void main(String[] args){
        JurassicPark jur = new JurassicPark();
        Dinosour din= new Dinosour();
        din.height = 12;
        din.weight = 234.5f;
        din.say();
    }
}
