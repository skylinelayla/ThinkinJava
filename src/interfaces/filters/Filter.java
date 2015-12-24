package interfaces.filters;

/**
 * Created by ShiKun on 2015/12/24.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
