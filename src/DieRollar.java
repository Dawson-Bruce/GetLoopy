import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        int dieOne = 0;
        int dieTwo = 0;
        int dieThree = 0;
        int rolls = 0;

        do
        {
            rolls = 0;
            System.out.printf("%7s %7s %7s %7s %7s", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("");
            System.out.print("--------------------------------------------");

            do
            {
                System.out.println("");
                rolls++;
                dieOne = generator.nextInt(6) + 1;
                dieTwo = generator.nextInt(6) + 1;
                dieThree = generator.nextInt(6) + 1;

                System.out.printf("%7d %7d %7d %7d %7d", rolls, dieOne, dieTwo, dieThree, dieOne + dieTwo + dieThree);;
            }while(dieOne != dieTwo || dieOne != dieThree);

            System.out.println("");
            System.out.println("Continue? [Y/N]");
            done = !in.nextLine().equalsIgnoreCase("y");
        }while(!done);
    }
}
