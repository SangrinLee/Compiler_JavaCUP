import java.util.*;
public class Expr {
	private int value;
	private String id;
	private Expr left;
	private Expr right;
	private String op;

	public Expr(Expr l, Expr r, String o) {
		left = l; right = r; op = o;
	}
	public Expr(Integer i) {
		value = i.intValue();
	}
	public Expr(String i) {
		id = i;
	}

	public String toXML(int tnum) {
		String result = "";
		if(op != null) {
			for(int i=0; i<tnum; i++)
				result += "\t";
			result += "<Expr>\n";

			for(int i=0; i<tnum+1; i++)
				result += "\t";
			result += "<op>";
			result += op;
			result += "</op>\n";
			result += left.toXML(tnum+1);
			result += right.toXML(tnum+1);

		for(int i=0; i<tnum; i++)
			result += "\t";
		result += "</Expr>\n";
		}
		else if(id != null) {
			for(int i=0; i<tnum; i++)
				result += "\t";
			result += "<Expr>";

			result += id;
			result += "</Expr>\n";
		}
		else {
			for(int i=0; i<tnum; i++)
				result += "\t";
			result += "<Expr>\n";

			for(int i=0; i<tnum+1; i++)
				result += "\t";
			result += "<value>";
			result += Integer.toString(value);
			result += "</value>\n";

		for(int i=0; i<tnum; i++)
			result += "\t";
		result += "</Expr>\n";
		}
		return result;
	}
}

