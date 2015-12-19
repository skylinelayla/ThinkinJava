/**
 * Created by ShiKun on 2015/12/18.
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field=" + sup.field + ",suo.getFiled=" + sup.getField());
        Sub sub=new Sub();
        System.out.println("sub.field=" + sub.field + ",sub.getFiled=" + sub.getField() + ",sub.getSuperFiled=" + sub.getSuperFiled());

    }


}

class Super{
    public int field=0;

    public int getField() {
        return field;
    }
}
class Sub extends Super{
    public int field=1;

    public int getField() {
        return field;
    }

    public int getSuperFiled() {
        return super.field;
    }



}