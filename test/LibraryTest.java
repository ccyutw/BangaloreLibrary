import org.junit.After;
import org.junit.Before;
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
    private IORedirection ioRedirection;
    private Library library;

    public LibraryTest(){
        library = new Library();
        ioRedirection = new IORedirection();
    }
    @Before
    public void beforeMethod() {
        ioRedirection.setUpStreams();
    }
    @Test
    public void testShowBookList(){
        library.showBookList();
        assertThat(ioRedirection.getOutStreamObject().toString(), is("Thinking in Java\nC++ Primer\nPro Git\n"));


    }
    @Test
    public void testBorrowBook() {
     assertThat(library.borrowBook(1), is("Thank You! Enjoy the book!"));

    }
    @After
    public void afterMethod() {
        ioRedirection.clearUpStreams();
    }
}
