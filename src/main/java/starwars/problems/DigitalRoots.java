package starwars.problems;

public class DigitalRoots {

    public static int digital_root(int n) {
        if (n < 0) {
            return -1 * digital_root(-n);
        }
        else if (n < 10) {
            return n;
        }
        else {
            int i = 0;
            do {
                i += n % 10;
                n /= 10;
            } while (n > 0);

            return digital_root(i);
        }
    }
}
