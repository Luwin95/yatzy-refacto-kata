package score;

import dice.DiceResult;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractScore {

    public abstract int calculateScore(List<DiceResult> diceResults);
}
