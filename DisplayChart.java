import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DisplayChart {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("Miles       Kilometers    ||    Kilometers      Miles");
        int k = 0;
        for (int i = 1; i < 11 ; i++) {
                double u = i * 1.61;
                k += 5;
                double m = k/1.609;
                System.out.printf( df.format(i) + "             " + df.format(u) + "     |     " + df.format(k) + "        " + df.format(m) );
                 System.out.print("\n");
            }
        }
    }
