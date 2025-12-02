package exercices.codingbat.string_2;

public class CatDog {
	public boolean catDog(String str) {
		  final int withoutCatLength = str.replace("cat", "").length();
		  final int withoutDogLength = str.replace("dog", "").length();
		  return withoutDogLength ==withoutCatLength;
		}

}
