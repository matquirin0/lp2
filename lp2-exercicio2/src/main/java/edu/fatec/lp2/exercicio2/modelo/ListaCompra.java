package edu.fatec.lp2.exercicio2.modelo;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ListaCompra implements Calculavel {

    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int qtdeItens;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
        this.qtdeItens = 0;
    }

    public void incluir(ItemCompra item) {
        if (qtdeItens < qtdeMax) {
            itensCompra[qtdeItens] = item;
            qtdeItens++;
        } else {
            System.out.println("Lista cheia! Nao foi possivel incluir " + item.getProduto());
        }
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (int i = 0; i < qtdeItens; i++) {
            total = total + itensCompra[i].calcularPreco();
        }
        return total;
    }

    public ItemCompra[] getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ItemCompra[] itensCompra) {
        this.itensCompra = itensCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }
}
