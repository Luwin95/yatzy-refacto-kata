package score.face;

import dice.DiceResult;

public class FoursScore extends FaceScore{
    private static final int FOUR_FACE = 4;

    public FoursScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, FOUR_FACE);
    }
}
