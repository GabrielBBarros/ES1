package Model;

public class Pedido {
    private int numero;
    private Conta conta;
    private PratosPedidos pratosPedidos;
    private BebidasPedidos bebidasPedidos;

    public Pedido(int numero, Conta conta) {
        this.numero = numero;
        this.conta = conta;
        this.pratosPedidos = new PratosPedidos();
        this.bebidasPedidos = new BebidasPedidos();
    }

    public int addPratoPedido(Prato prato) {
        if (prato.verificarItem()) {
            prato.descontarItem();
            return pratosPedidos.addPrato(prato);
        } else {
            System.out.println("Ingredientes insuficientes para " + prato.getNome());
            return -1;
        }
    }

    public int addBebidaPedido(Bebida bebida) {
        if (bebida.verificarItem()) {
            bebida.descontarItem();
            return bebidasPedidos.addBebida(bebida);
        } else {
            System.out.println("Ingredientes insuficientes para " + bebida.getNome());
            return -1;
        }
    }

    public void listarPedidos() {
        System.out.println("Pratos:");
        for (Prato prato : pratosPedidos.getPratos()) {
            System.out.println(prato);
        }

        System.out.println("Bebidas:");
        for (Bebida bebida : bebidasPedidos.getBebidas()) {
            System.out.println(bebida);
        }
    }

    public int getNumero() {
        return numero;
    }

    public double calcularValor() {
        double valorTotal = 0.0;
        for (Prato prato : pratosPedidos.getPratos()) {
            valorTotal += prato.getPreco();
        }
        for (Bebida bebida : bebidasPedidos.getBebidas()) {
            valorTotal += bebida.getPreco();
        }
        return valorTotal;
    }
}
