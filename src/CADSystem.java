/**
 * Created by Anonymous11100001 on 5/11/2016.
 */
import static tk.anonymous11100001.util.Print.*;

class Shape{
    Shape(int i){
        print("Shape(" + i + ") Constructor");
    }
    void dispose(){
        print("Dispose Shape");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        print("Circle(" + i + ") Constructor");
    }
    void dispose(){
        print("Dispose Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        print("Triangle(" + i + ") Constructor");
    }
    void dispose(){
        print("Dispose Triangle");
        super.dispose();
    }
}

class Line extends Shape{
    private int start;
    private int end;

    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        print("Line(" + start + ',' + end + ") Constructor");
    }
    void dispose(){
        print("Dispose Line()");
        super.dispose();
    }
}

public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i){
        super(i + 1);
        for(int j = 0; j < lines.length; j++){
            lines[j] = new Line(j, j*j);
        }
        c = new Circle(i);
        t = new Triangle(i);
        print("Combined Constructor");
    }

    void dispose(){
        print("CAD System dispose");
        t.dispose();
        c.dispose();
        for(int j = lines.length - 1; j >= 0; j--){
            lines[j].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args){
        CADSystem cad = new CADSystem(47);
        try{
            //Code and exception handling .....
        }finally{
            cad.dispose();
        }
    }
}
