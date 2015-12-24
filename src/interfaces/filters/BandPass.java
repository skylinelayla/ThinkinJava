package interfaces.filters;

import jdk.nashorn.internal.ir.BaseNode;

/**
 * Created by ShiKun on 2015/12/24.
 */
public class BandPass extends Filter {
    double lowCutoff,highcut;
    public BandPass(double lowCutoff, double highcutoff) {
        lowCutoff=lowCutoff;
        highcut= highcutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}
