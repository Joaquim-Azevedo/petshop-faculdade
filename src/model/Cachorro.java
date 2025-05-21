package model;

import java.util.Objects;

public class Cachorro extends Animal{
    
    private Porte porte;

    public Cachorro() {

    }

    public Cachorro(String nome, String racaTipo, Integer idade, String proprietario, Porte porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(porte);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Cachorro other = (Cachorro) obj;
        return porte == other.porte;
    }

    @Override
    public String toString() {
        return "Cachorro [porte=" + porte + ", nome=" + getNome() + ", racaTipo=" + getRacaTipo() + 
        ", idade=" + getIdade()
        + ", proprietario=" + getProprietario() + "]";
    }
    
}
