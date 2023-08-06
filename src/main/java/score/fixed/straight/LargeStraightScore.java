package score.fixed.straight;

import dice.DiceResult;
import score.face.TwosScore;

public class LargeStraightScore extends StraightScore{
    private static final int LARGE_STRAIGHT_SCORE = 20;

    private static final int[] LARGE_STRAIGHT_VALUES = {2,3,4,5,6};

    private static final LargeStraightScore instance = new LargeStraightScore();

    public static LargeStraightScore getInstance(){
        return instance;
    }

    private LargeStraightScore() {
        super(LARGE_STRAIGHT_SCORE, LARGE_STRAIGHT_VALUES);
    }
}
