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
		String [] test = new String[1];
		test[0]="UserName";
		Hello.main(test);
    		assertEquals("Hello, UserName\n",outContent.toString());
	}
	@Test
	public void SecondTest(){
	String [] test = new String[0];
	
	Hello.main(test);
	assertEquals("Hello, Erick\n",outContent.toString());}
}
