package exercices.codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
	public List<Integer> rightDigit(List<Integer> nums) {
		return nums
				.stream()
				.map(num -> {return num % 10;})
				.collect(Collectors.toList());
	}
}
