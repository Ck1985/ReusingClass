/**
 * Created by Anonymous11100001 on 5/14/2016.
 */
package reusing;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;
class Value{
    int i;
    public Value(int i){
        this.i = i;
    }
}
public class FinalData {
    private static Random ran = new Random(40);
    private String id;
    public FinalData(String id){
        this.id = id;
    }
    private final int valueOne = 9;
    private static final int FINAL_TWO = 12;

    public static final int FINAL_THREE = 20;

    private final int i4 = ran.nextInt(50);
    private static final int INT_I5 = ran.nextInt(130);
    private Value val1 = new Value(45);
    private final Value val2 = new Value(34);
    private static final Value VAL5  = new Value(65);

    private int[] arr = new int[]{1, 2, 3, 4, 5};

    public String toString(){
        return id + ": " + "id = " + i4 + " , INT_5 = " + INT_I5;
    }
    public static void main(String[] args){
        FinalData fin = new FinalData("id");
        //fin.valueOne++; error constant at compile time
        fin.val1 = new Value(88);
        //fin.val2 = new Value(24); error csn not assign constant at run time
        fin.val2.i++; // this point can change beacasue we can not change reference to objext but
        // we can change the contant of object(objwct) reference not change , just chnge contant which reference point to.
        //fin.i4++; error
        for(int i = 0; i < fin.arr.length; i++){
            fin.arr[i]++; // this is ok because reference arr is not changed
            // which is changed is elements in array (object) it neans
            // we changing the contant of object.
        }
        //FinalData.VAL5 = new Value(44); error can not change reference.
        System.out.print(fin);
        System.out.print("Creating new object");
        FinalData fin2 = new FinalData("fd2");
        System.out.print(fin2);
    }
}
