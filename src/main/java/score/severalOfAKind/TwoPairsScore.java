package score.severalOfAKind;

import dice.DiceResult;

public class TwoPairsScore extends SeveralOfAKindScore{
    private static final int NUMBER_OF_KIND_PAIR = 2;

    public TwoPairsScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, NUMBER_OF_KIND_PAIR);
    }
}
