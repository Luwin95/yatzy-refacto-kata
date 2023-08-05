package dice;

import dice.exceptions.UnconsistentDiceResult;

public class DiceResult {
    private final int result;
    private static final int DICE_MIN_RESULT = 1;
    private static final int DICE_MAX_RESULT = 6;

    /**
     * A dice result is an integer between 1 and 6
     * @param result the result of the dice
     * @throws UnconsistentDiceResult thrown when a dice is created without respecting the result limitation.
     */
    public DiceResult(int result) throws UnconsistentDiceResult {
        if(result >= DICE_MIN_RESULT && result <= DICE_MAX_RESULT){
            this.result = result;
        }else{
            throw new UnconsistentDiceResult();
        }
    }

    public int getResult() {
        return result;
    }

}
