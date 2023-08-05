package score;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class YatzyScoreTest {

    /**
     * Given 4, 4, 4, 4, 4 dices results
     * When calculating yatzy result
     * Then return 50
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlyFoursDicesResults_whenCalculateYatzyScore_ThenReturnFifty() throws UnconsistentDiceResult {
        YatzyScore actualYatzyScore = new YatzyScore(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four()
        );

        assertEquals(50, actualYatzyScore.calculateScore());
    }

    /**
     * Given 6, 6, 6, 6, 6 dices results
     * When calculating yatzy result
     * Then return 50
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlySixesDicesResults_whenCalculateYatzyScore_ThenReturnFifty() throws UnconsistentDiceResult {
        YatzyScore actualYatzyScore = new YatzyScore(
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six()
        );

        assertEquals(50, actualYatzyScore.calculateScore());
    }

    /**
     * Given 6, 6, 6, 6, 3 dices results
     * When calculating yatzy result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourSixesAndAThreeDicesResults_whenCalculateYatzyScore_ThenReturnZero() throws UnconsistentDiceResult {
        YatzyScore actualYatzyScore = new YatzyScore(
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.three()
        );
        assertEquals(0, actualYatzyScore.calculateScore());
    }
}
