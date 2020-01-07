import java.util.Random;

public class new_randomcard {
    public static void main(String[] args) {
        Random random_num = new Random();
        String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Heart", "Spade", "Club", "Diamond"};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int random_card = random_num.nextInt(13);
            int random_suit = random_num.nextInt(4);
            if (random_card == 10 || random_card == 11 || random_card == 12) {
                sum += 10;
            } else {
                sum += random_card + 1;
            }
            System.out.println("The " + card[random_card] + " of " + suit[random_suit]);
        }
        System.out.println("The total value is: " + sum);
    }
}
