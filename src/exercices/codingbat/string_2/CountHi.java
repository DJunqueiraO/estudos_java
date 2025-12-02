package exercices.codingbat.string_2;

public class CountHi {
	public int countHi(String str) {
		final int fullLength = str.length();
		final int reducedLength = str.replace("hi", "").length();
		final int lengthDiference = fullLength - reducedLength;
		return lengthDiference/2;
	}

	// public int countHi(String str) {
	//   int count = 0;
	//   for (int i = 0; i < (str.length() - 1); i++) {
//	     if (str.substring(i, i+2).equals("hi")) count++;
	//   }
	//   return count;
	// }

}
