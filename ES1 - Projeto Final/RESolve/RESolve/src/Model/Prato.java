package Model;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private double preco;
    private String descricao;
    private Estoque estoque;
    private List<Ingrediente> ingredientes;

    public Prato(String nome, double preco, String descricao, Estoque estoque, List<Ingrediente> ingredientes) throws IngredienteInsuficienteException {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.ingredientes = new ArrayList<>();

        if (!estoque.verificarIngredientes(ingredientes)) {
            throw new IngredienteInsuficienteException("Ingredientes insuficientes para o prato: " + nome);
        }

        estoque.descontarIngredientes(ingredientes);
        this.ingredientes.addAll(ingredientes);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        if (ingrediente != null) {
            ingredientes.add(ingrediente);
        } else {
            throw new IllegalArgumentException("Ingrediente n�o pode ser nulo.");
        }
    }

    // Novo m�todo
    public void removeIngrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }
}
