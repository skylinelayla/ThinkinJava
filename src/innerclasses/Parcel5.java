package innerclasses;

/**
 * Created by ShiKun on 2015/12/25.
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
        private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }

        }
    }
}

