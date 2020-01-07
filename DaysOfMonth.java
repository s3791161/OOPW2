import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
       int year = getYear();
       String month = getMonth();
        System.out.println(month);
       isLeapYear(year);
       if(isLeapYear(year)){
           System.out.println("This is a leap year");
       }
       else System.out.println("This is not a leap year");
    }
    public static int getYear(){
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        return year;
    }
    public static String getMonth(){
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month with the first letter is UPPERCASE and contain 3 letters");
        do{
             String month = sc.nextLine();
        if (month.matches("(Jan|Feb|Mar|Apr|May|June|Jul|Aug|Sep|Oct|Nov|Dec)")){
            done = true;
            return month;
        }
        else {
            System.out.println("Please enter a month with the first letter is UPPERCASE and contain 3 letters");
        }
    } while(done = true);
        return "0";
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else return false;
    }
}
