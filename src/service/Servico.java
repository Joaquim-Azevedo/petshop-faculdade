package service;

import model.Animal;

public abstract class Servico {
    
    private String nome;
    private Double precoBase;

    public abstract Double calcularPreco(Animal animal);

    public Servico() {
    }

    public Servico(String nome, Double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Servico [nome=" + nome + ", precoBase=" + precoBase + "]";
    }

}
