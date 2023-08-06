package score;

import dice.DiceResult;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FullHouseScore extends AbstractScore{

    private static final FullHouseScore instance = new FullHouseScore();

    public static FullHouseScore getInstance(){
        return instance;
    }

    private FullHouseScore(){}

    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        AtomicInteger pairScore = new AtomicInteger();
        AtomicInteger threeOfAKindScore = new AtomicInteger();
        diceResults.stream().mapToInt(DiceResult::getResult).distinct().forEach(diceFace -> {
            if(diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() == 2){
                pairScore.set(diceFace * 2);
            }
            if(diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() == 3){
                threeOfAKindScore.set(diceFace * 3);
            }
        });
        return pairScore.get() != 0 && threeOfAKindScore.get() != 0 ? pairScore.get() + threeOfAKindScore.get() : 0;
    }
}
