package model;

import java.util.Objects;

public class Gato extends Animal {
    
    private CorOlhos corOlhos;

    public Gato() {

    }

    public Gato(String nome, String racaTipo, Integer idade, String proprietario, 
        CorOlhos corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    public CorOlhos getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(CorOlhos corOlhos) {
        this.corOlhos = corOlhos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(corOlhos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Gato other = (Gato) obj;
        return corOlhos == other.corOlhos;
    }

    @Override
    public String toString() {
        return "Gato [corOlhos=" + corOlhos + ", nome=" + getNome() + ", racaTipo=" + getRacaTipo()
                + ", idade=" + getIdade() + ", proprietario=" + getProprietario() + "]";
    }
    
}
