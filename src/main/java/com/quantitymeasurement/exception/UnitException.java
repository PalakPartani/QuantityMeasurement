package com.quantitymeasurement.exception;

public class UnitException extends RuntimeException {

    public UnitException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        NEGATIVE_VALUE;
    }

    public ExceptionType type;
}
