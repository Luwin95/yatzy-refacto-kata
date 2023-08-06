package score;

import dice.DiceResult;
import score.severalOfAKind.TwoPairsScore;

import java.util.List;

public class ChanceScore extends AbstractScore {

    private static final ChanceScore instance = new ChanceScore();

    public static ChanceScore getInstance(){
        return instance;
    }

    private ChanceScore(){}
    /**
     * A chance score is the sum of all dice result
     * @return the total of all five dices
     */
    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        return diceResults.stream().mapToInt(DiceResult::getResult).sum();
    }
}
