package exercices.codingbat.string_2;

public class BobThere {
	public boolean bobThere(String str) {
		  // return str.replaceAll("b.b", "bob").contains("bob");
		  return str.matches(".*b.b.*");
		}

}
