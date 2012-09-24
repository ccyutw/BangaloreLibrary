import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/12/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartPage {
    Map<Integer, String> menuList;
    private Library library;
    private BufferedReader bufferRead;

    public StartPage() {
        menuList = new HashMap<Integer, String>();
        bufferRead = new BufferedReader(new InputStreamReader(System.in));
        library  = new Library();
        initMenuList();

    }
    private void initMenuList(){
        menuList.put(1,"view books");
        menuList.put(2,"reserve a book");
        menuList.put(3,"Login");
    }
    public void showMenuList(){
         for(int i:menuList.keySet())
         {
             System.out.println(i+" "+menuList.get(i));
         }
    }

    public void showWelcomeMessage(){
        System.out.println("Welcome to Bangalore Public Library!");
    }

    public void getUserInput(int orderNumber) throws IOException {
        switch (orderNumber)
        {
            case 1:
            {
                System.out.println("You want "+menuList.get(orderNumber));
                library.showBookList();
                break;
            }
            case 2:
            {
                System.out.println("You want "+menuList.get(orderNumber)+"Please choose the number of books");
                library.showBookList();
                int input;
                Scanner in = new Scanner(System.in);
                input = Integer.parseInt(in.next());
                System.out.println(library.borrowBook(input));
                break;
            }
            case 3:
            {
                UserCheck userCheck = new UserCheck();
                System.out.println("please input your username");
                String username = bufferRead.readLine();
                System.out.println("please input your password");
                String password = bufferRead.readLine();
                System.out.println(userCheck.loginCheck(username,password));
                break;


            }
            default:
            {
                System.out.println("Select a valid option!!");
                break;
            }
        }
    }

}
