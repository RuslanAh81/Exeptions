public class MyException extends  Exception{
    public MyException(String message){
        super(message);
    }

}
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message){
        super (message);
    }
}
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}
class NumberSummException extends Exception {
    public NumberSummException(String message) {
        super(message);
    }
}