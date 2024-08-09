package Model;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private Conta conta;
    private List<Pedido> pedidos;

    public Mesa(int numero, Conta conta, List<Pedido> pedidos) {
        this.numero = numero;
        this.conta = conta;
        this.pedidos = pedidos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public int addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido.getNumero();
    }

    public void liberarMesa() {
        pedidos.clear();
        conta.setPaga(false);
        System.out.println("A mesa " + numero + " foi liberada.");
    }

    public void verificarSeMesaPaga() {
        if (conta.estaPaga()) {
            System.out.println("A mesa " + numero + " está com a conta paga.");
        } else {
            System.out.println("A mesa " + numero + " ainda não está com a conta paga.");
        }
    }
}
