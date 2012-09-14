import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/12/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartPage {
    Map<Integer, String> menuList;

    public StartPage() {
        menuList = new HashMap<Integer, String>();
        initMenuList();

    }
    private void initMenuList(){
        menuList.put(1,"view books");
        menuList.put(2,"reserve a book");
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

    public void getUserInput(int orderNumber){
        switch (orderNumber)
        {
            case 1:
            {
                System.out.println("You want "+menuList.get(orderNumber));
                break;
            }
            case 2:
            {
                System.out.println("You want "+menuList.get(orderNumber));
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
