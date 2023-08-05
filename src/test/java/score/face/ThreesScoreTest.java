package score.face;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class ThreesScoreTest {
    /**
     * Given 1, 2, 3, 2, 3 dices results
     * When calculating chance result
     * Then return 6
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeTwoThreeDicesResults_whenCalculateThreesScore_ThenReturnSix() throws UnconsistentDiceResult {
        ThreesScore actualThreesScore = new ThreesScore(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three()
        );

        assertEquals(6, actualThreesScore.calculateScore());
    }

    /**
     * Given 2, 3, 3, 3, 3 dices results
     * When calculating chance result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeThreeThreeThreeDicesResults_whenCalculateThreesScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        ThreesScore actualThreesScore = new ThreesScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three()
        );

        assertEquals(12, actualThreesScore.calculateScore());
    }
}
