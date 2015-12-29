package exceptions;

/**自定义异常，接受带参数的异常构造器
 * Created by ShiKun on 2015/12/28.
 */
public class FullConstructors {
    public static void f() throws MyException{//该方法可能会抛出异常，抛出异常的类型
        System.out.println("Throws myException from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throws myException from g()");
        throw new MyException("Originated from g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);

        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);

        }

    }
}

class MyException extends Exception{
    public MyException() {

    }
   public MyException(String msg) {
        super(msg);
    }


}