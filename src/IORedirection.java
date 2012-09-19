import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/18/12
 * Time: 5:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class IORedirection {
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;

    public void setUpStreams(){
        errContent = new ByteArrayOutputStream();
        outContent = new ByteArrayOutputStream() ;
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    public ByteArrayOutputStream getOutStreamObject(){
        return outContent;
    }

    public ByteArrayOutputStream getErrorStreamObject(){
        return errContent;
    }

    public void clearUpStreams(){
        System.setOut(null);
        System.setErr(null);
    }
}
