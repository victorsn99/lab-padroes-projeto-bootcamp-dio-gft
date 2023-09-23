package com.lab.padroesprojeto.singleton;

/**
 * Exemplo de singleton "Apressado". Quando precisar ser utilizado, já está instanciado.
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
