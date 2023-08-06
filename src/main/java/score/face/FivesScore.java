package score.face;

import dice.DiceResult;

public class FivesScore extends FaceScore{
    private static final int FIVE_FACE = 5;

    private static final FivesScore instance = new FivesScore();

    public static FivesScore getInstance(){
        return instance;
    }

    private FivesScore() {
        super(FIVE_FACE);
    }
}
