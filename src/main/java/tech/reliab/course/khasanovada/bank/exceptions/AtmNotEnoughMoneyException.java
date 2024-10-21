package tech.reliab.course.khasanovada.bank.exceptions;

public class AtmNotEnoughMoneyException extends Exception {
    public AtmNotEnoughMoneyException(String message) {
        super(message);
    }
}
