package score.face;

import dice.DiceResult;

public class FoursScore extends FaceScore{
    private static final int FOUR_FACE = 4;

    private static final FoursScore instance = new FoursScore();

    public static FoursScore getInstance(){
        return instance;
    }

    private FoursScore() {
        super(FOUR_FACE);
    }
}
