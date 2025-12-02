package exercices.codingbat.string_2;

public class MixString {
	public String mixString(String a, String b) {
		  final boolean aLessOrEqualB = a.length() <= b.length();
		  
		  StringBuilder result = new StringBuilder();
		  
		  for(int i = 0; i < (aLessOrEqualB? a : b).length(); i++) {
		    char aChar = a.charAt(i);
		    char bChar = b.charAt(i);
		    result.append(aChar);
		    result.append(bChar);
		  }
		  if(aLessOrEqualB) {
		    result.append(b.substring(a.length()));
		  } else {
		    result.append(a.substring(b.length()));
		  }
		  
		  return result.toString();
		}

}
