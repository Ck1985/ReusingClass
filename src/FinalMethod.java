/**
 * Created by Anonymous11100001 on 5/15/2016.
 */
class BaseClass{
    private String name;
    void methodWithoutFinal(){

    }
    final void methodWithFinal(){

    }
}
public class FinalMethod extends BaseClass{
    @Override void methodWithoutFinal(){
        System.out.println("Overrided");
    }
    // @Override void methodWithFinal(){
        //Error can not override because this method is final keyword.
    //}
    public static void main(String[] args){
        FinalMethod obj = new FinalMethod();
        obj.methodWithoutFinal();
        obj.methodWithFinal();
    }
}
