/**向上转型。将导出类转换为基类，称为向上转型。
 * 专用类转换为通用类所以总是很安全的。
 * Created by ShiKun on 2015/12/22.
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        flute.tune(flute);//方法可用，类型转为父类的类型，

    }
}

class Instrument{
    public void play() {

    }

    static void tune(Instrument i) {
        i.play();

    }
}