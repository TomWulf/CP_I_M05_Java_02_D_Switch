import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "B - Back\tF - Forward\tU - Up\tD - Down\tL - Left\tR - Right\nChoose your move: [BFUDRL]: ";

        // display the menu
        System.out.print(menu);
        menuChoice = in.nextLine();

        menuChoice = menuChoice.toUpperCase();  // Convenient so we dont have to test for both up/lower case

        switch(menuChoice)
        {
            case "B":
                System.out.println("BACK");
                break;
            case "F":
                System.out.println("FORWARD");
                break;
            case "U":
                System.out.println("UP");
                break;
            case "D":
                System.out.println("DOWN");
                break;
            case "L":
                System.out.println("LEFT");
                break;
            case "R":
                System.out.println("RIGHT");
                break;
            default:
                System.out.println("Illegal Choice: " + menuChoice);
                break;
        }

    }
}