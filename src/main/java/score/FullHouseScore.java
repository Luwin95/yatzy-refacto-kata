package score;

import dice.DiceResult;

import java.util.concurrent.atomic.AtomicInteger;

public class FullHouseScore extends AbstractScore{

    public FullHouseScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

    @Override
    public int calculateScore() {
        AtomicInteger pairScore = new AtomicInteger();
        AtomicInteger threeOfAKindScore = new AtomicInteger();
        this.diceResults.stream().mapToInt(DiceResult::getResult).distinct().forEach(diceFace -> {
            if(this.diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() == 2){
                pairScore.set(diceFace * 2);
            }
            if(this.diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() == 3){
                threeOfAKindScore.set(diceFace * 3);
            }
        });
        return pairScore.get() != 0 && threeOfAKindScore.get() != 0 ? pairScore.get() + threeOfAKindScore.get() : 0;
    }
}
