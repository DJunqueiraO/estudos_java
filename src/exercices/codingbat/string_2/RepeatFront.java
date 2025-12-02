package exercices.codingbat.string_2;

public class RepeatFront {
	public String repeatFront(String str, int n) {
		  final StringBuilder result = new StringBuilder();
		  for(; n > 0; n--) {
		    result.append(str.substring(0, n));
		  }
		  return result.toString();
		}

}
