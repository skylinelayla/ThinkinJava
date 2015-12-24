package interfaces.music5;

import music.Note;

import static net.mindview.util.Print.*;
/**接口的实现,必须完全实现接口中的方法，方法一般都是public的。
 * Created by ShiKun on 2015/12/24.
 */
public class Music5 {

    static void tune(Instrument i){
        i.play(Note.B_FLAT);

    }
    static void tunAll(Instrument[] e){
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orc = {
                new Wind(),
                new Stringed()
        };
        tunAll(orc);

    }

}
interface Instrument{
    int VALUE=5;

    void play(Note note);

    void adjust();
}

class Wind implements Instrument {
    public void play(Note n){
        print(this + ".play()" + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        print(this + ".adjust()");

    }
}

class Stringed implements Instrument{
    public void play(Note n){
        print(this + ".play()" + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        print(this + ".adjust()");

    }
}