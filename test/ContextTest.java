import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* Created with IntelliJ IDEA.
* User: twer
* Date: 9/23/12
* Time: 11:49 PM
* To change this template use File | Settings | File Templates.
*/
public class ContextTest {
    IORedirection ioRedirection;
    @Before
    public void beforeMethod() {
        ioRedirection.setUpStreams();
    }
    @Test
    public void testMain() throws Exception {


    }
    @After
    public void afterMethod(){

    }
}
