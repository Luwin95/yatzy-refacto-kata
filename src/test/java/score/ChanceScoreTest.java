package score;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class ChanceScoreTest {
    /**
     * Given 2, 3, 4, 5, 1 dices results
     * When calculating chance result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveAndOneDicesResults_whenCalculateChanceScore_ThenReturnFifteen() throws UnconsistentDiceResult {
        ChanceScore actualChanceScore = new ChanceScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.one()
        );

        assertEquals(15, actualChanceScore.calculateScore());
    }

    /**
     * Given 3, 3, 4, 5, 1 dices results
     * When calculating chance result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeFourFiveAndOneDicesResults_whenCalculateChanceScore_ThenReturnSixteen() throws UnconsistentDiceResult {
        ChanceScore actualChanceScore = new ChanceScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.one()
        );
        assertEquals(16, actualChanceScore.calculateScore());
    }

}
