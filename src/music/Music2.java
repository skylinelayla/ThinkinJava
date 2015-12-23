package music;

import java.sql.Struct;

import static net.mindview.util.Print.*;
/**
 * Created by ShiKun on 2015/12/23.
 */
public class Music2 {
    public static void tune(Wind wind) {
        wind.play(Note.MIDDE_C);

    }

    public static void tune(Stringed stringed) {
        stringed.play(Note.B_FLAT);

    }

    public static void tune(Bass bass) {
        bass.play(Note.B_FLAT);

    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed viloin = new Stringed();
        Bass frenchhor = new Bass();
        tune(flute);
        tune(viloin);
        tune(frenchhor);

    }
}

class Stringed extends Instrument {
    public void play(Note note) {
        print("Stringed.play()" + note);
    }
}

class Bass extends Instrument {
    public void play(Note n) {
        print("Bass.play()" + n);
    }
}