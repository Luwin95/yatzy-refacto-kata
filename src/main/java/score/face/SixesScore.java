package score.face;

import dice.DiceResult;

public class SixesScore extends FaceScore {
    private static final int SIX_FACE = 6;

    private static final SixesScore instance = new SixesScore();

    public static SixesScore getInstance(){
        return instance;
    }

    private SixesScore() {
        super(SIX_FACE);
    }
}
