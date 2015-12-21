/**代理的实现,我觉得相当于组合，只不过将对象实现方式是私有的成员变量
 * 可以不将父类中的方法完全暴露出来，这样也可以实现继承。
 * Created by ShiKun on 2015/12/21.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipContols contols = new SpaceShipContols();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        contols.back(velocity);

    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("Nsea Protector");
        protector.back(100);
    }
}
