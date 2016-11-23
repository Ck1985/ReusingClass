/**
 * Created by Anonymous11100001 on 5/12/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class DeviceElectronic{
    void showData(){
        print("show Data");
    }
    int showData(int i){
        print("show Data number integer");
        return i;
    }
    String showData(String s){
        print("show data String");
        return s;
    }
}

public class Computer extends DeviceElectronic{
    char showData(char c){
        print("show Data char");
        return c;
    }
    @Override int showData(int i){
        return i + 10;
    }
    public static void main(String[] args){
        Computer com = new Computer();
        com.showData();
        print(com.showData(15));
        com.showData("anonymous");
        com.showData('c');
    }
}
