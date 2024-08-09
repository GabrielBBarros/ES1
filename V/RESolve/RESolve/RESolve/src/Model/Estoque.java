package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
    private Map<Item, Integer> itens;

    public Estoque() {
        this.itens = new HashMap<>();
    }

    public boolean addItem(Item item, int quantidade) {
        if (itens.containsKey(item)) {
            itens.put(item, itens.get(item) + quantidade);
        } else {
            itens.put(item, quantidade);
        }
        return true;
    }

    public boolean verificarItem(Item item) {
        return itens.containsKey(item);
    }

    public int descontarItem(Item item, int quantidade) {
        if (verificarItem(item) && itens.get(item) >= quantidade) {
            itens.put(item, itens.get(item) - quantidade);
            return itens.get(item);
        } else {
            System.out.println("Não há itens suficientes no estoque.");
            return -1; 
        }
    }

    public int retirarItem(Item item) {
        if (verificarItem(item)) {
            int quantidade = itens.get(item);
            itens.remove(item);
            return quantidade;
        } else {
            System.out.println("Item não encontrado no estoque.");
            return -1; 
        }
    }

    public void mostrarEstoque() {
        for (Map.Entry<Item, Integer> entry : itens.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue() + " unidades");
        }
    }
    
    public void mostrarEstoqueFaltante() {
        for (Map.Entry<Item, Integer> entry : itens.entrySet()) {
            if (entry.getValue() <= 0) {
                System.out.println(entry.getKey().getNome() + ": Produto em falta");
            } else {
                System.out.println(entry.getKey().getNome() + ": " + entry.getValue() + " unidades");
            }
        }
    }

	public Item[] getItens() {
		// TODO Auto-generated method stub
		return null;
	}

}
