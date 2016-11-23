/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
import java.util.*;
class Test{
    Test(){
        System.out.println("Test()");
    }
}
public class Difference {
    private static Random ran = new Random(100);
    private String name;
    public Difference(String name){
        this.name = name;
    }
    private final String fst = "final fst";
    private static final String SFST = "static final";
    private final Test test = new Test();
    private static final Test TEST = new Test();
    private final int fint = ran.nextInt(40);
    private static final int SFINT = ran.nextInt(30);

    public String toString(){
        return "name: " + fst + " , " + SFST + " , " + test + " , " + TEST + " , " + fint + " , " + SFINT;
    }

    public static void main(String[] args){
        Difference dif1 = new Difference("anonymous1");
        Difference dif2 = new Difference("anonymous2");
        Difference dif3 = new Difference("anonymous3");
        System.out.println(dif1);
        System.out.println(dif2);
        System.out.println(dif3);
    }
}
