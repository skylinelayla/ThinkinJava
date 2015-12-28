package exceptions;

/**
 * Created by ShiKun on 2015/12/28.
 */
public class FullConstructors {
    public static void f() throws MyException{
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