package score;

import dice.DiceResult;

public class ChanceScore extends AbstractScore {

    public ChanceScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

    /**
     * A chance score is the sum of all dice result
     * @return the total of all five dices
     */
    @Override
    public int calculateScore() {
        return this.diceResults.stream().mapToInt(DiceResult::getResult).sum();
    }
}
