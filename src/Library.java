import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    Map< Integer,String > bookList;

    public Library() {
        bookList = new LinkedHashMap< Integer,String >();
        initBookList();
    }

    public void initBookList(){
        bookList.put(1,"Thinking in Java");
        bookList.put(2,"C++ Primer");
        bookList.put(3,"Pro Git");
    }

    public String borrowBook(int bookNumber)
    {
         if( bookList.containsKey(bookNumber))
         {
             //bookList.get(bookName) = bookList.get(bookName)-1;
             return "Thank You! Enjoy the book!";
         }
        else
             return "Sorry we don't have that book yet";

    }


    public void showBookList(){
        for(String bookName: bookList.values())
        {
            System.out.println(bookName);
        }
    }


}
