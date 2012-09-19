import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/18/12
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserCheckTest {
    private IORedirection ioRedirection;
    private UserCheck userCheck;

    public UserCheckTest(){
        ioRedirection = new IORedirection();
        userCheck = new UserCheck();
    }
    @Before
    public void beforeMethod() {
        ioRedirection.setUpStreams();
    }
    @Test
    public void testShowMessage()
    {
        userCheck.showMessage();
        assertThat(ioRedirection.getOutStreamObject().toString(),is("Please talk to Librarian. Thank you.\n"));
    }


}
