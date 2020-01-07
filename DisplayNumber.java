import java.util.ArrayList;

public class DisplayNumber {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 100; i < 201 ; i++) {
            if ( i % 5 == 0 && i % 6 != 0) {
                a += 1;
                System.out.print( i + " ");
            }
            if ( i % 6 == 0 && i % 5 != 0) {
                System.out.print( i + " ");
                a += 1;
            }
            if (a == 10){
                System.out.print("\n");
                a = 0;
            }
        }
    }
}
