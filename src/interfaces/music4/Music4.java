package interfaces.music4;

import static net.mindview.util.Print.*;
import music.Note;

/**接口实现
 * Created by ShiKun on 2015/12/24.
 */
public class Music4 {
    static void tune(Instrument i){
        i.play(Note.B_FLAT);

    }

    static void tunAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }

    }

    public static void main(String[] args) {
        Instrument[] orch = {
                new Wind(),
                new Stringed()
        };
        tunAll(orch);

    }




}

abstract class Instrument{
    private int i;

    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    public void play(Note note) {
        print("Wind play()" + note);

    }

    public String what() {
        return "Wind";
    }

    public void adjust() {

    }//必须要实现抽象类中的抽象方法
}

class Stringed extends Instrument {
    public void play(Note note) {
        print("Stringed play()" + note);
    }

    public void adjust() {

    }
}
