package score;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class FullHouseScoreTest {
    /**
     * Given 6, 2, 2, 2, 6 dices results
     * When calculating full house result
     * Then return 18
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoTwoTwoSixDicesResults_whenCalculateFullHouseScore_ThenReturnEighteen() throws UnconsistentDiceResult {
        FullHouseScore actualFullHouseScore = new FullHouseScore(
            DiceResultDataSet.six(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.six()
        );

        assertEquals(18, actualFullHouseScore.calculateScore());
    }

    /**
     * Given 2, 3, 4, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveSixDicesResults_whenCalculateFullHouseScore_ThenReturnZero() throws UnconsistentDiceResult {
        FullHouseScore actualFullHouseScore = new FullHouseScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(0, actualFullHouseScore.calculateScore());
    }

    /**
     * Given 2, 2, 4, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoTwoFourFiveSixDicesResults_whenCalculateFullHouseScore_ThenReturnZero() throws UnconsistentDiceResult {
        FullHouseScore actualFullHouseScore = new FullHouseScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(0, actualFullHouseScore.calculateScore());
    }

    /**
     * Given 2, 2, 2, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoTwoTwoFiveSixDicesResults_whenCalculateFullHouseScore_ThenReturnZero() throws UnconsistentDiceResult {
        FullHouseScore actualFullHouseScore = new FullHouseScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(0, actualFullHouseScore.calculateScore());
    }
}
