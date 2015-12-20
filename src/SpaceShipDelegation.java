/**java代理 将一个成员对象至于要构造的类中，就像组合，
 * 然后在新类中暴露了该成员对象的所有方法。
 * Created by ShiKun on 2015/12/17.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();//初始化代理类

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {//代理的方法
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

