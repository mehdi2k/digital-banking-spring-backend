package ma.mehdi.ebankingbackend.exceptions;

public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String message){
        super(message);
    }
}
