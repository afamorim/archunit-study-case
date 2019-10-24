package br.com.afamorim.archunitsutdycase.application.exception;

public class AmbientException extends RuntimeException {

    public AmbientException(String message){
        super(message);
    }

    public AmbientException(String message, Exception e){
        super(message, e);
    }
}
