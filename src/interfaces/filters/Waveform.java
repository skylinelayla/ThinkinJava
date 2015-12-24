package interfaces.filters;

/**
 * Created by ShiKun on 2015/12/24.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform" + id;
    }
}
