package exercices.codingbat.string_2;

import java.util.stream.Collectors;

public class DoubleChar {
	// public String doubleChar(String str) {
//  StringBuilder stringBuilder = new StringBuilder();
//  for(int i = 0; i < str.length(); i++) {
//    stringBuilder.append(str.charAt(i));
//    stringBuilder.append(str.charAt(i));
//  }
//  return stringBuilder.toString();
//}

public String doubleChar(String str) {
 return str
   .chars()
   .mapToObj(character -> String.format("%s%s", (char) character, (char) character))
   .collect(Collectors.joining());
}
}
