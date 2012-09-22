import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/12/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */

public class StartPageTest {
    private IORedirection ioRedirection;
    private StartPage startpage;

    public StartPageTest(){
        startpage = new StartPage();
        ioRedirection = new IORedirection();
    }
    @Before
    public void beforeMethod() {
        ioRedirection.setUpStreams();
    }

    @Test
    public void testShowWelcomeMessage(){
        startpage.showWelcomeMessage();
        assertThat(ioRedirection.getOutStreamObject().toString(), is("Welcome to Bangalore Public Library!\n"));
    }
    @Test
    public void testShowMenuList(){
        startpage.showMenuList();
        assertThat(ioRedirection.getOutStreamObject().toString(),is("1 view books\n2 reserve a book\n"));
    }
    @Test
    public void testGetUserInput(){
        startpage.getUserInput(1);
        assertThat(ioRedirection.getOutStreamObject().toString(), is("You want view books\n" +
                "Thinking in Java\n" +
                "C++ Primer\n" +
                "Pro Git\n"));
    }
    @Test
    public void testErrorGetUserInput(){
        startpage.getUserInput(5);
        assertThat(ioRedirection.getOutStreamObject().toString(), is("Select a valid option!!\n"));
    }

    @After
    public void afterMethod() {
        ioRedirection.clearUpStreams();
    }
}
