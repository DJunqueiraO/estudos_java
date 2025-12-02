package exercices.codingbat.string_2;

public class XyzThere {
	public boolean xyzThere(String str) {
		  
		  // return str.replaceAll("\\.xyz", "").contains("xyz");
		  return str.matches(".*(?<!\\.)xyz.*");
		}

}
