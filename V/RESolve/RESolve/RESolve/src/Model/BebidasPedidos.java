package Model;

import java.util.ArrayList;
import java.util.List;

public class BebidasPedidos {
    private int pedido;
    private List<Bebida> bebidas;

    public BebidasPedidos() {
        bebidas = new ArrayList<>();
    }

    public int addBebida(Bebida bebida) {
        bebidas.add(bebida);
        return pedido;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }
}
