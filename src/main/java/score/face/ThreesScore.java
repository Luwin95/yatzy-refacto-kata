package score.face;

import dice.DiceResult;

public class ThreesScore extends FaceScore{
    private static final int THREE_FACE = 3;

    public ThreesScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, THREE_FACE);
    }
}
