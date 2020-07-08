package Magic8;
import java.util.Random;
public class Magic8Ball {

    public static void main(String args[])
    {
        magicBallGenerator();

    }


    public static void magicBallGenerator(){
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 9
        int randomInteger = rand.nextInt(10);

        // Print random integers
        System.out.println
                ("Random Integer Is:" + randomInteger);

        switch(randomInteger){
            case 0:
                System.out.println(" It is certain.");
                break;

            case 1:
                System.out.println(" It is decidedly so.");
                break;

            case 2:
                System.out.println("Without a doubt.");
                break;

            case 3:
                System.out.println("Yes – definitely");
                break;

            case 4:
                System.out.println("You may rely on it.");
                break;

            case 5:
                System.out.println("As I see it, yes.");
                break;

            case 6:
                System.out.println("Most likely.");
                break;

            case 7:
                System.out.println("Outlook good.");
                break;

            case 8:
                System.out.println("Yes.");
                break;

            case 9:
                System.out.println("Signs point to yes.");
                break;
        }



    }
}