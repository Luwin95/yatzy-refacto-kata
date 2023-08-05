package score.severalOfAKind;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class FourOfAKindScoreTest {
    /**
     * Given 3, 3, 3, 3, 5 dices results
     * When calculating four of a kind result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeThreeFiveDicesResults_whenCalculateFourOfAKindScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        FourOfAKindScore actualFourOfAKindScore = new FourOfAKindScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five()
        );
        assertEquals(12, actualFourOfAKindScore.calculateScore());
    }

    /**
     * Given 5, 5, 5, 4, 5 dices results
     * When calculating four of a kind result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveFiveFiveFourFiveDicesResults_whenCalculateFourOfAKindScore_ThenReturnTwenty() throws UnconsistentDiceResult {
        FourOfAKindScore actualFourOfAKindScore = new FourOfAKindScore(
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );
        assertEquals(20, actualFourOfAKindScore.calculateScore());
    }

    /**
     * Given 3, 3, 3, 3, 3 dices results
     * When calculating four of a kind result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlyThreesDicesResults_whenCalculateFourOfAKindScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        FourOfAKindScore actualFourOfAKindScore = new FourOfAKindScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three()
        );
        assertEquals(12, actualFourOfAKindScore.calculateScore());
    }
}
