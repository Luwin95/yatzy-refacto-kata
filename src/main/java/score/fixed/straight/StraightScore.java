package score.fixed.straight;

import dice.DiceResult;
import score.fixed.FixedScore;

import java.util.Arrays;
import java.util.List;

abstract class StraightScore extends FixedScore {
    protected final int[] straightValues;

    public StraightScore(int score, int[] straightValues) {
        super(score);
        this.straightValues = straightValues;
    }

    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        return Arrays.equals(diceResults.stream().mapToInt(DiceResult::getResult).sorted().toArray(), straightValues) ? this.score : 0;
    }
}
