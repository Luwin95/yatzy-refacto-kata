package score.fixed.straight;

import dice.DiceResult;

public class SmallStraightScore extends StraightScore{
    private static final int SMALL_STRAIGHT_SCORE = 15;

    private static final int[] SMALL_STRAIGHT_VALUES = {1,2,3,4,5};

    private static final SmallStraightScore instance = new SmallStraightScore();

    public static SmallStraightScore getInstance(){
        return instance;
    }

    private SmallStraightScore() {
        super(SMALL_STRAIGHT_SCORE, SMALL_STRAIGHT_VALUES);
    }
}
