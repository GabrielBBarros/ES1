package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurante {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        
        Item tomate = new Item("Tomate", "Tomate fresco", 100);
        Item cebola = new Item("Cebola", "Cebola branca", 50);
        Item laranja = new Item("Laranja", "Laranja fresca", 30);
        Item cola = new Item("Cola", "Cola bebida", 20);
        
        estoque.addItem(tomate, 50);
        estoque.addItem(cebola, 20);
        estoque.addItem(laranja, 20);
        estoque.addItem(cola, 5);
        
        System.out.println("Estoque inicial:");
        estoque.mostrarEstoque();
        
        Receita receitaSaladaTomate = new Receita(Arrays.asList(tomate, tomate));
        Receita receitaSopaCebola = new Receita(Arrays.asList(cebola, cebola, cebola));
        
        Prato saladaTomate = new Prato("Salada de Tomate", 12.50, "Salada com tomates frescos", estoque, receitaSaladaTomate);
        Prato sopaCebola = new Prato("Sopa de Cebola", 15.00, "Sopa feita com cebolas brancas", estoque, receitaSopaCebola);
        Bebida sucoLaranja = new Bebida("Suco de Laranja", 8.00, "Suco natural de laranja", estoque, laranja);
        Bebida refrigerante = new Bebida("Refrigerante", 5.00, "Refrigerante de cola", estoque, cola);
        
        Conta conta1 = new Conta(null, "Cartão de Crédito");
        Mesa mesa1 = new Mesa(1, conta1, new ArrayList<>());
        conta1.setMesa(mesa1);
        
        Pedido pedido1 = new Pedido(1, conta1);
        pedido1.addPratoPedido(saladaTomate);
        pedido1.addBebidaPedido(sucoLaranja);
        
        Pedido pedido2 = new Pedido(2, conta1);
        pedido2.addPratoPedido(sopaCebola);
        pedido2.addBebidaPedido(refrigerante);
        
        mesa1.addPedido(pedido1);
        mesa1.addPedido(pedido2);
        
        System.out.println("\nPedidos da Mesa 1:");
        pedido1.listarPedidos();
        pedido2.listarPedidos();
        
        System.out.println("\nEstoque após os pedidos:");
        estoque.mostrarEstoque();
        
        conta1.calcularValorTotal();
        
        conta1.mensagemEstadoConta();
        
        mesa1.verificarSeMesaPaga();
        
        System.out.println("\nPagando a conta...");
        conta1.setPaga(true);
        
        conta1.mensagemEstadoConta();
        
        mesa1.verificarSeMesaPaga();
        
        mesa1.liberarMesa();
        
        mesa1.verificarSeMesaPaga();
        
        System.out.println("\nEstoque final:");
        estoque.mostrarEstoque();
    }
}
