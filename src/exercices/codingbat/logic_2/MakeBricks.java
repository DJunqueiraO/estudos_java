package exercices.codingbat.logic_2;

public class MakeBricks {
	
	public static void main(String[] args) {
		System.out.println(makeBricks(3, 1, 8)); //→ true
		System.out.println(makeBricks(3, 1, 9)); //→ false
		System.out.println(makeBricks(3, 2, 10)); //→ true
	}
	
	public static boolean makeBricks(int small, int big, int goal) {
	    int bigBricksUsed = Math.min(goal / 5, big);
	    int remainingGoal = goal - (bigBricksUsed * 5);
	    return remainingGoal <= small;
	}

	// public boolean makeBricks(int small, int big, int goal) {

//	 		if(big*5 >= goal && (goal % (big*5)) == 0) {
//	 			return true;
//	 		}

//	 		if(small >= goal) {
//	 			return true;
//	 		}
			
//	 		int row = 0;
			
//	 		for(int i = 0; i < big; i++) {
//	 			int next_row = row + 5;
//	 			if(next_row > goal) {
//	 				break;
//	 			}
//	 			if(next_row == goal) {
//	 				return true;
//	 			}
//	 			row = next_row;
//	 		}
//	 		for(int i = 0; i < small; i++) {
//	 			row += 1;
//	 			if(row == goal) {
//	 				return true;
//	 			}
//	 		}
			
//	 		return false;
	// }

}
