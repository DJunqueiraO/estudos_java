package exercices.codingbat.string_2;

public class XyBalance {
	public boolean xyBalance(String str) {
		  boolean balanced = true;
		  
		  for(int i = 0; i < str.length(); i++) {
		    char character = str.charAt(i);
		    if(character == 'y') {
		      balanced = true;
		    }
		    if(character == 'x') {
		      balanced = false;
		    }
		  }
		  return balanced;
		}

}
