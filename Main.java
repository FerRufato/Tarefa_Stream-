import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Lista com pessoas e seus sexos
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "feminino"));
        pessoas.add(new Pessoa("José", "masculino"));
        pessoas.add(new Pessoa("Ana", "feminino"));
        pessoas.add(new Pessoa("Carlos", "masculino"));
        pessoas.add(new Pessoa("Fernanda", "feminino"));
        pessoas.add(new Pessoa("Paulo", "masculino"));

        // Filtrando somente as mulheres usando expressão lambda e if-else
        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> {
                    if (pessoa.getSexo().equalsIgnoreCase("feminino")) {
                        return true;  // A pessoa é mulher
                    } else {
                        return false; // A pessoa não é mulher
                    }
                })
                .collect(Collectors.toList());

        // Exibir as mulheres
        System.out.println("Mulheres cadastradas:");
        if (mulheres.isEmpty()) {
            System.out.println("Nenhuma mulher cadastrada.");
        } else {
            mulheres.forEach(System.out::println); // Imprime as mulheres na lista
        }
    }
}
