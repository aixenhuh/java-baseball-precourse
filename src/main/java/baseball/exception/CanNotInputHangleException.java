package baseball.exception;

public class CanNotInputHangleException extends RuntimeException{
    public CanNotInputHangleException() {
    }

    public CanNotInputHangleException(String message)  {
        super(message);
    }
}
