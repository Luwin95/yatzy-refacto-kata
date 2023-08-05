package dice;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Assert;
import org.junit.Test;
import utils.DiceResultDataSet;

public class DiceResultTest {

    @Test
    public void givenAValidOneDiceResult_whenAccessingResult_thenReturnTheDiceResultOne() throws UnconsistentDiceResult {
        Assert.assertEquals(1, DiceResultDataSet.one().getResult());
    }

    @Test
    public void givenAValidTwoDiceResult_whenAccessingResult_thenReturnTheDiceResultTwo() throws UnconsistentDiceResult {
        Assert.assertEquals(2, DiceResultDataSet.two().getResult());
    }

    @Test
    public void givenAValidThreeDiceResult_whenAccessingResult_thenReturnTheDiceResultThree() throws UnconsistentDiceResult {
        Assert.assertEquals(3, DiceResultDataSet.three().getResult());
    }

    @Test
    public void givenAValidFourDiceResult_whenAccessingResult_thenReturnTheDiceResultFour() throws UnconsistentDiceResult {
        Assert.assertEquals(4, DiceResultDataSet.four().getResult());
    }

    @Test
    public void givenAValidFiveDiceResult_whenAccessingResult_thenReturnTheDiceResultFive() throws UnconsistentDiceResult {
        Assert.assertEquals(5, DiceResultDataSet.five().getResult());
    }

    @Test
    public void givenAValidSixDiceResult_whenAccessingResult_thenReturnTheDiceResultSix() throws UnconsistentDiceResult {
        Assert.assertEquals(6, DiceResultDataSet.six().getResult());
    }

    @Test(expected = UnconsistentDiceResult.class)
    public void givenADiceResultInferiorToOne_whenInstantiatingResult_thenThrowAnUnconsistentException() throws UnconsistentDiceResult {
        new DiceResult(0);
    }

    @Test(expected = UnconsistentDiceResult.class)
    public void givenADiceResultSuperiorToSix_whenInstantiatingResult_thenThrowAnUnconsistentException() throws UnconsistentDiceResult {
        new DiceResult(7);
    }
}
