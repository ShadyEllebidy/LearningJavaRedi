package org.rediSchool.exception;

public class CSVexception extends Exception{
    private String message;
    public CSVexception(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
