import java.io.*;

public class Main {
	static public void main(String argv[]) {
	try {
		parser p = new parser(new MyScanner(new FileReader(argv[0])));
		System.out.println("------ Parsing Start ------");
			
			Program pm = (Program)p.parse().value;
			String xml = pm.toXML();
			System.out.println(xml);

			System.out.println("------ Parsing Success ------");
		} catch (Exception e) {
			System.out.println("------ Parsing Fail ------");
			System.exit(1);
		}
	}
}