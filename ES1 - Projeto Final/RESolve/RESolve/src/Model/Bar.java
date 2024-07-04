package Model;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bebida> bebidas;

    public Bar() {
        this.bebidas = new ArrayList<>();
    }

    public void addBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void removerBebida(Bebida bebida) {
        bebidas.remove(bebida);
    }

    public void listarBebidas() {
        System.out.println("Lista de Bebidas no Bar:");
        for (Bebida bebida : bebidas) {
            System.out.println("Nome: " + bebida.getNome());
            System.out.println("Descri��o: " + bebida.getDescricao());
            System.out.println("Pre�o: " + bebida.getPreco());
            System.out.println("--------------------------");
        }
    }
}