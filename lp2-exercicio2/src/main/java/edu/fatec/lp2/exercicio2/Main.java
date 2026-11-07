package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.modelo.ItemCompra;
import edu.fatec.lp2.exercicio2.modelo.ListaCompra;
import edu.fatec.lp2.exercicio2.modelo.Produto;
import edu.fatec.lp2.exercicio2.modelo.Supermercado;

public class Main {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Supermercado do Seu Astolfo");

        Produto arroz = new Produto(supermercado);
        arroz.setNome("Arroz");
        arroz.setUnidade("pacote 5kg");
        arroz.setDescricao("Arroz branco tipo 1");
        arroz.setPreco(25.0);
        arroz.setDescontoMaximo(10);

        Produto feijao = new Produto(supermercado);
        feijao.setNome("Feijao");
        feijao.setUnidade("pacote 1kg");
        feijao.setDescricao("Feijao carioca");
        feijao.setPreco(8.0);
        feijao.setDescontoMaximo(5);

        Produto cafe = new Produto(supermercado);
        cafe.setNome("Cafe");
        cafe.setUnidade("pacote 500g");
        cafe.setDescricao("Cafe torrado e moido");
        cafe.setPreco(18.0);
        cafe.setDescontoMaximo(15);

        ItemCompra item1 = new ItemCompra(arroz, 10);
        item1.setQuantidade(2);

        ItemCompra item2 = new ItemCompra(feijao, 20);
        item2.setQuantidade(3);

        ItemCompra item3 = new ItemCompra(cafe, 0);

        ListaCompra lista = new ListaCompra(2);
        lista.incluir(item1);
        lista.incluir(item2);
        lista.incluir(item3);

        System.out.println("Supermercado: " + supermercado.getNome());
        System.out.println(item1.getProduto() + ": R$ " + item1.calcularPreco());
        System.out.println(item2.getProduto() + ": R$ " + item2.calcularPreco());
        System.out.println("Total da lista: R$ " + lista.calcularPreco());
    }
}
