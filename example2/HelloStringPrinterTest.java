import org.junit.Test;
import param.HelloStringPrinter;
import static org.junit.Assert.assertEquals;

public class HelloStringPrinterTest {
	@Test
	public void shouldCreateCustomizedString() {
		HelloStringPrinter printer = new HelloStringPrinter();
		assertEquals("Hello, Sergey!", printer.print("Sergey"));
	}
}