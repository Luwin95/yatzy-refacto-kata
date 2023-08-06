package score;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FullHouseScoreTest extends AbstractScoreTest {
    /**
     * Given 6, 2, 2, 2, 6 dices results
     * When calculating full house result
     * Then return 18
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoTwoTwoSixDicesResults_whenCalculateFullHouseScore_ThenReturnEighteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.six(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.six()
        );

        assertEquals(18, FullHouseScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 2, 3, 4, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveSixDicesResults_whenCalculateFullHouseScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(0, FullHouseScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 2, 2, 4, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoTwoFourFiveSixDicesResults_whenCalculateFullHouseScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(0, FullHouseScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 2, 2, 2, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoTwoTwoFiveSixDicesResults_whenCalculateFullHouseScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(0, FullHouseScore.getInstance().calculateScore(diceResults));
    }
}
