package score.face;

import dice.DiceResult;

public class SixesScore extends FaceScore {
    private static final int SIX_FACE = 6;

    public SixesScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, SIX_FACE);
    }
}
