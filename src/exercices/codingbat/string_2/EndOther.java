package exercices.codingbat.string_2;

public class EndOther {
	public boolean endOther(String a, String b) {
		  return (
		    (
		      a.length() >= b.length() && 
		      a.substring(a.length() - b.length()).equalsIgnoreCase(b)
		    ) ||
		    (
		      b.length() >= a.length() && 
		      b.substring(b.length() - a.length()).equalsIgnoreCase(a)
		    )
		  );
		}

}
