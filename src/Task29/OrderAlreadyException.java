package Task29;

public class OrderAlreadyException extends Exception{
    public OrderAlreadyException(int ex){
        super("Task29.Order is already added at " + ex + " table");
    }
}
