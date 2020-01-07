
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int rows = getRows();
        printLine(rows);
    }

    public static int getRows() {
        System.out.println("Enter the rows you want:");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        return rows;
    }

    public static void printLine(int rows) {
        for (int i = 1; i <= rows; i++) {//outer forloop
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");//create initial space for pyramid shape
            }
            for (int k = i; k >= 1; k--) {//inner for loops
                System.out.print(" " + k);//create left half
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);    //create right half
            }//end outer for loop
            System.out.println();
        }
    }
}
