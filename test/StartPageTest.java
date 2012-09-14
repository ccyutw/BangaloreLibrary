import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private StartPage startpage;


    @Before
    public void setUpStreams() {
        startpage = new StartPage();
        errContent = new ByteArrayOutputStream();
        outContent = new ByteArrayOutputStream() ;
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testShowWelcomeMessage(){
        startpage.showWelcomeMessage();
        assertThat(outContent.toString(), is("Welcome to Bangalore Public Library!\n"));
    }
    @Test
    public void testShowMenuList(){
        startpage.showMenuList();
        assertThat(outContent.toString(),is("1 view books\n2 reserve a book\n"));
    }
    @Test
    public void testGetUserInput(){
        startpage.getUserInput(1);
        assertThat(outContent.toString(), is("You want view books\n"));
    }
    @Test
    public void testErrorGetUserInput(){
        startpage.getUserInput(5);
        assertThat(outContent.toString(), is("Select a valid option!!\n"));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
