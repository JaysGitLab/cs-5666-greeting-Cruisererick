import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class HelloTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	@Before	
	public void setUpStreams() {
   		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));	
	}
	@After
	public void cleanUpStreams() {
    		System.setOut(null);
		System.setErr(null);
		}
	@Test
	public void MainTest(){
		Hello hello = new Hello();
		hello.main();
    		assertEquals("Hello world.\n", outContent.toString());
	}
}
