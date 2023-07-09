
package javaapplication7;

import java.util.ArrayList;
import java.util.List;

class Pacote implements Observable {
    private String codigo;
    private String status;
    private List<Observer> observadores;

    public Pacote(String codigo) {
        this.codigo = codigo;
        this.observadores = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers("Status do pacote " + codigo + " atualizado para: " + status);
    }

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notifyObservers(String mensagem) {
        for (Observer observer : observadores) {
            observer.update(mensagem);
        }
    }
}

