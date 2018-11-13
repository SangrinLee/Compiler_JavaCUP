import java.util.*;
public class Program {
	private Vector<Statement> statements;

	public Program(Statement s) {
		statements = new Vector<Statement>();
		statements.add(s);
	}

	public Program(Statement s, Program p) {
		statements = p.getStatements();
		statements.add(s);
	}
	
	public Vector<Statement> getStatements() { return statements; }

	public String toXML() {
		String result = "<Program>\n";
		for(int i=statements.size(); i>0; i--){
			Statement stmt = (Statement)statements.elementAt(i-1);
			result += stmt.toXML(1);
		}
		result += "</Program>";
		return result;
	}
}