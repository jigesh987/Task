import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rn.nextInt(1, 101);
        System.out.println(number);
        int attemts=5;
        int count=5;
        System.out.println("guess the number within 5 trials");
        for (int i = 0; i < attemts; i++) {
            int no=sc.nextInt();
            if (no==number) {
                System.out.println("Congratulation");
                break;
            } else if (no>number && i!=attemts-1)  {
                System.out.println("ur number is bigger than original number");
                System.out.println(--count + " trials left");
            }
            else if(no<number && i!=attemts-1)  {
                System.out.println("ur number is smaller than original number");
                System.out.println(--count + " trials left");
            }
            if(i==attemts-1){
                System.out.println("0 trials left better luck next time");
            }
        }

    }
}
