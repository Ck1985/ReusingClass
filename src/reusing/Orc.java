/**
 * Created by Anonymous11100001 on 5/13/2016.
 */
package reusing;
import static tk.anonymous11100001.util.Print.*;

class Villain{
    private String name;
    protected void setName(String newName){
        name = newName;
    }
    public Villain(String name){
        this.name = name;
    }
    public String toString(){
        return "Hi I am Villain, my name is "+ this.name;
    }
}

public class Orc extends Villain {
    private int numberOrc;
    public Orc(String name, int number){
        super(name);
        this.numberOrc = number;
    }
    public void change(String name, int number){
        setName(name);
        this.numberOrc = number;
    }
    public String toString(){
        return "Orc: " + this.numberOrc + "---" + super.toString();
    }
    public static void main(String[] args){
        Orc orc = new Orc("Ivanda", 80);
        print(orc);
        orc.change("Mandi", 100);
        print(orc);
    }
}
