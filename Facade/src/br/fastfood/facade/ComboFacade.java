package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.ItemCombo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {

    private Combo combo;

public void criarCombo(int codigo) {
    switch (codigo) {
        case 1 -> combo = new Combo(
                new Burger("Big Cheddar", 15.0),
                new Bebida("Coca-Cola", 5.0),
                new Sobremesa("Sorvete", 7.0)
        );
        case 2 -> combo = new Combo(
                new Burger("Chicken Burger", 12.0),
                new Bebida("Suco de Laranja", 6.0),
                new Sobremesa("Brownie", 8.0)
        );
        default -> {
            System.out.println("Código inválido!");
            combo = null;
        }
    }
}

    public void exibirItens() {
        if (combo != null) {
            System.out.println("Itens do Combo:");
            for (ItemCombo item : combo.getItens()) {
                System.out.println(item.getNome() + " - R$ " + item.getPreco());
            }
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }

    public double getPrecoTotal() {
        return combo != null ? combo.getPrecoTotal() : 0.0;
    }

}
