package Bank;

public class InsufficientBalance extends RuntimeException{
    public InsufficientBalance(String message) {
        super(message);
    }
}
