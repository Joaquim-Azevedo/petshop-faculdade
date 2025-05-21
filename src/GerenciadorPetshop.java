import java.util.HashSet;
import java.util.Set;

import model.Animal;
import model.Cachorro;
import model.CorOlhos;
import model.Gato;
import model.OutroAnimal;
import model.Porte;
import service.Banho;
import service.ConsultaVeterinaria;
import service.Servico;
import service.Tosa;

public class GerenciadorPetshop {
    public static void main(String[] args) throws Exception {
      
        // Servico banho = new Banho("Pet Spa", 100D);
        // Servico tosa = new Tosa("Trimmer Pet", 80D);
        // Servico consulta = new ConsultaVeterinaria("Medical Pet", 120D);

        // Animal c1 = new Cachorro("Gugu", "Pitbull", 7, "Josias", Porte.GRANDE);
        // Animal c2 = new Cachorro("Porronto", "Dachshund", 12, "Junior", Porte.MEDIO);
        // Animal c3 = new Cachorro("Thor", "", 3, "Matheus", Porte.PEQUENO);
        // Animal ceh = new Cachorro("Thor", "Pinscher", 7, "Joca", Porte.PEQUENO);
        // Animal g1 = new Gato("Joca", "", 5, "Maria", CorOlhos.AZUL);

        // banho.calcularPreco(c1);
        // tosa.calcularPreco(c1);
        // consulta.calcularPreco(c1);

        Set<Animal> animais = new HashSet<>();
            animais.add(new Cachorro("Gugu", "Pitbull", 7, "Josias", Porte.GRANDE));
            animais.add(new Cachorro("Porronto", "Dachshund", 12, "Junior", Porte.MEDIO));
            animais.add(new Cachorro("Thor", "Yorkshire", 3, "Matheus", Porte.PEQUENO));
            animais.add(new Cachorro("Junior", "Pinscher", 7, "Pedro", Porte.PEQUENO)); // Porte igual
            animais.add(new Gato("Joca", "", 5, "Maria", CorOlhos.AZUL));
            animais.add(new Gato("Fifi", "Siamês", 7, "Maria", CorOlhos.AZUL)); // Cor dos olhos iguais
            animais.add(new OutroAnimal("Jorge", "Puro-sangue",  10, "Emílio", "Cavalo"));
            animais.add(new OutroAnimal("Jorge", "Puro-sangue",  10, "Emílio", "Cavalo")); // Idêntico
            
        // Teste hashCode e equals
        for (Animal animal : animais) {
            System.out.println("----------- " + animal.getNome() + " -----------");
            servicoCompleto(animal);
            System.out.println();
        }
    }

    // Classe estática para reduzir repetição de código
    public static void servicoCompleto(Animal animal) {
        Servico banho = new Banho("Pet Spa", 100D);
        Servico tosa = new Tosa("Trimmer Pet", 80D);
        Servico consulta = new ConsultaVeterinaria("Medical Pet", 100D);

        banho.calcularPreco(animal);
        tosa.calcularPreco(animal);
        consulta.calcularPreco(animal);
    }

}
