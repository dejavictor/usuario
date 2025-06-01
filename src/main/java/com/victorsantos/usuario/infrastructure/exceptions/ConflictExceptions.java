package com.victorsantos.usuario.infrastructure.exceptions;

public class ConflictExceptions extends RuntimeException {

    public ConflictExceptions(String mensagem){
        super(mensagem);
    }

    public ConflictExceptions(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
