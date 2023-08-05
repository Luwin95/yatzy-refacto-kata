package score.severalOfAKind;

import dice.DiceResult;

public class ThreeOfAKindScore extends SeveralOfAKindScore{
    private static final int THREE_OF_A_KIND_NUMBER = 3;

    public ThreeOfAKindScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, THREE_OF_A_KIND_NUMBER);
    }
}
