/**
 * Created by ShiKun on 2015/12/17.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        controls.back(velocity);

    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.back(100);

    }
}

class SpaceShipControls{
    void up(int velocity){};
    void down(int velocity){};
    void left(int velocity){};
    void right(int velocity){};
    void forward(int velocity){};
    void back(int velocity){};
    void tuborBoost(int velocity){};
}

