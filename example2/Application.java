import param.HelloStringPrinter;

public class Application {
	public static void main(String[] args) {
		HelloStringPrinter printer = new HelloStringPrinter();
		System.out.println(printer.print("Sergey"));
	}
}