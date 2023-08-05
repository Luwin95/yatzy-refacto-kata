package score.severalOfAKind;

import dice.DiceResult;

public class FourOfAKindScore extends SeveralOfAKindScore{
    private static final int FOUR_OF_A_KIND_NUMBER = 4;

    public FourOfAKindScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, FOUR_OF_A_KIND_NUMBER);
    }
}
