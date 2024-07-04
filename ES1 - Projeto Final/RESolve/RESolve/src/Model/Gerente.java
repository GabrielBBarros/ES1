package Model;

import java.util.List;

public class Gerente {
    private Estoque estoque;
    private String senha;

    public Gerente(Estoque estoque, String senha) {
        this.estoque = estoque;
        this.senha = senha;
    }

    private boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public Prato criarPrato(String nome, double preco, String descricao, List<Ingrediente> ingredientes, String senha) throws IngredienteInsuficienteException, SenhaIncorretaException {
        if (!autenticar(senha)) {
            throw new SenhaIncorretaException("Senha incorreta!");
        }

        Prato prato = new Prato(nome, preco, descricao, estoque, ingredientes);
        System.out.println("Prato criado: " + nome);
        return prato;
    }

    public void removerPrato(Cozinha cozinha, Prato prato, String senha) throws SenhaIncorretaException {
        if (!autenticar(senha)) {
            throw new SenhaIncorretaException("Senha incorreta!");
        }

        cozinha.removerPrato(prato);
        System.out.println("Prato removido: " + prato.getNome());
    }

    public Bebida criarBebida(String nome, double preco, String descricao, List<ItemEspecialBebida> itensEspeciais, String senha) throws ItemEspecialInsuficienteException, SenhaIncorretaException {
        if (!autenticar(senha)) {
            throw new SenhaIncorretaException("Senha incorreta!");
        }

        Bebida bebida = new Bebida(nome, preco, descricao, estoque, itensEspeciais);
        System.out.println("Bebida criada: " + nome);
        return bebida;
    }

    public void removerBebida(Bar bar, Bebida bebida, String senha) throws SenhaIncorretaException {
        if (!autenticar(senha)) {
            throw new SenhaIncorretaException("Senha incorreta!");
        }

        bar.removerBebida(bebida);
        System.out.println("Bebida removida: " + bebida.getNome());
    }
}
