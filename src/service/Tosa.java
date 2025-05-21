package service;

import java.util.Objects;

import model.Animal;

public class Tosa extends Servico {
    
    public Tosa() {

    }

    public Tosa(String nome, Double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public Double calcularPreco(Animal animal) {
        String raca = animal.getRacaTipo();
        Double precoFinal = this.getPrecoBase();

        switch (raca.toLowerCase()) {
            case "pitbull":
            case "shihtzu":
            case "pastor alemao":
                precoFinal += 80;
                break;
            default:
                precoFinal += 40;
                break;
        }   

        System.out.println("Serviço: " + this);
        System.out.println("Animal: " + animal);
        System.out.println("Preço final: R$ " + precoFinal);
        System.out.println("------------------------------");

        return precoFinal;
    }

    // Equals e HashCode por NOME -> impede de abrir outra "loja"/serviço com o mesmo nome
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Banho)) return false;
        Banho other = (Banho) obj;
        return Objects.equals(getNome(), other.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Tosa [nome=" + getNome() + ", precoBase=" + getPrecoBase() + "]";
    }

}
