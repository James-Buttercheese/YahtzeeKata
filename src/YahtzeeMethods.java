
public class YahtzeeMethods {

	public static int score(int[] dice, String choice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] < 0 || dice[i] > 6) {
				throw new IllegalArgumentException();
			}
			if (dice.length != 5) {
				throw new IndexOutOfBoundsException();
			}
		}
		if (choice.equals("chance")) {
			score = chance(dice);
		} else if (choice.equals("yahtzee")) {
			score = Yahtzee(dice);
		} else if (choice.equals("ones")) {
			score = Ones(dice);
		} else if (choice.equals("twos")) {
			score = Twos(dice);
		} else if (choice.equals("threes")) {
			score = Threes(dice);
		} else if (choice.equals("fours")) {
			score = Fours(dice);
		} else if (choice.equals("fives")) {
			score = Fives(dice);
		} else if (choice.equals("sixes")) {
			score = Sixes(dice);
		} else if (choice.equals("pair")) {
			score = Pair(dice);
		} else if (choice.equals("two pair")) {
			score = TwoPair(dice);
		} else if (choice.equals("three of a kind")) {
			score = ThreeOfA(dice);
		} else {
			throw new IllegalArgumentException();
		}

		return score;
	}

	public static int chance(int[] dice) {
		int totalScore = 0;

		for (int i = 0; i < 5; i++) {
			totalScore += dice[i];
		}
		return totalScore;
	}

	public static int Yahtzee(int[] dice) {

		for (int i = 1; i < 5; i++) {
			if (dice[0] != dice[i]) {
				return 0;
			}
		}
		return 50;
	}

	public static int Ones(int[] dice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] == 1) {
				score += 1;
			}
		}
		return score;

	}

	public static int Twos(int[] dice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] == 2) {
				score += 2;
			}
		}
		return score;

	}

	public static int Threes(int[] dice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] == 3) {
				score += 3;
			}
		}
		return score;

	}

	public static int Fours(int[] dice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] == 4) {
				score += 4;
			}
		}
		return score;

	}

	public static int Fives(int[] dice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] == 5) {
				score += 5;
			}
		}
		return score;

	}

	public static int Sixes(int[] dice) {
		int score = 0;

		for (int i = 0; i < 5; i++) {
			if (dice[i] == 6) {
				score += 6;
			}
		}
		return score;

	}

	public static int Pair(int[] dice) {

		for (int pip = 6; pip > 0; pip--) {
			for (int i = 0; i < 4; i++) {
				if (pip == dice[i]) {
					for (i = i; i < 4; i++) {
						if (pip == dice[i + 1]) {
							return pip * 2;
						}
					}
				}
			}
		}
		return 0;
	}

	public static int TwoPair(int[] dice) {
		int score = 0;
		for (int pip = 6; pip > 0; pip--) {
			for (int i = 0; i < 4; i++) {
				if (pip == dice[i]) {
					for (i = i; i < 4; i++) {
						if (pip == dice[i + 1]) {
							score = score + pip * 2;
							break;
						}
					}
				}
			}
			
		}return score;
	}
	public static int ThreeOfA(int[] dice) {
		int counter = 0;
		for (int pip = 6; pip > 0; pip--) {
			counter = 0;
			for (int i = 0; i < 5; i++) {
				if (dice[i] == pip) {
					counter++;
					if (counter == 3) {
						return (pip * 3);
					}
				}
			}
			
		}return 0;
	}
}