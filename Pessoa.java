import java.util.*;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private String sexo;

    // Construtor
    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}

