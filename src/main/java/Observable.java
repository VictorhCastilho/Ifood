package main.java;

public interface Observable {
    void adicionarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();
}

