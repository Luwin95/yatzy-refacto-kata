package score.face;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class SixesScoreTest {
    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating sixes result
     * Then return 0
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenCalculateSixesScore_ThenReturnZero() throws UnconsistentDiceResult {
        SixesScore actualSixesScore = new SixesScore(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(0, actualSixesScore.calculateScore());
    }

    /**
     * Given 4, 4, 6, 5, 5 dices results
     * When calculating sixes result
     * Then return 6
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourSixFiveFiveDicesResults_whenCalculateSixesScore_ThenReturnSixes() throws UnconsistentDiceResult {
        SixesScore actualSixesScore = new SixesScore(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.six(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(6, actualSixesScore.calculateScore());
    }

    /**
     * Given 6, 5, 6, 6, 5 dices results
     * When calculating sixes result
     * Then return 18
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixFiveSixSixFiveDicesResults_whenCalculateSixesScore_ThenReturnEighteen() throws UnconsistentDiceResult {
        SixesScore actualSixesScore = new SixesScore(
            DiceResultDataSet.six(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.five()
        );

        assertEquals(18, actualSixesScore.calculateScore());
    }
}
