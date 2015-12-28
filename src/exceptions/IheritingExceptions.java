package exceptions;

/**自定义自己的异常
 * Created by ShiKun on 2015/12/28.
 */
public class IheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Threw simpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        IheritingExceptions sed = new IheritingExceptions();
        try {
            sed.f();

        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
class SimpleException extends Exception{

}