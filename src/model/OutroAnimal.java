package model;

import java.util.Objects;

public class OutroAnimal extends Animal {

    private String tipoEspecifico;

    public OutroAnimal() {

    }

    public OutroAnimal(String nome, String racaTipo, Integer idade,
        String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    public String getTipoEspecifico() {
        return tipoEspecifico;
    }

    public void setTipoEspecifico(String tipoEspecifico) {
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoEspecifico);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        OutroAnimal other = (OutroAnimal) obj;
        return Objects.equals(tipoEspecifico, other.tipoEspecifico);
    }

    @Override
    public String toString() {
        return "OutroAnimal [tipoEspecifico=" + this.tipoEspecifico + ", nome=" + getNome() + ", racaTipo=" + getRacaTipo()
                + ", idade=" + getIdade() + ", proprietario=" + getProprietario() + "]";
    }

    
    
}
