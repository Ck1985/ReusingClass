package reusing;

/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
class Gizmo{
    public void spin(){

    }
}
public class FinalArguments {
    Gizmo WithFinal(final Gizmo g){
        //g = new Gizmo(); Error because g is an object of Gizmo type has final Keyword, so we can not change it.
        //Note: at here we can not initialized g it means it points to null. So we can not point it to another memory.
        return g;
    }
    void WithoutFinal(Gizmo g){
        g = new Gizmo();
        g.spin();
    }
    int WithInt(final int i){
        // i++; Error
        return i + 1; //Note: We can chang i but we can rea it.
    }
    public static void main(String[] args){
        FinalArguments fin = new FinalArguments();
        fin.WithFinal(null);
        fin.WithoutFinal(null);
        fin.WithInt(0);
    }
}
