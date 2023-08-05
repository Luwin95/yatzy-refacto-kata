package score.severalOfAKind;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class TwoPairsScoreTest {
    /**
     * Given 3, 3, 5, 4, 5 dices results
     * When calculating two pair result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeFiveFourFiveDicesResults_whenCalculateTwoPairsScore_ThenReturnSixteen() throws UnconsistentDiceResult {
        TwoPairsScore actualTwoPairsScore = new TwoPairsScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );
        assertEquals(16, actualTwoPairsScore.calculateScore());
    }

    /**
     * Given 3, 3, 5, 5, 5 dices results
     * When calculating two pair result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeFiveFiveFourFiveDicesResults_whenCalculateTwoPairsScore_ThenReturnSixteen() throws UnconsistentDiceResult {
        TwoPairsScore actualTwoPairsScore = new TwoPairsScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );
        assertEquals(16, actualTwoPairsScore.calculateScore());
    }

}
