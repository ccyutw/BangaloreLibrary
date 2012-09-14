import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
* Created with IntelliJ IDEA.
* User: twer
* Date: 9/13/12
* Time: 10:40 PM
* To change this template use File | Settings | File Templates.
*/
public class LibraryTest {
    private Library library;
    public LibraryTest()
    {
        library = new Library();
    }

    @Test
    public void testShowBookList(){


    }
    @Test
    public void testBorrowBook() {
     assertThat(library.borrowBook("Thinking in Java"), is("Thank You! Enjoy the book!"));

    }
}
