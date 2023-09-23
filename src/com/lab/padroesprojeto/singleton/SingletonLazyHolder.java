package com.lab.padroesprojeto.singleton;

/**
 * Exemplo de singleton "Lazy Holder". Classe "InstanceHolder" encapsula a instância.
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
