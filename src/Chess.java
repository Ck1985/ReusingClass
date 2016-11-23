/**
 * Created by Anonymous11100001 on 5/7/2016.
 */
class Game{
    Game(int i){
        System.out.println("Game() Constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame() Constructor");
        //super(i);
    }
}

public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess() Constructor");
    }
    public static void main(String[] args){
        Chess obj = new Chess();
    }
}
