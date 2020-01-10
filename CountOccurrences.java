import java.util.ArrayList;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter your number"); // get Input from User
        for (int i = 0; i <= list.size(); i++) {
            int number = getNumberFromUser();
            if (number > 0 && number <= 100) {
                list.add(i,number);
            } else if (number == 0) {
                System.out.println("Thank you");
                break;
            }
        }
      // testing

        for (int i = 1; i <= 100 ; i++) {int x = 0;
            for (int j = 0; j <= list.size()-1 ; j++) {
                if (list.get(j) == i){x++;}
            }
                if(x == 1){
                    System.out.println("The number " + i + " occurs " + x + " time ");
                }
                else if(x > 1) {
                    System.out.println("The number " + i + " occurs " + x + " times ");
                }
                else{
                    continue;
                }
            }

        }

    public static int getNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}


