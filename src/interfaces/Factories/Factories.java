package interfaces.Factories;

import static net.mindview.util.Print.*;
/**接口的工厂模式
 * Created by ShiKun on 2015/12/24.
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(new Implementation2Factory());
        //serviceConsumer(new Implementation1());

    }
}

interface Service{
    void method1();

    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service {
    Implementation1() {

    }

    public void method1() {
        print("Implementation method1");

    }

    public void method2() {
        print("Implementation method2");

    }
}

class Implementation2 implements Service {
    Implementation2() {

    }

    public void method1() {
        print("Implementation2 method1");

    }

    public void method2() {
        print("Implementation2 method2");

    }
}

class Implementation2Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation2();
    }
}
