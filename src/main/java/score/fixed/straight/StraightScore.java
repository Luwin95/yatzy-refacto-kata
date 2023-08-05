package score.fixed.straight;

import dice.DiceResult;
import score.fixed.FixedScore;

import java.util.Arrays;

abstract class StraightScore extends FixedScore {
    protected final int[] straightValues;

    public StraightScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult, int score, int[] straightValues) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, score);
        this.straightValues = straightValues;
    }

    @Override
    public int calculateScore() {
        return Arrays.equals(this.diceResults.stream().mapToInt(DiceResult::getResult).sorted().toArray(), straightValues) ? this.score : 0;
    }
}
