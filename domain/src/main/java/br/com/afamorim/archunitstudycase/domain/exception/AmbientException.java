package br.com.afamorim.archunitstudycase.domain.exception;

public class AmbientException extends RuntimeException {

    public AmbientException(String message){
        super(message);
    }

    public AmbientException(String message, Exception e){
        super(message, e);
    }
}
