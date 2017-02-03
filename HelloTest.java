import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class HelloTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private PrintStream initial;
	@Before	
	public void setUpStreams() {
   		initial = System.out;
		System.setOut(new PrintStream(outContent));	
	}
	@After
	public void cleanUpStreams() {
    		System.setOut(initial);
		}
	@Test
	public void MainTest(){
		Hello.main();
    		assertEquals("Hello, Erick\n", outContent.toString());
	}
}
