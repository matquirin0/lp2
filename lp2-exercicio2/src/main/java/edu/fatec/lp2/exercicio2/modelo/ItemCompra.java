package edu.fatec.lp2.exercicio2.modelo;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ItemCompra implements Calculavel {

    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.quantidade = 1;
        setDesconto(desconto);
    }

    @Override
    public double calcularPreco() {
        double total = produto.getPreco() * quantidade;
        return total - (total * desconto / 100);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto < 0) {
            this.desconto = 0;
        } else if (desconto > produto.getDescontoMaximo()) {
            this.desconto = produto.getDescontoMaximo();
        } else {
            this.desconto = desconto;
        }
    }
}
