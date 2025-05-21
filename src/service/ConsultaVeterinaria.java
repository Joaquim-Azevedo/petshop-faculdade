package service;

import java.util.Objects;

import model.Animal;
import model.Cachorro;
import model.Gato;
import model.OutroAnimal;

public class ConsultaVeterinaria extends Servico {
    
    public ConsultaVeterinaria() {

    }

    public ConsultaVeterinaria(String nome, Double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public Double calcularPreco(Animal animal) {

        Double precoFinal = this.getPrecoBase();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            switch (cachorro.getPorte()) {
                case PEQUENO:
                    precoFinal += 60;
                    break;
                case MEDIO:
                    precoFinal += 90;
                    break;
                case GRANDE:
                    precoFinal += 150;
                    break;
                default:
                    System.out.println("Porte inválido.");
                    break;
            }
            
        } else if (animal instanceof Gato){
            precoFinal += 40;

        } else if (animal instanceof OutroAnimal) {
            precoFinal += 150;
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
        return "Consulta [nome=" + getNome() + ", precoBase=" + getPrecoBase() + "]";
    }
}
