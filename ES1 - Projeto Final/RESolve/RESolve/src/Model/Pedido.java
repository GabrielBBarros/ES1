package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorPedidos = 0;
    private int numero;
    private Conta conta;
    private PratosPedidos pratosPedidos;
    private BebidasPedidos bebidasPedidos;

    public Pedido(Conta conta) {
        this.conta = conta;
        this.numero = ++contadorPedidos;
        this.pratosPedidos = new PratosPedidos(this);
        this.bebidasPedidos = new BebidasPedidos(this);
    }

    public int getNumero() {
        return numero;
    }

    public void addPratoPedido(Prato prato) {
        pratosPedidos.addPrato(prato);
        System.out.println("Prato " + prato.getNome() + " adicionado ao pedido.");
    }

    public void addBebidaPedido(Bebida bebida) {
        bebidasPedidos.addBebida(bebida);
        System.out.println("Bebida " + bebida.getNome() + " adicionada ao pedido.");
    }

    public List<String> listarDetalhesPedido() {
        List<String> detalhes = new ArrayList<>();
        detalhes.add("Número do Pedido: " + numero);
        detalhes.add("Pratos Pedidos:");
        for (Prato prato : pratosPedidos.getPratos()) {
            detalhes.add("- " + prato.getNome() + ": " + prato.getDescricao() + " - Preço: " + prato.getPreco());
        }
        detalhes.add("Bebidas Pedidas:");
        for (Bebida bebida : bebidasPedidos.getBebidas()) {
            detalhes.add("- " + bebida.getNome() + ": " + bebida.getDescricao() + " - Preço: " + bebida.getPreco());
        }
        return detalhes;
    }

    public PratosPedidos getPratosPedidos() {
        return pratosPedidos;
    }

    public BebidasPedidos getBebidasPedidos() {
        return bebidasPedidos;
    }

    public Conta getConta() {
        return conta;
    }
}
