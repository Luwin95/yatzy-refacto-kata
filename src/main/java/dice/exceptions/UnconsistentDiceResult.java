package dice.exceptions;

public class UnconsistentDiceResult extends Exception{
    private static final String DEFAULT_MESSAGE = "Unconsistent dice result. Dice result should be an integer between 1 and 6";

    public UnconsistentDiceResult() {
        super(DEFAULT_MESSAGE);
    }
}
