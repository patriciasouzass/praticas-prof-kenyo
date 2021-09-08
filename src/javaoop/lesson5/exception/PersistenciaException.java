package javaoop.lesson5.exception;

public class PersistenciaException extends RuntimeException{

    public PersistenciaException(String mensagem){
        super(mensagem);
    }
}
