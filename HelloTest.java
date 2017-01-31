import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class HelloTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	@Before	
	public void setUpStreams() {
   		System.setOut(new PrintStream(outContent));	
	}
	@After
	public void cleanUpStreams() {
    		System.setOut(new PrintStream(outContent));
		}
	@Test
	public void MainTest(){
		Hello.main();
    		assertEquals("Hello world.\n", outContent.toString());
	}
}
