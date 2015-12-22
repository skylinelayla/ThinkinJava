import  static net.mindview.util.Print.*;
/**继承的方法重载。基类重载的方法都是可以使用的。
 * Created by ShiKun on 2015/12/22.
 */
public class Hide {

    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(new Milhouse());

    }


}

class Homer{
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }
    float doh(float f){
        print("doh(float)");
        return 1.0f;
    }//方法重载
}

class Milhouse {

}

class Bart extends Homer {
  void doh(Milhouse m) {
        print("doh(Mihouse)");

    }
}

class Lisa extends Homer {

    void doh(Milhouse m) {
        print("doh(Milhouse)");

    }
}
