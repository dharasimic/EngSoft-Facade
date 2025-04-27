package br.fastfood.model;

import java.util.Arrays;
import java.util.List;

public class Combo {
    private final ItemCombo burger;
    private final ItemCombo bebida;
    private final ItemCombo sobremesa;

    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public List<ItemCombo> getItens() {
        return Arrays.asList(burger, bebida, sobremesa);
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
}