package score;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class ChanceScoreTest {

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
