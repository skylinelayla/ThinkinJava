package music;

/**
 * Created by ShiKun on 2015/12/17.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDE_C);

    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);//向上转型


    }
}
