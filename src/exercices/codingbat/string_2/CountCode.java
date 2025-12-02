package exercices.codingbat.string_2;

public class CountCode {
	public int countCode(String str) {
		  
		  int counter = 0;
		  
		  for(int i = 0; i < str.length(); i++) {
		    if(i > 2) {
		      int char1 = str.charAt(i - 3);
		      int char2 = str.charAt(i - 2);
		      int char4 = str.charAt(i);
		      
		      if(
		        char1 == 'c' &&
		        char2 == 'o' &&
		        char4 == 'e'
		      ) {
		        counter++;
		      }
		    }
		  }
		  
		  return counter;
		}

}
