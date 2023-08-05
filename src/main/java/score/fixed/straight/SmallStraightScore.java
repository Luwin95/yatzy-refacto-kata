package score.fixed.straight;

import dice.DiceResult;

public class SmallStraightScore extends StraightScore{
    private static final int SMALL_STRAIGHT_SCORE = 15;

    private static final int[] SMALL_STRAIGHT_VALUES = {1,2,3,4,5};

    public SmallStraightScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, SMALL_STRAIGHT_SCORE, SMALL_STRAIGHT_VALUES);
    }
}
