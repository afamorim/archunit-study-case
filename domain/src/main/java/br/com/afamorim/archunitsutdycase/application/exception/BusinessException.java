package br.com.afamorim.archunitsutdycase.application.exception;

public class BusinessException extends Exception {

    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Exception e){
        super(mensagem, e);
    }

}
