package score.severalOfAKind;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class ThreeOfAKindScoreTest {
    /**
     * Given 3, 3, 3, 4, 5 dices results
     * When calculating three of a kind result
     * Then return 9
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeFourFiveDicesResults_whenCalculateThreeOfAKindScore_ThenReturnNine() throws UnconsistentDiceResult {
        ThreeOfAKindScore actualThreeOfAKindScore = new ThreeOfAKindScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );
        assertEquals(9, actualThreeOfAKindScore.calculateScore());
    }

    /**
     * Given 5, 3, 5, 4, 5 dices results
     * When calculating three of a kind result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeFiveFourFiveDicesResults_whenCalculateThreeOfAKindScore_ThenReturnFifteen() throws UnconsistentDiceResult {
        ThreeOfAKindScore actualThreeOfAKindScore = new ThreeOfAKindScore(
            DiceResultDataSet.five(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );
        assertEquals(15, actualThreeOfAKindScore.calculateScore());
    }

    /**
     * Given 3, 3, 3, 3, 5 dices results
     * When calculating three of a kind result
     * Then return 9
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeThreeFiveDicesResults_whenCalculateThreeOfAKindScore_ThenReturnNine() throws UnconsistentDiceResult {
        ThreeOfAKindScore actualThreeOfAKindScore = new ThreeOfAKindScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five()
        );
        assertEquals(9, actualThreeOfAKindScore.calculateScore());
    }
}
