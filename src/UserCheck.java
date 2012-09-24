import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/18/12
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserCheck {


    private Map<String, String> userList;

    public UserCheck(){
        userList = new HashMap<String, String>();
    }
    public void initUserList(){
        userList.put("111-1111" , "123456");
        userList.put("111-1112" , "123457");
        userList.put("111-1113" , "123459");
        userList.put("111-1114" , "123451");
        userList.put("111-1115" , "123453");

    }
    public void showMessage(){
        System.out.println("Please talk to Librarian. Thank you.");
    }
    public String  loginCheck(String userID, String password){
        if(password.equals(userList.get(userID)))
        {
            System.out.println(userID+   password);
            return "Login success";
        }
        else
        {
            return "Wrong username or password";

        }
    }

}
