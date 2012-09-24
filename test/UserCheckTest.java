import org.junit.After;
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
        userCheck.initUserList();
    }
    @Before
    public void beforeMethod() {
        ioRedirection.setUpStreams();
    }
    @Test
    public void testShowMessage()
    {
        userCheck.showMessage();
        assertThat(ioRedirection.getOutStreamObject().toString(), is("Please talk to Librarian. Thank you.\n"));
    }

    @Test
    public void testLoginCheck(){
        assertThat(userCheck.loginCheck("111-1112","123457"), is("Login success"));
        assertThat(userCheck.loginCheck("1123","234"), is("Wrong username or password"));
    }
    @After
    public void afterMethod(){
        ioRedirection.clearUpStreams();
    }



}
