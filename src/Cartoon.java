/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
class Art{
        public Art(){
            System.out.println("Art Constructor()");
        }
}

class Draw extends Art{
    public Draw(){
        System.out.println("Draw Constructor");
    }
}

public class Cartoon extends Draw {
    /*public Cartoon(){
        System.out.println("Cartoon Constructor");
    }*/
    public static void main(String[] args){
        Cartoon obj = new Cartoon();
    }
}
