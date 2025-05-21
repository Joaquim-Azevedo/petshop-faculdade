package model;

import java.util.Objects;

public abstract class Animal {

    private String nome;
    private String racaTipo;
    private Integer idade;
    private String proprietario;

    public Animal(String nome, String racaTipo, Integer idade, String proprietario) {
        this.nome = nome;
        this.racaTipo = racaTipo;
        this.idade = idade;
        this.proprietario = proprietario;
    }

    public Animal(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRacaTipo() {
        return racaTipo;
    }

    public void setRacaTipo(String racaTipo) {
        this.racaTipo = racaTipo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, racaTipo, idade, proprietario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return Objects.equals(nome, other.nome) && Objects.equals(racaTipo, other.racaTipo)
                && Objects.equals(idade, other.idade) && Objects.equals(proprietario, other.proprietario);
    }

    @Override
    public String toString() {
        return "Animal[nome=" + nome + ", racaTipo=" + racaTipo + ", idade=" + idade + ", proprietario=" + proprietario
                + "]";
    }
}
