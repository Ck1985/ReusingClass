/**
 * Created by Anonymous11100001 on 5/13/2016.
 */
class Instrucment{
    void play(){

    }
    static void tune(Instrucment obj){
        obj.play();
    }
}
public class Flute extends Instrucment {
    public static void main(String[] args){
        Flute wind = new Flute();
        //UpCasting .......
        Instrucment.tune(wind);
    }
}
