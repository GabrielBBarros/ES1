package Model;

public class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException(String message) {
        super(message);
    }
}