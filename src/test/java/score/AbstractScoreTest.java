package score;

import dice.DiceResult;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractScoreTest {
    protected List<DiceResult> initializeDicesResults(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult){
        return Arrays.asList(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }
}
