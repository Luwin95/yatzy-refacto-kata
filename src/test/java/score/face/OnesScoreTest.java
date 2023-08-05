package score.face;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class OnesScoreTest {
    /**
     * Given 1, 2, 3, 4, 5 dices results
     * When calculating ones result
     * Then return 1
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeFourFiveDicesResults_whenCalculateOnesScore_ThenReturnOne() throws UnconsistentDiceResult {
        OnesScore actualOnesScore = new OnesScore(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(1, actualOnesScore.calculateScore());
    }

    /**
     * Given 1, 2, 1, 4, 5 dices results
     * When calculating ones result
     * Then return 2
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoOneFourFiveDicesResults_whenCalculateOnesScore_ThenReturnTwo() throws UnconsistentDiceResult {
        OnesScore actualOnesScore = new OnesScore(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.one(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(2, actualOnesScore.calculateScore());
    }

    /**
     * Given 6, 2, 2, 4, 5 dices results
     * When calculating ones result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoTwoFourFiveDicesResults_whenCalculateOnesScore_ThenReturnZero() throws UnconsistentDiceResult {
        OnesScore actualOnesScore = new OnesScore(
            DiceResultDataSet.six(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(0, actualOnesScore.calculateScore());
    }

    /**
     * Given 1, 2, 1, 1, 1 dices results
     * When calculating ones result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoOneOneOneDicesResults_whenCalculateOnesScore_ThenReturnFour() throws UnconsistentDiceResult {
        OnesScore actualOnesScore = new OnesScore(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.one(),
            DiceResultDataSet.one(),
            DiceResultDataSet.one()
        );

        assertEquals(4, actualOnesScore.calculateScore());
    }
}
