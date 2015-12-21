import static net.mindview.util.Print.*;
/**基类会先初始化，然后子类，带参数构造器的调用。
 * Created by ShiKun on 2015/12/17.
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");

    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }

}
class Game {
    Game(int i) {
        print("Game Construnctor");

    }
}

class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
        print("BoardGame constroctor");

    }

}
