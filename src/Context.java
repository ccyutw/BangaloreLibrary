import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {

    public static void main(String[] args) throws IOException {
        StartPage startPage = new StartPage();
        startPage.showWelcomeMessage();
        Scanner in = new Scanner(System.in);
        int input = 1;
        while (input!=0){
            startPage.showMenuList();
            System.out.println("Select a number to the enum");
            input = in.nextInt();
            startPage.getUserInput(input);
        }
        }


    }
}
