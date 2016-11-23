/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class Poppet{
    private int i;
    Poppet(int i){
        this.i = i;
    }
}

public class FinalBlank {
    private final int i = 89;
    private final int j;
    private final Poppet p;

    public FinalBlank(){
        this.j = 10;
        this.p = new Poppet(15);
    }

    public FinalBlank(int x){
        this.j = x;
        this.p = new Poppet(x);
    }

    public static void main(String[] args){
        FinalBlank final1 = new FinalBlank();
        FinalBlank final2 = new FinalBlank(30);
    }
}
