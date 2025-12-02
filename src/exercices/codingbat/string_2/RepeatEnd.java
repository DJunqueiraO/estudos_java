package exercices.codingbat.string_2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		  final StringBuilder result = new StringBuilder();

		  for (int i = n; i > 0; i--) {
		    result.append(str.substring(str.length() - n));
		  }
		  
		  return result.toString();
		}

}
