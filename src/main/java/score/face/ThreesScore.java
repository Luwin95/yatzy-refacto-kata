package score.face;

import dice.DiceResult;

public class ThreesScore extends FaceScore{
    private static final int THREE_FACE = 3;

    private static final ThreesScore instance = new ThreesScore();

    public static ThreesScore getInstance(){
        return instance;
    }

    private ThreesScore() {
        super(THREE_FACE);
    }
}
