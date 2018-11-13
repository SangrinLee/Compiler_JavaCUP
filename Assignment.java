import java.util.*;
public class Assignment extends Statement {
	private String lhs;
	private Expr rhs;

	public Assignment(String l, Expr r) {
		lhs = l; rhs = r;
	}
	
	public String toXML(int tnum) {
		String result = ""; 

		for(int i=0; i<tnum; i++)
			result += "\t";
		result += "<Assignment>\n";

		for(int i=0; i<tnum+1; i++)
			result += "\t";
		result += "<lhs>" + lhs + "</lhs>\n";
		result += rhs.toXML(tnum+1);

		for(int i=0; i<tnum; i++)
			result += "\t";
		result += "</Assignment>\n";

		return result;
	}
}



