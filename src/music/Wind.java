package music;

import static net.mindview.util.Print.*;

/**
 * Created by ShiKun on 2015/12/17.
 */
public class Wind extends Instrument {
    public void play(Note note) {
        System.out.print("Wind.play()" + note);

    }
}

class Instrument{
    public void play(Note n) {
        print("Instrument.play()");
    }

}