/**普通继承实现
 * Created by ShiKun on 2015/12/21.
 */
public class SpaceShip extends SpaceShipContols {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("Nsea Proctector");
        protector.forward(100);

    }
}
class SpaceShipContols{
    void up(int velocity) {

    }

    void down(int velocity) {

    }

    void left(int velocity) {

    }

    void right(int velocity) {

    }

    void forward(int velocity) {

    }

    void back(int velocity) {

    }

    void turboBoost() {

    }
}