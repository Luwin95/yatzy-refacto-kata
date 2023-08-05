package score.fixed.straight;

import dice.DiceResult;

public class LargeStraightScore extends StraightScore{
    private static final int LARGE_STRAIGHT_SCORE = 20;

    private static final int[] LARGE_STRAIGHT_VALUES = {2,3,4,5,6};

    public LargeStraightScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, LARGE_STRAIGHT_SCORE, LARGE_STRAIGHT_VALUES);
    }
}
