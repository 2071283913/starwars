package starwars.problems;

public class DigitalRoots {

    public static int digital_root(int n) {
        if (n < 0) {
            return -1 * digital_root(-n);
        }
        else {
            int rv = n;
            while (rv > 9) {
                rv = rv / 10 + rv % 10;
            }

            return rv;
        }
    }
}
