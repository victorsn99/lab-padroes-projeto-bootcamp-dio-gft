package com.lab.padroesprojeto.singleton;

/**
 * Exemplo de singleton "Preguiçoso". É instanciado apenas quando precisar ser utilizado.
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
