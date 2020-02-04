import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YahtzeeTests {

	@Test
	void bingoQuestionMark() {
		int[] dice = { 1, 2, 3, 4, 5 };
		assertThrows(IllegalArgumentException.class, () -> {
			YahtzeeMethods.score(dice, "bingo");
		});
	}

	@Test
	void lowDice() {
		int[] dice = { 1, -2, 3, 4, 5 };
		assertThrows(IllegalArgumentException.class, () -> {
			YahtzeeMethods.score(dice, "chance");
		});
	}

	@Test
	void highDice() {
		int[] dice = { 1, 2, 3, 14, 5 };
		assertThrows(IllegalArgumentException.class, () -> {
			YahtzeeMethods.score(dice, "chance");
		});
	}

	@Test
	void notFiveDice() {
		int[] dice = { 1, 2, 3, 4, 5, 6 };
		assertThrows(IndexOutOfBoundsException.class, () -> {
			YahtzeeMethods.score(dice, "chance");
		});
	}

	@Test
	void chanceTest() {
		int[] dice = { 1, 2, 3, 4, 5 };
		int result = YahtzeeMethods.chance(dice);

		assertEquals(15, result);
	}

	@Test
	void chanceThroughScoreTest() {
		int[] dice = { 1, 2, 3, 4, 5 };
		int result = YahtzeeMethods.score(dice, "chance");

		assertEquals(15, result);
	}

	@Test
	void noYahtzeeTest() {
		int[] dice = { 1, 2, 3, 4, 5 };
		int result = YahtzeeMethods.Yahtzee(dice);

		assertEquals(0, result);
	}

	@Test
	void yesYahtzeeTest() {
		int[] dice = { 3, 3, 3, 3, 3 };
		int result = YahtzeeMethods.Yahtzee(dice);

		assertEquals(50, result);
	}

	@Test
	void yahtzeeThroughScoreTest() {
		int[] dice = { 6, 6, 6, 6, 6 };
		int result = YahtzeeMethods.score(dice, "yahtzee");

		assertEquals(50, result);
	}

	@Test
	void onesTest() {
		int[] dice = { 1, 1, 3, 3, 3 };
		int result = YahtzeeMethods.Ones(dice);

		assertEquals(2, result);
	}

	@Test
	void onesThroughScoreTest() {
		int[] dice = { 1, 6, 6, 6, 6 };
		int result = YahtzeeMethods.score(dice, "ones");

		assertEquals(1, result);
	}

	@Test
	void twosTest() {
		int[] dice = { 2, 2, 2, 3, 3 };
		int result = YahtzeeMethods.Twos(dice);

		assertEquals(6, result);
	}

	@Test
	void twosThroughScoreTest() {
		int[] dice = { 2, 2, 6, 6, 6 };
		int result = YahtzeeMethods.score(dice, "twos");

		assertEquals(4, result);
	}

	@Test
	void threesTest() {
		int[] dice = { 2, 2, 2, 3, 3 };
		int result = YahtzeeMethods.Threes(dice);

		assertEquals(6, result);
	}

	@Test
	void threesThroughScoreTest() {
		int[] dice = { 2, 2, 3, 6, 6 };
		int result = YahtzeeMethods.score(dice, "threes");

		assertEquals(3, result);
	}
	@Test
	void foursTest() {
		int[] dice = { 4, 2, 4, 3, 4 };
		int result = YahtzeeMethods.Fours(dice);

		assertEquals(12, result);
	}

	@Test
	void foursThroughScoreTest() {
		int[] dice = { 4, 4, 4, 4, 6 };
		int result = YahtzeeMethods.score(dice, "fours");

		assertEquals(16, result);
	}
	@Test
	void fivesTest() {
		int[] dice = { 5, 2, 4, 3, 4 };
		int result = YahtzeeMethods.Fives(dice);

		assertEquals(5, result);
	}

	@Test
	void fivesThroughScoreTest() {
		int[] dice = { 4, 5, 4, 5, 6 };
		int result = YahtzeeMethods.score(dice, "fives");

		assertEquals(10, result);
	}
	@Test
	void sixesTest() {
		int[] dice = { 5, 6, 4, 6, 4 };
		int result = YahtzeeMethods.Sixes(dice);

		assertEquals(12, result);
	}

	@Test
	void sixesThroughScoreTest() {
		int[] dice = { 4, 5, 4, 5, 6 };
		int result = YahtzeeMethods.score(dice, "sixes");

		assertEquals(6, result);
	}
	@Test
	void pairTest() {
		int[] dice = { 5, 6, 4, 5, 4 };
		int result = YahtzeeMethods.Pair(dice);

		assertEquals(10, result);
	}

	@Test
	void pairThroughScoreTest() {
		int[] dice = { 6, 5, 4, 5, 6 };
		int result = YahtzeeMethods.score(dice, "pair");

		assertEquals(12, result);
	}
	@Test
	void twoPairTest() {
		int[] dice = { 5, 6, 4, 5, 4 };
		int result = YahtzeeMethods.TwoPair(dice);

		assertEquals(18, result);
	}

	@Test
	void twoPairThroughScoreTest() {
		int[] dice = { 6, 5, 4, 5, 6 };
		int result = YahtzeeMethods.score(dice, "two pair");

		assertEquals(22, result);
	}
	@Test
	void threeOfATest() {
		int[] dice = { 4, 6, 4, 5, 4 };
		int result = YahtzeeMethods.ThreeOfA(dice);

		assertEquals(12, result);
	}

	@Test
	void threeOfAThroughScoreTest() {
		int[] dice = { 6, 5, 6, 5, 6 };
		int result = YahtzeeMethods.score(dice, "three of a kind");

		assertEquals(18, result);
	}
}
