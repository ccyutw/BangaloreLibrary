import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    Map<String, Integer> bookList;

    public Library() {
        bookList = new HashMap<String, Integer>();
        initBookList();
    }

    public void initBookList(){
        bookList.put("Thinking in Java",5);
        bookList.put("C++ Primer",4);
        bookList.put("Pro Git",1);
    }

    public String borrowBook(String bookName)
    {
         if((bookList.get(bookName) != 0) && bookList.containsKey(bookName))
         {
             bookList.bookList.get(bookName) -= 1;
             return "Thank You! Enjoy the book!";
         }
        else
             return "Sorry we don't have that book yet";

    }
    public void showBookList(){
        for(String bookName: bookList.keySet())
        {
            System.out.println(bookName);
        }
    }


}
